package com.pack1;

import java.sql.*;
import java.util.*;

public class jdbcApp2 {

    String Driver = "oracle.jdbc.OracleDriver";
    String DBurl = "jdbc:oracle:thin:@localhost:1521:FREE";
    String uname = "batch60";
    String pwd = "123";

    void connect() {

        System.out.println("Try to connect DataBase!!!");

        try {

            Class.forName(Driver);

            Connection con = DriverManager.getConnection(DBurl, uname, pwd);

            System.out.println("Connection completed!!");

            Statement stm = con.createStatement();

            ResultSet oo = stm.executeQuery("SELECT * FROM EMPLOYEE");

            TreeSet<Integer> ts = new TreeSet<>();

            HashMap<Integer, String> hm = new HashMap<>();

            while(oo.next()) {

                int eid = Integer.parseInt(oo.getString(1));

                String data = oo.getString(1) + " " +
                              oo.getString(2) + " " +
                              oo.getString(3) + " " +
                              oo.getInt(4) + " " +
                              oo.getString(5);

                ts.add(eid);

                hm.put(eid, data);
            }

            // ASCENDING ORDER

            System.out.println("\nAscending Order:");

            for(Integer id : ts) 
            {
                System.out.println(hm.get(id));
            }

            // DESCENDING ORDER

            System.out.println("\nDescending Order:");

            for(Integer id : ts.descendingSet()) {

                System.out.println(hm.get(id));
            }

            con.close();

        }
        catch(Exception e) {

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        jdbcApp2 obj = new jdbcApp2();

        obj.connect();
    }
}