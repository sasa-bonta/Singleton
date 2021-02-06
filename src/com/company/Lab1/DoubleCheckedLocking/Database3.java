package com.company.Lab1.DoubleCheckedLocking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * If you notice carefully once an object is created synchronization
 * is no longer useful because now obj will not be null and any sequence
 * of operations will lead to consistent results.
 * So we will only acquire lock on the getInstance() once, when the obj is null.
 * This way we only synchronize the first way through, just what we want.
 *
 * We have declared the obj volatile which ensures that multiple threads
 * offer the obj variable correctly when it is being initialized to Singleton instance.
 * This method drastically reduces the overhead of calling the synchronized method every time.
 */

public class Database3 {

    private static volatile Database3 database = null;

    private String dbURL;
    private String user;
    private String pass;
    private Connection connection;

    private Database3(String dbURL, String user, String pass) {
        this.dbURL = dbURL;
        this.user = user;
        this.pass = pass;
        try {
            this.connection = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Database3 getInstance(String dbURL, String user, String pass) {
        if (database == null) {
            synchronized (Database3.class) {
                if (database == null) {
                    database = new Database3(dbURL, user, pass);
                }
            }
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
