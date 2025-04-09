package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(long id);

    void createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);
}
