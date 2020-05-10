package main.java.com.workjam.objects.User;

import java.util.UUID;

public abstract class User {

    public enum Permission {
        EMPLOYEE,
        MANAGER,
        ADMIN
    }

    protected UUID uuid;
    protected String name;
    protected boolean active;

    public UUID getUuid() {
        return uuid;
    }

    public abstract Permission getPermission();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
