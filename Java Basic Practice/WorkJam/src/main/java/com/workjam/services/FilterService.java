package main.java.com.workjam.services;

import main.java.com.workjam.objects.Filter;
import main.java.com.workjam.objects.User.User;

import java.util.List;

public interface FilterService {
    List<User> filter(Filter filter, List<User> users);
}
