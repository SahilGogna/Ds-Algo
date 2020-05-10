package main.java.com.workjam.services.impl;

import main.java.com.workjam.objects.Page;
import main.java.com.workjam.objects.User.User;
import main.java.com.workjam.services.PaginationService;

import java.util.ArrayList;
import java.util.List;

public class PaginationServiceImpl implements PaginationService {
    @Override
    public List<User> paginate(List<User> users, Page page) {
        List<User> paginatedUsers = new ArrayList<>();

        if (page != null && users != null) {
            int startPosition = page.getStartPos();
            int endPosition = startPosition + page.getSize();
            int lengthOfList = users.size();

            if (startPosition > lengthOfList) {
                return paginatedUsers;
            }

            if (endPosition > lengthOfList) {
                endPosition = lengthOfList;
            }

            for (int i = startPosition; i < endPosition; i++) {
                paginatedUsers.add(users.get(i));
            }
        } else {
            paginatedUsers = users;
        }
        return paginatedUsers;
    }
}
