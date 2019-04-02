import java.sql.*;

public class Practical013 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/demostud";
        String Uname = "root";
        String pass = "";
        String query = "SELECT * FROM STUDENT_MASTER";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Trying To connect...");
            Connection con = DriverManager.getConnection(url, Uname, pass);
            System.out.println("Connected Successfully");
            Statement st = con.createStatement();
            System.out.println("Statement Created Successfully");
            ResultSet rs = st.executeQuery(query);
            System.out.println("Query Execuated Successfully");
            System.out.println("| Enroll | Name | City |");
            System.out.println("|----------------------|");
            while (rs.next()) {
                System.out.print("| " + rs.getInt("enroll"));
                System.out.print(" | " + rs.getString("name"));
                System.out.print(" | " + rs.getString("city") + " |\n");
            }
            System.out.println("|----------------------|");
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
