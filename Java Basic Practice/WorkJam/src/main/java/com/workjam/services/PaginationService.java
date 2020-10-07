package main.java.com.workjam.services;

import main.java.com.workjam.objects.Page;
import main.java.com.workjam.objects.User.User;

import java.util.List;

public interface PaginationService {

    public List<User> paginate(List<User> users, Page page);
}
