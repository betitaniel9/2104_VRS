import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class VehiclePanel extends JPanel {
    public static ImageIcon VehicleLogo;
    public static ImageIcon VehiclePic;
    int userId = Login_Frame.loggedInUserId;
    private int vehicleId;
    public static double Cost;  // Static variable
    public static int Year;
    public static String Model;
    public static String VehicleType;
    private JButton actionButton;
    public VehiclePanel(String vehicleLogo, String vehiclePic, String model, int year, 
                        String vehicleType, boolean isActive, int userId, double cost, 
                        int vehicleId, boolean isBookmarked) {
        
        
        this.vehicleId = vehicleId;
        VehicleLogo = new ImageIcon(vehicleLogo);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 50, 5, 40);  // Padding between components
        gbc.fill = GridBagConstraints.HORIZONTAL;
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Padding around each vehicle panel
        setBackground(Color.WHITE);  // Set background color for vehicle details panel

        // Add the vehicle logo
        if (vehicleLogo != null && !vehicleLogo.isEmpty()) {
            ImageIcon logoIcon = new ImageIcon(vehicleLogo);
            Image resizedLogo = logoIcon.getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH);  // Resize the logo
            JLabel logoLabel = new JLabel(new ImageIcon(resizedLogo));
            gbc.gridx = 0;
            gbc.gridy = 0;
            add(logoLabel, gbc);
        }

        // Add the vehicle picture
        if (vehiclePic != null && !vehiclePic.isEmpty()) {
            ImageIcon picIcon = new ImageIcon(vehiclePic);
            Image resizedPic = picIcon.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);  // Resize the picture
            JLabel picLabel = new JLabel(new ImageIcon(resizedPic));
            gbc.gridx = 1;
            gbc.gridy = 0;
            add(picLabel, gbc);
        }

        Font textFont = new Font("MS Reference Sans Serif", Font.PLAIN, 20);

        // Add vehicle details (model, year, type, active)
        JLabel modelLabel = new JLabel(model);
        modelLabel.setFont(textFont);
        modelLabel.setPreferredSize(new Dimension(150, 20));
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(modelLabel, gbc);

        JLabel yearLabel = new JLabel(String.valueOf(year));
        yearLabel.setFont(textFont);
        yearLabel.setPreferredSize(new Dimension(150, 20));
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(yearLabel, gbc);

        JLabel typeLabel = new JLabel(vehicleType);
        typeLabel.setFont(textFont);
        typeLabel.setPreferredSize(new Dimension(150, 20));
        gbc.gridx = 4;
        gbc.gridy = 0;
        add(typeLabel, gbc);
        
        JLabel costLabel = new JLabel(String.valueOf(cost));
        costLabel.setFont(textFont);
        costLabel.setPreferredSize(new Dimension(150, 30));
        gbc.gridx = 5;
        gbc.gridy = 0;
        add(costLabel, gbc);

        JLabel activeLabel = new JLabel(isActive ? "Yes" : "No");
        activeLabel.setFont(textFont);
        activeLabel.setPreferredSize(new Dimension(150, 30));
        gbc.gridx = 6;
        gbc.gridy = 0;
        add(activeLabel, gbc);

        // Rent button
        JButton rentButton = new JButton("Rent");
        rentButton.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        rentButton.setPreferredSize(new Dimension(100, 40));
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(rentButton, gbc);

        rentButton.addActionListener(e -> {
    // Fetch vehicle details (for example)
           // Replace with actual price value
           
            VehiclePanel.Cost = cost;
            VehiclePanel.Year = year;
            VehiclePanel.Model = model;
            VehiclePanel.VehicleType = vehicleType;
            VehicleLogo = new ImageIcon(vehicleLogo);
            VehiclePic = new ImageIcon(vehiclePic);
            Payment_frame paymentFrame = new Payment_frame();
            paymentFrame.setVisible(true);
            paymentFrame.setVisible(true);
        });
        
        // Bookmark button
        actionButton = new JButton("Bookmark");
        actionButton.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        actionButton.setPreferredSize(new Dimension(140, 40));
        gbc.gridx = 6;
        gbc.gridy = 1;
        add(actionButton, gbc);

        // Dynamically check if the vehicle is bookmarked
        checkIfBookmarked();

        // Add action listener to toggle bookmark
        actionButton.addActionListener(e -> {
            if (actionButton.getText().equals("Bookmark")) {
                addBookmark();
            } else {
                removeBookmark();
            }
        });
    }

    private void checkIfBookmarked() {
        // Check if the vehicle is already bookmarked for the user
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gulong_rentals", "username", "password");
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM bookmark_list WHERE user_id = ? AND vehicle_id = ?")) {

            stmt.setInt(1, userId);
            stmt.setInt(2, vehicleId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                actionButton.setText("Remove");
            } 

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addBookmark() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gulong_rentals", "username", "password");
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO bookmark_list (user_id, vehicle_id) VALUES (?, ?)")) {

            stmt.setInt(1, userId);
            stmt.setInt(2, vehicleId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Vehicle bookmarked!");

            // Update button and inform parent about the change
            actionButton.setText("Remove");

            // Notify the parent frame (MainMenu) to refresh the vehicle list
            refreshVehicleList();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void removeBookmark() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gulong_rentals", "username", "password");
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM bookmark_list WHERE user_id = ? AND vehicle_id = ?")) {

            stmt.setInt(1, userId);
            stmt.setInt(2, vehicleId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Bookmark removed!");

            // Update button and inform parent about the change
            actionButton.setText("Bookmark");

            // Notify the parent frame (MainMenu) to refresh the vehicle list
            refreshVehicleList();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to trigger the UI refresh in MainMenu
    private void refreshVehicleList() {
    // Assuming the parent is a Main_Menu_Frame
    Container parent = this.getParent();
    if (parent != null && parent instanceof Main_Menu_Frame) { // or use the appropriate userId value you want to pass
        ((Main_Menu_Frame) parent).fetchVehicleDetails(userId); // Pass userId to fetchVehicleDetails
    }
}

    public ImageIcon getVehicleLogo() {
        return VehicleLogo;
    }

    // Getter for vehicleId
    public int getVehicleId() {
        return vehicleId;
    }

    private void bookmarkVehicle() {
        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gulong_rentals", "username", "password");

            // Check if this bookmark already exists
            String checkQuery = "SELECT * FROM bookmark_list WHERE user_id = ? AND vehicle_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setInt(1, userId);
            checkStmt.setInt(2, vehicleId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "This vehicle is already bookmarked!", "Info ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Insert new bookmark
                String insertQuery = "INSERT INTO bookmark_list (user_id, vehicle_id) VALUES (?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                insertStmt.setInt(1, userId);
                insertStmt.setInt(2, vehicleId);

                int rowsAffected = insertStmt.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Vehicle bookmarked successfully!", "Success ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to bookmark the vehicle.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                insertStmt.close();
            }

            checkStmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
