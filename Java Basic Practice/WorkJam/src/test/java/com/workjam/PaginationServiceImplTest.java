package test.java.com.workjam;

import main.java.com.workjam.objects.Page;
import main.java.com.workjam.objects.User.Employee;
import main.java.com.workjam.objects.User.User;
import main.java.com.workjam.services.impl.PaginationServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaginationServiceImplTest {

    @Test
    public void paginate() {
        PaginationServiceImpl paginationService = new PaginationServiceImpl();
        Page page = new Page(0, 2);
        List<User> list = new ArrayList<>();
        list.add(new Employee());
        list.add(new Employee());
        List<User> output = paginationService.paginate(list, page);
        assertEquals(2, output.size());
    }

    @Test
    public void paginateNegative() {
        PaginationServiceImpl paginationService = new PaginationServiceImpl();
        Page page = new Page(5, 10);
        List<User> list = new ArrayList<>();
        list.add(new Employee());
        list.add(new Employee());
        List<User> output = paginationService.paginate(list, page);
        assertEquals(2, output.size());
    }
}