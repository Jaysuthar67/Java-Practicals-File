import java.sql.*;

public class Practical013 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/";
        String Uname = "root";
        String pass = "";
        String query = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, Uname, pass);
            Statement st = con.createStatement();
            st.executeQuery();
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
