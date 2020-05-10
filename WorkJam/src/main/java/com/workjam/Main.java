package main.java.com.workjam;


import main.java.com.workjam.constants.ListConstants;
import main.java.com.workjam.factories.UserFactory;
import main.java.com.workjam.factories.UserFactory.UserType;
import main.java.com.workjam.objects.Filter;
import main.java.com.workjam.objects.Page;
import main.java.com.workjam.objects.User.Employee;
import main.java.com.workjam.objects.User.Manager;
import main.java.com.workjam.objects.User.User;
import main.java.com.workjam.objects.User.User.Permission;
import main.java.com.workjam.services.impl.FilterServiceImpl;
import main.java.com.workjam.services.impl.PaginationServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static Page page = new Page(0, 125);
    static Filter filter = new Filter(null, Permission.EMPLOYEE);

    public static void main(String[] args) {

        final List<User> users = new ArrayList<>();

        List<User> admins = IntStream.range(ListConstants.LOWER_BOUND, ListConstants.ADMIN_UPPER_BOUND).mapToObj(x -> {
            final List<User> managers = IntStream.range(ListConstants.LOWER_BOUND, ListConstants.MANAGER_UPPER_BOUND).mapToObj(y -> {
                final List<User> employees =
                        IntStream.range(ListConstants.LOWER_BOUND, ListConstants.EMPLOYEE_UPPER_BOUND).mapToObj(z -> UserFactory.getUser(UserType.Employee))
                                .collect(Collectors.toList());
                users.addAll(employees);
                return UserFactory.getUser(UserType.Manager, employees.stream().toArray(Employee[]::new));
            }).collect(Collectors.toList());
            users.addAll(managers);
            return UserFactory.getUser(UserType.Admin, managers.stream().toArray(Manager[]::new));
        }).collect(Collectors.toList());

        users.addAll(admins);

        FilterServiceImpl filterService = new FilterServiceImpl();
        List<User> filteredList = filterService.filter(filter, users);

        Collections.sort(filteredList, Comparator.comparing(User::getName));

        PaginationServiceImpl paginationService = new PaginationServiceImpl();
        List<User> paginatedList = paginationService.paginate(filteredList, page);
        printUsers(paginatedList);
    }

    private static void printUsers(List<User> users) {
        int userNb = 1;
        for (User user : users) {
            System.out.println(userNb++ + ". " + user);
        }
    }

}
