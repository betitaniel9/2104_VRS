import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.BoxLayout;

public class TestScrollPaneWithDB {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Vehicle Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Create a JScrollPane to hold the vehicle details
        JScrollPane jScrollPane = new JScrollPane();
        frame.getContentPane().add(jScrollPane, BorderLayout.CENTER);

        // Fetch data from the database and update the JScrollPane content
        fetchVehicleDetails(jScrollPane);

        // Show the frame
        frame.setVisible(true);
    }

    private static void fetchVehicleDetails(JScrollPane scrollPane) {
        String query = "SELECT vehicle_Logo, vehicle_pic, model, year, vehicle_Type, is_active, in_maintinance FROM vehicle_list WHERE vehicle_id = ?";
        String url = "jdbc:mysql://localhost:3306/gulong_rentals";
        String username = "root"; // Replace with your database username
        String password = ""; // Replace with your database password

        int vehicleId = 1; // Assume vehicle_id to fetch is 1
        JPanel vehicleDetailsPanel = new JPanel();
        vehicleDetailsPanel.setLayout(new BoxLayout(vehicleDetailsPanel, BoxLayout.Y_AXIS));

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, vehicleId); // Set the vehicle_id parameter
            ResultSet rs = stmt.executeQuery();

            // Debugging: Check if we successfully fetched data
            if (rs.next()) {
                System.out.println("Data found for vehicle_id = " + vehicleId);
                String vehicleLogo = rs.getString("vehicle_Logo");
                String vehiclePic = rs.getString("vehicle_pic");
                String model = rs.getString("model");
                int year = rs.getInt("year");
                String vehicleType = rs.getString("vehicle_Type");
                boolean isActive = rs.getBoolean("is_active");
                boolean inMaintenance = rs.getBoolean("in_maintinance");

                // Create and add labels to the vehicle details panel
                vehicleDetailsPanel.add(new JLabel("Vehicle Logo: " + vehicleLogo));
                vehicleDetailsPanel.add(new JLabel("Vehicle Pic: " + vehiclePic));
                vehicleDetailsPanel.add(new JLabel("Model: " + model));
                vehicleDetailsPanel.add(new JLabel("Year: " + year));
                vehicleDetailsPanel.add(new JLabel("Type: " + vehicleType));
                vehicleDetailsPanel.add(new JLabel("Active: " + (isActive ? "Yes" : "No")));
                vehicleDetailsPanel.add(new JLabel("In Maintenance: " + (inMaintenance ? "Yes" : "No")));
            } else {
                System.out.println("No data found for vehicle_id = " + vehicleId);
                vehicleDetailsPanel.add(new JLabel("Vehicle not found."));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            vehicleDetailsPanel.add(new JLabel("Error fetching data from database."));
        }

        // Set the created panel as the viewport of the JScrollPane
        scrollPane.setViewportView(vehicleDetailsPanel);
        scrollPane.revalidate(); // Refresh the JScrollPane to display the new content
    }
}