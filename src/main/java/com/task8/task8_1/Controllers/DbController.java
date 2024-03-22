package com.task8.task8_1.Controllers;

import com.task8.task8_1.Models.DbConnectionModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbController {
    public static Connection connectToDatabase(DbConnectionModel db) {
        try {
            String url = db.url;
            String username = db.username;
            String password = db.password;
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Не удалось подключиться к базе данных", e);
        }
    }
}
