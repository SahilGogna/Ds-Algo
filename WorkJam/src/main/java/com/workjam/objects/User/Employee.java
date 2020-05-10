package main.java.com.workjam.objects.User;


import java.util.UUID;

public class Employee extends User {

    public Employee() {
        this.uuid = UUID.randomUUID();
    }

    @Override
    public Permission getPermission() {
        return Permission.EMPLOYEE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("Id: ").append(uuid)
            .append(", Name: ").append(name)
            .append(", IsActive: ").append(active)
            .append(", Permission: ").append(getPermission());
        return sb.toString();
    }
}
