package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    User getUserById(long id);
    void saveUser(User user);
    void deleteUser(Long id);

}
