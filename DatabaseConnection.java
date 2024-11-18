import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3306/gulong_rentals";
    private static final String USER = "root"; // Change this if your MySQL username is different
    private static final String PASSWORD = "";  // Change this if your MySQL password is different

    // Method to establish and return a database connection
    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL JDBC driver (optional in some environments)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish and return the connection
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("JDBC Driver not found", e);
        }
    }
}