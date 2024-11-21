import java.sql.*;
import java.time.LocalDateTime;

public class InsertTransactionList{

    // Method to insert transaction into the transaction_list table
    public static void insertTransactionList(int userId, int vehicleId, String model, String vehicleType, 
                                              String rentInput, String returnInput, long daysBetween, 
                                              double totalCost, String paymentMethod, int Number, 
                                              String location) {
        // Database connection variables
        String url = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your DB name
        String username = "your_username"; // Replace with your DB username
        String password = "your_password"; // Replace with your DB password
        
        // SQL Insert query
        String sql = "INSERT INTO transaction_list ("
                   + "user_id, vehicle_id, model, vehicle_type, "
                   + "date_rented, date_returned, duration, total_cost, payment_method, "
                   + "number, location, date_of_transaction) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Get the current timestamp for date_of_transaction
            Timestamp dateOfTransaction = Timestamp.valueOf(LocalDateTime.now());

            // Set the values for placeholders
            pstmt.setInt(1, userId); // user_id
            pstmt.setInt(2, vehicleId); // vehicle_id
            pstmt.setString(3, model); // model
            pstmt.setString(4, vehicleType); // vehicle_type
            pstmt.setString(5, rentInput); // date_rented (YYYY-MM-DD)
            pstmt.setString(6, returnInput); // date_returned (YYYY-MM-DD)
            pstmt.setLong(7, daysBetween); // duration in days
            pstmt.setDouble(8, totalCost); // total_cost
            pstmt.setString(9, paymentMethod); // payment_method
            pstmt.setInt(10, Number); // number (assuming this is a string)
            pstmt.setString(11, location); // location
            pstmt.setTimestamp(12, dateOfTransaction); // date_of_transaction (current timestamp)

            // Execute the query
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new transaction was inserted successfully!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
