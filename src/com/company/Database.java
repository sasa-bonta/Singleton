package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String dbURL;
    private String user;
    private String pass;
    private Connection connection;

    public Database(String dbURL, String user, String pass) {
        this.dbURL = dbURL;
        this.user = user;
        this.pass = pass;
        try {
            this.connection = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
