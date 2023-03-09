package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String hostName = "localhost";
    private static final String dbName = "db";
    private static final String userName = "root";
    private static final String password = "root";

    public static Connection getMySQLConnection() throws SQLException {
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection(String.format("jdbc:mysql://%s:3306/%s", hostName, dbName), userName,
                password);
        connection.setAutoCommit(false);
        return connection;
    }

}
