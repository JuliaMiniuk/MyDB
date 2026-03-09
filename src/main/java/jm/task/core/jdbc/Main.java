package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Jul", "Min", (byte) 24);
        userService.saveUser("Iv", "El", (byte) 24);
        userService.saveUser("Lar", "Tar", (byte) 29);
        userService.saveUser("Ar", "Net", (byte) 30);
        System.out.println(userService.getAllUsers());

        userService.dropUsersTable();
        userService.cleanUsersTable();

    }
}
