package main.java.com.workjam.objects;

import main.java.com.workjam.objects.User.User.Permission;

public class Filter {

    /**
     * The filter object is used to filter users out of the list according to different parameters.
     * Fields:
     *  active
     *      Null: All users are returned (no filter)
     *      True: Only active users are returned
     *      False: Only inactive users are returned.
     *  permission
     *      Employee: All users are returned (From a business case point of view, we assume that a manager and an admin have by default the lower permission)
     *      Manager: The admins and managers have returned.
     *      Admin: Admins are returned.
     */

    private final Boolean active;
    private final Permission permission;

    public Filter(Boolean active, Permission permission) {
        this.active = active;
        this.permission = permission;
    }

    public Boolean isActive() {
        return active;
    }

    public Permission getPermission() {
        return permission;
    }
}
