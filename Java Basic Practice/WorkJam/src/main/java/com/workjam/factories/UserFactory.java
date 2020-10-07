package main.java.com.workjam.factories;


import main.java.com.workjam.objects.User.Admin;
import main.java.com.workjam.objects.User.Employee;
import main.java.com.workjam.objects.User.Manager;
import main.java.com.workjam.objects.User.User;

public class UserFactory {

    public enum UserType {
        Employee,
        Manager,
        Admin
    }

    private static char letter = 'A';

    /**
     * Factory method to create any type of user
     *
     * @param type      The type of the user that should be created.
     * @param reportees The employees that will be reporting to the new user.
     * @return The newly created user with all fields initialized.
     */
    public static User getUser(UserType type, User... reportees) {
        User user = null;
        switch (type) {
            case Employee:
                user = new Employee();
                break;
            case Manager:
                user = new Manager((Employee[]) reportees);
                break;
            case Admin:
                user = new Admin((Manager[]) reportees);
                break;
            default:
                break;
        }
        user.setName(getRandomName());
        user.setActive(getRandomStatus());
        return user;
    }

    private static String getRandomName() {
        return new StringBuilder().append(nextLetter()).append(nextLetter()).append(nextLetter()).append(nextLetter()).toString();
    }

    private static char nextLetter() {
        if (letter >= 'Z') {
            letter = 'A';
        }
        return letter++;
    }

    private static Boolean getRandomStatus() {
        return Math.random() * 10 > 4;
    }
}
