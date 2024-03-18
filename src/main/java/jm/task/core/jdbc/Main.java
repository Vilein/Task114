package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Иван","Иванов", (byte) 11);
        userService.saveUser("Пётр","Петров", (byte) 21);
        userService.saveUser("Сидор","Сидоров", (byte) 32);
        userService.saveUser("Василиса","Васильева", (byte) 43);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
