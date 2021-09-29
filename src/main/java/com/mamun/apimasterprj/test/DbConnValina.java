package com.mamun.apimasterprj.test;

import java.sql.*;

public class DbConnValina {

    String URL = "jdbc:oracle:thin:@amrood:1521:EMP";
    String USER = "username";
    String PASS = "password";

    DbConnValina(){
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    public void testConn(){
        try{

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
            //here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        } catch(Exception e){
            System.out.println(e);
        }

    }



}
