import jdk.nashorn.api.tree.CatchTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;


public class Practical014 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/demostud";
        String Uname = "root";
        String pass = "";
        String query = "SELECT * FROM STUDENT_MASTER";
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Enroll no :");
        scn.nextInt();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Trying To connect...");
            Connection con = DriverManager.getConnection(url, Uname, pass);
            System.out.println("Connected Successfully");
            Statement st = con.createStatement();
            System.out.println("Statement Created Successfully");
            ResultSet rs = st.executeQuery(query);
            System.out.println("Query Execuated Successfully");
            rs.close();
            st.close();
            con.close();
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
