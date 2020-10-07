package test.java.com.workjam;

import main.java.com.workjam.objects.Filter;
import main.java.com.workjam.objects.User.Employee;
import main.java.com.workjam.objects.User.User;
import main.java.com.workjam.services.impl.FilterServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterServiceImplTest {

    @Test
    public void filter() {
        FilterServiceImpl filterService = new FilterServiceImpl();
        Filter filterObj = new Filter(null, User.Permission.EMPLOYEE);
        List<User> list = new ArrayList<>();
        list.add(new Employee());
        list.add(new Employee());
        List<User> output = filterService.filter(filterObj,list);
        assertEquals(2, output.size());
    }
}