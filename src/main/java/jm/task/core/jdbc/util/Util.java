package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static final String DB_URL = "jdbc:mysql://localhost:3306/users";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("CONNECTION OK");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("CONNECTION ERROR");
        }
        return connection;
    }
}
