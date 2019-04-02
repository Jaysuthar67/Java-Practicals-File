import java.sql.*;


public class Practical014 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/demostud";
        String Uname = "root";
        String pass = "";
        String query = "INSERT INTO student_master VALUES(5,'Nishant','Vadnaggar')";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Trying To connect...");
            Connection con = DriverManager.getConnection(url, Uname, pass);
            System.out.println("Connected Successfully");
            Statement st = con.createStatement();
            System.out.println("Statement Created Successfully");
            ResultSet rs = st.executeQuery(query);
            System.out.println("Query Executed Successfully");
            System.out.println("Record Inserted Successfully");
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
