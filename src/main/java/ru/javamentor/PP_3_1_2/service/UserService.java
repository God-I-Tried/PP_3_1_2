package ru.javamentor.PP_3_1_2.service;



import ru.javamentor.PP_3_1_2.model.User;
import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getListOfUsers();

    public void deleteUser(long id);

    void editUser(User user);
}
