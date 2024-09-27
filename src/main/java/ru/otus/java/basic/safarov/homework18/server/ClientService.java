package ru.otus.java.basic.safarov.homework18.server;

import java.sql.SQLException;
import java.util.List;

public interface ClientService extends AutoCloseable{
    List<User> getAll();
    String getUsername(String login, String password);
    int addUser(int id, User user) throws SQLException;

    boolean isLogin(String login);

    String getRole(String username);

    boolean isUserName(String username);
}
