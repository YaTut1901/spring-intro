package spring.project.service;

import java.util.List;
import spring.project.model.User;

public interface UserService {
    void add(User user);

    User get(Long id);

    List<User> listUsers();
}
