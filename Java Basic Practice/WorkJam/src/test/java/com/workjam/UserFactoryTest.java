package test.java.com.workjam;

import main.java.com.workjam.factories.UserFactory;
import main.java.com.workjam.objects.User.Employee;
import main.java.com.workjam.objects.User.User;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class UserFactoryTest {

    @Test
    void getUser() {
        UserFactory test = new UserFactory();
        User result = test.getUser(UserFactory.UserType.Employee, new User[0]);
        assertEquals(Employee.class, result.getClass());
    }
}
