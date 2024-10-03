/*
	Mauricio Diaz
	CEN3024C
	June 15, 2024
	Software Development 1

	Database Class: This class is for holding database functions.
*/

package com.mauricio.librarymanagementsystem;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    public static ArrayList<String> DatabaseConnect(String sqlExecute, int decision){


        ArrayList<String> list = new ArrayList<>();
        String row = null;

        // Holds the location of the database.

        // This needs to be changed for using different databases.
        String location = "jdbc:sqlite:LMS_DATABASE";

        // Declares and initializes connect object.
        Connection connect = null;

        try{

            connect = DriverManager.getConnection(location);

            // Confirms database is connected
            System.out.println("Connected to database");

            Statement query = connect.createStatement();

            if (decision == 1){
                System.out.println(sqlExecute);
                int check = query.executeUpdate(sqlExecute);

                String toCheck = String.valueOf(check);

                list.add(toCheck);


            }else{
                ResultSet resultSet = query.executeQuery(sqlExecute);
                while (resultSet.next()){
                    row = resultSet.getString("ID") + " " + resultSet.getString("TITLE") + " " + resultSet.getString("AUTHOR") + " " + resultSet.getString("RELEASEYEAR") + " " + resultSet.getString("BARCODE") + " " + resultSet.getString("STATUS") + " " + resultSet.getString("DUEDATE");
                    list.add(row);
                }
            }



        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("DATABASE ERROR");
        }

        return list;
    }

    public static void createDatabase(){ // Creates new database if necessary

        String location = "jdbc:sqlite:LMS_DATABASE";

        // Declares and initializes connect object.
        Connection connect = null;


        try{

            connect = DriverManager.getConnection(location);

            // Confirms database is connected
            System.out.println("Connected to database");

            Statement query = connect.createStatement();

            String createTable = "CREATE TABLE BOOKS(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, AUTHOR TEXT, RELEASEYEAR INTEGER, BARCODE TEXT, STATUS TEXT, DUEDATE TEXT)";

            query.executeUpdate(createTable);

        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("DATABASE ERROR");
        }
    }

}
