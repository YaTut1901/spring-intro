package spring.project.dao;

import java.util.List;
import spring.project.model.User;

public interface UserDao {
    void add(User user);

    User get(Long id);

    List<User> getAll();
}
