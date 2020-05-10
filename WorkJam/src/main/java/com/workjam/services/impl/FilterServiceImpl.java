package main.java.com.workjam.services.impl;

import main.java.com.workjam.objects.Filter;
import main.java.com.workjam.objects.User.User;
import main.java.com.workjam.services.FilterService;

import java.util.List;
import java.util.stream.Collectors;

public class FilterServiceImpl implements FilterService {
    @Override
    public List<User> filter(Filter filter, List<User> users) {

        List<User> filteredUsers = users;
        if (filter != null && users != null) {

            if (filter.getPermission() != null) {
                filteredUsers = users.stream()
                        .filter((user) -> isPermissionMatch(filter.getPermission(), user.getPermission()))
                        .collect(Collectors.toList());
            }

            if (filter.isActive() != null) {
                filteredUsers = users.stream()
                        .filter((user) -> filter.isActive() == user.isActive())
                        .collect(Collectors.toList());
            }
        }

        return filteredUsers;
    }

    private boolean isPermissionMatch(User.Permission askedPermission, User.Permission userPermission) {
        if (askedPermission == User.Permission.MANAGER) {
            return userPermission == User.Permission.MANAGER || userPermission == User.Permission.ADMIN;
        } else if (askedPermission == User.Permission.ADMIN) {
            return userPermission == User.Permission.ADMIN;
        } else {
            return true;
        }
    }
}
