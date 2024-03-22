package com.task8.task8_1.Models;

public class DbConnectionModel {
    public String url = "jdbc:postgresql://localhost:5432/bdname";
    public String username = "postgres";
    public String password = "admin";

    public DbConnectionModel(String url, String user, String password)
    {
        this.url = url;
        this.username = user;
        this.password = password;
    }
}
