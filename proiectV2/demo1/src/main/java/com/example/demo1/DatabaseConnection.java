package com.example.demo1;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){
        String databaseName="proiect";
        String databaseUser="root";
        String databasePassword="Luci2004";
        String url = "jdbc:mysql://localhost/"+databaseName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink=DriverManager.getConnection(url,databaseUser,databasePassword);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }
}
