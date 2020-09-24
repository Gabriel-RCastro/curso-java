package jdbc.insercao.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null) {
                Properties properties = loadProperties();
                String url = properties.getProperty("dburl");
                connection = DriverManager.getConnection(url, properties);
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("src/jdbc/insercao/db/db.properties")) {
            Properties properties = new Properties();
            properties.load(fs);
            return properties;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
