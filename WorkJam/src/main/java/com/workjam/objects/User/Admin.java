package main.java.com.workjam.objects.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class Admin extends User {

    private Set<Manager> managerList = new HashSet<>();

    public Admin(Manager... managers) {
        this.uuid = UUID.randomUUID();
        managerList.addAll(Arrays.asList(managers));
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }
    @Override
    public Permission getPermission() {
        return Permission.ADMIN;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("Id: ").append(uuid)
            .append(", Name: ").append(name)
            .append(", IsActive: ").append(active)
            .append(", Permission: ").append(getPermission())
            .append(", Tyrannizes: ").append(managerList.stream().map(User::getUuid).collect(Collectors.toSet()).toString());
        return sb.toString();
    }

    public Set<Manager> getManagerList() {
        return managerList;
    }
}
