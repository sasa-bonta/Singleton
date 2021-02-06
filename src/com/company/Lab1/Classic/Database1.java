package com.company.Lab1.Classic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Here we have declared getInstance() static so that we can call it without
 * instantiating the class. The first time getInstance() is called it creates
 * a new singleton object and after that it just returns the same object.
 * Note that Singleton obj is not created until we need it and call getInstance() method.
 * This is called lazy instantiation.
 * The main problem with above method is that it is not thread safe.
 * Consider the following execution sequence.
 */

public class Database1 {

    private static Database1 database;

    private String dbURL;
    private String user;
    private String pass;
    private static Connection connection;

    private Database1(String dbURL, String user, String pass) {
        this.dbURL = dbURL;
        this.user = user;
        this.pass = pass;
        try {
            this.connection = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Database1 getInstance(String dbURL, String user, String pass) {
        if (database == null) {
            database = new Database1(dbURL, user, pass);
        }
        return database;
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
