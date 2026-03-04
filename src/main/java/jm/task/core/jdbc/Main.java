package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        Connection connection = Util.getConnection();
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Jul", "Min", (byte) 24);
        userService.saveUser("Iv", "El", (byte) 24);
        userService.saveUser("Lar", "Tar", (byte) 29);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.dropUsersTable();
        userService.cleanUsersTable();

        Util.closeConnection(connection);
    }
}
