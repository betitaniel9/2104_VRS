/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.*;
import java.awt.*;



public class Payment_frame extends javax.swing.JFrame {
    private Main_Menu_Frame mainMenuFrame;
    public static int userId = Login_Frame.loggedInUserId;
    public static int vehicleId;
    public static long daysBetween;
    public static double Cost;
    public static int Year;
    public static String Model;
    public static ImageIcon VehicleLogo;
    public static ImageIcon VehiclePic;
    public static String VehicleType;
    public static String Payment_Method;
    public static int returnInput;
    public static int rentInput;
    public Payment_frame() {
     // Display the cost

        initComponents();

    double cost = VehiclePanel.Cost;
        int year = VehiclePanel.Year;
        String model = VehiclePanel.Model;
        String vehicleType = VehiclePanel.VehicleType;
        ImageIcon vehicleLogo = VehiclePanel.VehicleLogo; // Accessing static field
        ImageIcon vehiclePic = VehiclePanel.VehiclePic;
        // Set the values to the respective labels
        jLabelCostlabel.setText(String.format("Php %.2f", cost)); // Format cost with two decimal places
        jLabelYearlabel.setText(String.format("%d", year)); // Set year
        jLabelModellabel.setText(model); // Set model
        jLabelvehicltypelabel.setText(vehicleType); // Set vehicle type

        // Set the vehicle logo icon to the JLabel
        if (vehicleLogo != null) {
            int labelWidth = jLabelShowCarlabel.getWidth();
            int labelHeight = jLabelShowCarlabel.getHeight();
            ImageIcon scaledIcon = new ImageIcon(vehicleLogo.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH));
            jLabelShowCarlabel.setIcon(scaledIcon);
            jLabelShowCarlabel.setIcon(scaledIcon);
            
            
        } else {
            jLabelShowCarlabel.setIcon(null); // Optionally handle case where there's no logo
        }
        
