package com.company.Synchronized;

import com.company.Classic.Database1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Here using synchronized makes sure that only
 * one thread at a time can execute getInstance().
 * The main disadvantage of this is method is that using
 * synchronized every time while creating the singleton object
 * is expensive and may decrease the performance of your program.
 * However if performance of getInstance() is not critical for your application
 * this method provides a clean and simple solution.
 */

public class Database2 {

    private static Database2 database;

    private String dbURL;
    private String user;
    private String pass;
    private Connection connection;

    public Database2(String dbURL, String user, String pass) {
        this.dbURL = dbURL;
        this.user = user;
        this.pass = pass;
        try {
            this.connection = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static synchronized Database2 getInstance(String dbURL, String user, String pass) {
        if (database == null) {
            database = new Database2(dbURL, user, pass);
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

    public synchronized Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
