package com.hexaware.ftp114.persistence;
import  org.skife.jdbi.v2.DBI;

public class DbConnection{

    public final DBI getConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            DBI dbi = new DBI("jdbc:mysql://localhost:3306/sqlpractice?useSSL=false",
                "root","Password123");
            System.out.println("Connected...");
            return dbi;

        } catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
            // e.printStackTrace();
            // return null;
        }
    }
}