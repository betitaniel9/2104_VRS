import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class VehiclePanel extends JPanel {
    // Constructor with additional userId and vehicleId
    public VehiclePanel(String vehicleLogo, String vehiclePic, String model, int year, String vehicleType, boolean isActive, int userId, int vehicleId) {
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
        modelLabel.setPreferredSize(new Dimension(150, 30));
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(modelLabel, gbc);

        JLabel yearLabel = new JLabel(String.valueOf(year));
        yearLabel.setFont(textFont);
        yearLabel.setPreferredSize(new Dimension(150, 30));
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(yearLabel, gbc);

        JLabel typeLabel = new JLabel(vehicleType);
        typeLabel.setFont(textFont);
        typeLabel.setPreferredSize(new Dimension(150, 30));
        gbc.gridx = 4;
        gbc.gridy = 0;
        add(typeLabel, gbc);

        JLabel activeLabel = new JLabel(isActive ? "Yes" : "No");
        activeLabel.setFont(textFont);
        activeLabel.setPreferredSize(new Dimension(150, 30));
        gbc.gridx = 5;
        gbc.gridy = 0;
        add(activeLabel, gbc);

        // Rent button
        JButton rentButton = new JButton("Rent");
        rentButton.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        rentButton.setPreferredSize(new Dimension(100, 40));
        gbc.gridx = 6;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(rentButton, gbc);

        rentButton.addActionListener(e -> {
            // Handle rent logic here
            JOptionPane.showMessageDialog(this, "Vehicle rented: " + model);
        });

        // Bookmark button
        JButton bookmarkButton = new JButton("Bookmark");
        bookmarkButton.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
        bookmarkButton.setPreferredSize(new Dimension(120, 40));  // Fixed size for the bookmark button
        gbc.gridx = 6;
        gbc.gridy = 1;  // Move the Bookmark button to the next row
        gbc.anchor = GridBagConstraints.EAST;
        add(bookmarkButton, gbc);

       
    }
}
