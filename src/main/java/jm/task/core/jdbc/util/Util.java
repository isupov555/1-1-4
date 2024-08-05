package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/base114";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection ()

    {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("ОК");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error");;
        }
        return connection;

    }

    // реализуйте настройку соеденения с БД
}
