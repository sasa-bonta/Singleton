package com.company.Classic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTestClassic {

    public static void main(String[] args) {

        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Database1 db = Database1.getInstance("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "postgres");

        Database1 dbTest = Database1.getInstance("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "postgres");

        System.out.println(db.getConnection());
        System.out.println(dbTest.getConnection());
        System.out.println("");

        System.out.println("Memory address of db same as dbTest? :");
        System.out.println("");

        boolean same = false;
        if (db == dbTest) {
            same = true;
        }
        System.out.println(same);
        
        System.out.println("");

        String sqlBike = "SELECT * FROM mountainbike";
        String sqlBrakes = "SELECT * FROM brakes";
        String sqlGroupset = "SELECT * FROM groupset";

        Statement statementBike = null;
        try {
            statementBike = db.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            ResultSet result = statementBike.executeQuery(sqlBike);
            System.out.println("Bikes:");
            while (result.next()) {
                        Long id = result.getLong("id");
                        String brand = result.getString("brand");
                        String model = result.getString("model");
                        float size = result.getFloat("size");
                        float weight = result.getFloat("weight");
                        String material = result.getString("material");

                System.out.printf("{%d - %s - %s - %f - %f - %s} \n", id, brand, model, size, weight, material);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Statement statementBrakes = null;
        try {
            statementBrakes = db.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            ResultSet result = statementBrakes.executeQuery(sqlBrakes);
            System.out.println("Brakes:");
            while (result.next()) {
                Long id = result.getLong("id");
                String brand = result.getString("brand");
                int quantityOfPistons = result.getInt("quantityOfPistons");
                int diameterOfRotor = result.getInt("diameterOfRotor");

                System.out.printf("{%d - %s - %d - %d} \n", id, brand, quantityOfPistons, diameterOfRotor);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Statement statementGroupset = null;
        try {
            statementGroupset = db.getConnection().createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            ResultSet result = statementGroupset.executeQuery(sqlGroupset);
            System.out.println("Groupsets:");
            while (result.next()) {
                Long id = result.getLong("id");
                String brand = result.getString("brand");
                int frontSpeeds = result.getInt("frontSpeeds");
                String frontSpeedRange = result.getString("frontSpeedRange");
                int rearSpeeds = result.getInt("rearSpeeds");
                String rearSpeedRange = result.getString("rearSpeedRange");

                System.out.printf("{%d - %s - %d - %s - %d - %s} \n", id, brand, frontSpeeds, frontSpeedRange, rearSpeeds, rearSpeedRange);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}