        if (vehiclePic != null){
            
            int labelWidth = jLabelCarPic.getWidth();
            int labelHeight = jLabelCarPic.getHeight();
            ImageIcon scaledIcon = new ImageIcon(vehiclePic.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH));
            jLabelCarPic.setIcon(scaledIcon);
            jLabelCarPic.setIcon(scaledIcon);
        }   else {
            jLabelCarPic.setIcon(null); // Optionally handle case where there's no logo
        }
    
    jLabelFull_Payment.setVisible(false);
    jLabelFull_Show_Payment.setVisible(false);
    jLabelFull_Show_DownPayment.setVisible(false);
    jLabelPercent_Payment.setVisible(false);
    jLabelPending_Payment.setVisible(false);
    jLabelFull_Show_PendingPayment.setVisible(false);
    jPanelPayment.setVisible(false);
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On-hand Payment", "Gcash", "Paymaya"}));
        
    jCheckBox1.addActionListener(e -> {
        if (jCheckBox1.isSelected()){
            jCheckBox2.setSelected(false);
            jLabelFull_Payment.setVisible(true);
            jLabelFull_Show_Payment.setVisible(true);
            jLabelFull_Show_DownPayment.setVisible(false);
            jLabelPercent_Payment.setVisible(false);
            jLabelPending_Payment.setVisible(false);
            jLabelFull_Show_PendingPayment.setVisible(false);
            
            double Payment = cost* daysBetween;
            jLabelFull_Show_Payment.setText(String.format("Php %.2f", Payment));
            
        }
            else{
                jLabelFull_Payment.setVisible(false);
                jLabelFull_Show_Payment.setVisible(false);
        }
        
        
    
    });
    
    jCheckBox2.addActionListener(e -> {
        if (jCheckBox2.isSelected()){
            jCheckBox1.setSelected(false);
            jLabelFull_Payment.setVisible(false);
            jLabelFull_Show_Payment.setVisible(false);
            jLabelFull_Show_DownPayment.setVisible(true);
            jLabelPercent_Payment.setVisible(true);
            jLabelPending_Payment.setVisible(true);
            jLabelFull_Show_PendingPayment.setVisible(true);
            
            double Payment = cost* daysBetween *0.15;
            jLabelFull_Show_DownPayment.setText(String.format("Php %.2f ", Payment));
            double pendingPayment = (cost*daysBetween)-Payment;
            jLabelFull_Show_PendingPayment.setText(String.format("Php %.2f ", pendingPayment));
            
        }
        else{
            jLabelFull_Show_DownPayment.setVisible(false);
            jLabelPercent_Payment.setVisible(false);
            jLabelPending_Payment.setVisible(false);
            jLabelFull_Show_PendingPayment.setVisible(false);
        }
    });
    this.mainMenuFrame = mainMenuFrame;
    addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                dispose();
                mainMenuFrame.setVisible(true); // Make sure the main menu is visible
                // Dispose of the Payment frame but do not close the entire app
            }
        });
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelFull_Payment1 = new javax.swing.JLabel();
        jLabelFull_ShowPayment = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabelFull_Payment = new javax.swing.JLabel();
        jLabelFull_Show_Payment = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabelPercent_Payment = new javax.swing.JLabel();
        jLabelFull_Show_DownPayment = new javax.swing.JLabel();
        jLabelPending_Payment = new javax.swing.JLabel();
        jLabelFull_Show_PendingPayment = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabelRentPerDay1 = new javax.swing.JLabel();
        jTextFieldShow_Days = new javax.swing.JTextField();
        jToggleButtonOK = new javax.swing.JToggleButton();
        jLabelCarBrand1 = new javax.swing.JLabel();
        jLabelYearlabel = new javax.swing.JLabel();
        jLabelVehicleTypelabel = new javax.swing.JLabel();
        jLabelCarBrand = new javax.swing.JLabel();
        jLabelvehicltypelabel = new javax.swing.JLabel();
        jLabelModellabel = new javax.swing.JLabel();
        jLabelRentPerDay2 = new javax.swing.JLabel();
        jLabelCostlabel = new javax.swing.JLabel();
        jLabelCarPic = new javax.swing.JLabel();
        jLabelShowCarlabel = new javax.swing.JLabel();
        jPanelPayment = new javax.swing.JPanel();
        jLabelPayment = new javax.swing.JLabel();
        jToggleButtonSave = new javax.swing.JToggleButton();
        jTextFieldPayment = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setText("Payments");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 162, 39));

        jPanel2.setBackground(new java.awt.Color(0, 105, 105));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 63, -1, -1));

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("Date to Rent:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 63, 112, -1));

        jTextField1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jTextField1.setText("yyyy-mm-dd");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 87, 224, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setText("Date to Return:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 123, 136, 28));

        jTextField2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jTextField2.setText("yyyy-mm-dd");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 157, 224, -1));

        jLabelFull_Payment1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(jLabelFull_Payment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 482, 112, -1));

        jLabelFull_ShowPayment.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(jLabelFull_ShowPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 429, 112, -1));

        jCheckBox1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jCheckBox1.setText("Full Payment");

        jLabelFull_Payment.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelFull_Payment.setText("Total Payment:");

        jLabelFull_Show_Payment.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelFull_Show_Payment.setText("-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelFull_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelFull_Show_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFull_Payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFull_Show_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 208, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jCheckBox2.setText("Down Payment(15%)");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabelPercent_Payment.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelPercent_Payment.setText("Downpayment Cost:");

        jLabelFull_Show_DownPayment.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelFull_Show_DownPayment.setText("-");

        jLabelPending_Payment.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelPending_Payment.setText("Balance:");

        jLabelFull_Show_PendingPayment.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelFull_Show_PendingPayment.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPercent_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelFull_Show_PendingPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelPending_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabelFull_Show_DownPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPercent_Payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFull_Show_DownPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPending_Payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFull_Show_PendingPayment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 208, -1, 130));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel6.setText("Payment Method:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jLabelRentPerDay1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelRentPerDay1.setText("Days to be Rented:");

        jTextFieldShow_Days.setEditable(false);
        jTextFieldShow_Days.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldShow_Days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldShow_DaysActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRentPerDay1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldShow_Days, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabelRentPerDay1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldShow_Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 290, -1));

        jToggleButtonOK.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jToggleButtonOK.setText("Enter");
        jToggleButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonOKActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 155, -1, -1));

        jLabelCarBrand1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelCarBrand1.setText("Year:");
        jPanel1.add(jLabelCarBrand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabelYearlabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(jLabelYearlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 111, 18));

        jLabelVehicleTypelabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelVehicleTypelabel.setText("Vehicle Type: ");
        jPanel1.add(jLabelVehicleTypelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, -1));

        jLabelCarBrand.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelCarBrand.setText("Car Model:");
        jPanel1.add(jLabelCarBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabelvehicltypelabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(jLabelvehicltypelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 111, 18));

        jLabelModellabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(jLabelModellabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 111, 18));

        jLabelRentPerDay2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabelRentPerDay2.setText("Rent per Day:");
        jPanel1.add(jLabelRentPerDay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabelCostlabel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jPanel1.add(jLabelCostlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 111, 18));
        jPanel1.add(jLabelCarPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 240, 220));
        jPanel1.add(jLabelShowCarlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 260, 230));

        jPanelPayment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPayment.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPayment.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabelPayment.setForeground(new java.awt.Color(0, 0, 0));
        jPanelPayment.add(jLabelPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 20));

        jToggleButtonSave.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jToggleButtonSave.setText("Enter");
        jToggleButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSaveActionPerformed(evt);
            }
        });
        jPanelPayment.add(jToggleButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, -1));

        jTextFieldPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPaymentActionPerformed(evt);
            }
        });
        jPanelPayment.add(jTextFieldPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 234, -1));

        jPanel1.add(jPanelPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 270, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String rentInput = jTextField1.getText();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        String returnInput = jTextField2.getText();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        jComboBox1.addActionListener(e -> {
    String Payment_Method = (String) jComboBox1.getSelectedItem();
    if ("Gcash".equals(Payment_Method)) {
        jLabelPayment.setText("Gcash No:");
        jPanelPayment.setVisible(true);

    }
    
    else if ("Paymaya".equals(Payment_Method)) {
        jLabelPayment.setText("Paymaya No:");
        jPanelPayment.setVisible(true);
    } 
    
    else {
        jLabelPayment.setVisible(false);
        jPanelPayment.setVisible(false);
    }
});
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextFieldShow_DaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldShow_DaysActionPerformed

    }//GEN-LAST:event_jTextFieldShow_DaysActionPerformed

    private void jToggleButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonOKActionPerformed
        try{
            String rentInput = jTextField1.getText();
            String returnInput = jTextField2.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate rentDate = LocalDate.parse(jTextField1.getText(), formatter);
            LocalDate returnDate = LocalDate.parse(returnInput, formatter);
            daysBetween = ChronoUnit.DAYS.between(rentDate, returnDate);
            jTextFieldShow_Days.setText(String.valueOf(daysBetween));
            
            
        }
        catch(Exception e){
            jTextFieldShow_Days.setText("Invalid date format. Please use yyyy-MM-dd");
            jTextFieldShow_Days.setForeground(Color.red);
        
        }
    }//GEN-LAST:event_jToggleButtonOKActionPerformed

    private void jTextFieldPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPaymentActionPerformed

    private void jToggleButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonSaveActionPerformed
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Payment_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_frame().setVisible(true);
             

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCarBrand;
    private javax.swing.JLabel jLabelCarBrand1;
    private javax.swing.JLabel jLabelCarPic;
    private javax.swing.JLabel jLabelCostlabel;
    private javax.swing.JLabel jLabelFull_Payment;
    private javax.swing.JLabel jLabelFull_Payment1;
    private javax.swing.JLabel jLabelFull_ShowPayment;
    private javax.swing.JLabel jLabelFull_Show_DownPayment;
    private javax.swing.JLabel jLabelFull_Show_Payment;
    private javax.swing.JLabel jLabelFull_Show_PendingPayment;
    private javax.swing.JLabel jLabelModellabel;
    private javax.swing.JLabel jLabelPayment;
    private javax.swing.JLabel jLabelPending_Payment;
    private javax.swing.JLabel jLabelPercent_Payment;
    private javax.swing.JLabel jLabelRentPerDay1;
    private javax.swing.JLabel jLabelRentPerDay2;
    private javax.swing.JLabel jLabelShowCarlabel;
    private javax.swing.JLabel jLabelVehicleTypelabel;
    private javax.swing.JLabel jLabelYearlabel;
    private javax.swing.JLabel jLabelvehicltypelabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelPayment;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldPayment;
    private javax.swing.JTextField jTextFieldShow_Days;
    private javax.swing.JToggleButton jToggleButtonOK;
    private javax.swing.JToggleButton jToggleButtonSave;
    // End of variables declaration//GEN-END:variables
}
