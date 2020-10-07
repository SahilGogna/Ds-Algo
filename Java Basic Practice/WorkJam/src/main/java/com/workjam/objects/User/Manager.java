package main.java.com.workjam.objects.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class Manager extends User {

    private Set<Employee> employeeList = new HashSet<>();

    public Manager(Employee... employees) {
        this.uuid = UUID.randomUUID();
        employeeList.addAll(Arrays.asList(employees));
    }

    @Override
    public Permission getPermission() {
        return Permission.MANAGER;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("Id: ").append(uuid)
            .append(", Name: ").append(name)
            .append(", IsActive: ").append(active)
            .append(", Permission: ").append(getPermission())
            .append(", Supervises: ").append(employeeList.stream().map(User::getUuid).collect(Collectors.toSet()).toString());
        return sb.toString();
    }

    public Set<Employee> getEmployeeList() {
        return employeeList;
    }
}
