package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String hostName = "localhost";
    private static final String dbName = "db";
    private static final String userName = "root";
    private static final String password = "root";

    public static Connection getMySQLConnection() {
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) {
        try {
            return DriverManager.getConnection(String.format("jdbc:mysql://%s:3306/%s", hostName, dbName), userName,
                    password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
