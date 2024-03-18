package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        //Util util = new Util();
        //util.getConnection();
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
  //      userService.saveUser("Иван","Иванов", (byte) 11);
//        userService.saveUser("Пётр","Петров", (byte) 21);
//        userService.saveUser("Сидор","Сидоров", (byte) 32);
//        userService.saveUser("Василиса","Васильева", (byte) 43);
        //userService.dropUsersTable();
        //System.out.println(userService.getAllUsers());


    }
}
