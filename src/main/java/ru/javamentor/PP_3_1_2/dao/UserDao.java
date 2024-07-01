package ru.javamentor.PP_3_1_2.dao;


import ru.javamentor.PP_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> getListOfUsers();

    void deleteUser(long id);

    void editUser(User user);

}
