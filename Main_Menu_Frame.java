import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class Main_Menu_Frame extends javax.swing.JFrame {

    public static Main_Menu_Frame instance;
    public JLabel A_N; 
    private int loggedInUserId;
 
    public Main_Menu_Frame(int userId) {
        System.out.println("Main_Menu_Frame constructor called.");
        initComponents();
        
        instance = this;
        A_N = Account_Name;
        
        String url = "jdbc:mysql://localhost:3306/gulong_rentals";
        String username = "root";
        String password = ""; 

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database! " + loggedInUserId);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        String query = "SELECT * FROM users WHERE username = ?";
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        jTabbedPane2.setEnabledAt(0, false);  // Disable the first tab
        jTabbedPane2.setEnabledAt(1, false);
        jTabbedPane2.setEnabledAt(2, false);  // Disable the first tab
        jTabbedPane2.setEnabledAt(3, false);
        jTabbedPane2.setEnabledAt(4, false);  // Disable the first tab
        jTabbedPane2.setEnabledAt(5, false);
        

        
        HomePanel.setBackground(new Color(211, 211, 211,100));
        VehiclePanel.setBackground(new Color(211, 211, 211,100));
        FeedbackPanel.setBackground(new Color(211, 211, 211,100));
        BookmarkPanel.setBackground(new Color(211, 211, 211,100));
        PaymentPanel.setBackground(new Color(211, 211, 211,100));
        NotificationPanel.setBackground(new Color(211, 211, 211,100));
        
        
        this.loggedInUserId = userId;  // Store the userId in the frame
        System.out.println("User ID in MainMenuFrame constructor: " + loggedInUserId); // Debugging log
        
    }
    
    
    
    public int getLoggedInUserId() {
        return loggedInUserId;
    }

    // Setter for loggedInUserId
    public void setLoggedInUserId(int userId) {
        this.loggedInUserId = userId;
        System.out.println("User ID set in MainMenuFrame: " + loggedInUserId); // Debugging log
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Account_Name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Home_button = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Vehicle_button = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Feedback_button = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Bookmark_button = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Payment_button = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Notification_button = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Exit_button = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        HomePanel = new javax.swing.JPanel();
        VehiclePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        FeedbackPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BookmarkPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NotificationPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PaymentPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1920, 1280));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 105, 105));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account_Icon.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 0, -1, 96));

        Account_Name.setBackground(new java.awt.Color(255, 255, 255));
        Account_Name.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        Account_Name.setForeground(new java.awt.Color(255, 255, 255));
        Account_Name.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Account_Name.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Account_NameComponentShown(evt);
            }
        });
        jPanel4.add(Account_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 30, 120, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 100));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white));

        Home_button.setBackground(new java.awt.Color(153, 153, 153));
        Home_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Home_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Home_buttonMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home_Icon.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Home");

        javax.swing.GroupLayout Home_buttonLayout = new javax.swing.GroupLayout(Home_button);
        Home_button.setLayout(Home_buttonLayout);
        Home_buttonLayout.setHorizontalGroup(
            Home_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_buttonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Home_buttonLayout.setVerticalGroup(
            Home_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_buttonLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(Home_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25))
        );

        Vehicle_button.setBackground(new java.awt.Color(153, 153, 153));
        Vehicle_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vehicle_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Vehicle_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Vehicle_buttonMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vehicle_Icon.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Vehicles");

        javax.swing.GroupLayout Vehicle_buttonLayout = new javax.swing.GroupLayout(Vehicle_button);
        Vehicle_button.setLayout(Vehicle_buttonLayout);
        Vehicle_buttonLayout.setHorizontalGroup(
            Vehicle_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Vehicle_buttonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Vehicle_buttonLayout.setVerticalGroup(
            Vehicle_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vehicle_buttonLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Vehicle_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel10))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Feedback_button.setBackground(new java.awt.Color(153, 153, 153));
        Feedback_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Feedback_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Feedback_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Feedback_buttonMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Feedback_Icon.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Feedback");

        javax.swing.GroupLayout Feedback_buttonLayout = new javax.swing.GroupLayout(Feedback_button);
        Feedback_button.setLayout(Feedback_buttonLayout);
        Feedback_buttonLayout.setHorizontalGroup(
            Feedback_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Feedback_buttonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(35, 35, 35))
        );
        Feedback_buttonLayout.setVerticalGroup(
            Feedback_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Feedback_buttonLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(Feedback_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel11))
                .addGap(25, 25, 25))
        );

        Bookmark_button.setBackground(new java.awt.Color(153, 153, 153));
        Bookmark_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bookmark_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bookmark_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bookmark_buttonMouseExited(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bookmark_Icon.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Bookmark");

        javax.swing.GroupLayout Bookmark_buttonLayout = new javax.swing.GroupLayout(Bookmark_button);
        Bookmark_button.setLayout(Bookmark_buttonLayout);
        Bookmark_buttonLayout.setHorizontalGroup(
            Bookmark_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bookmark_buttonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(29, 29, 29))
        );
        Bookmark_buttonLayout.setVerticalGroup(
            Bookmark_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bookmark_buttonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Bookmark_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Payment_button.setBackground(new java.awt.Color(153, 153, 153));
        Payment_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Payment_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Payment_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Payment_buttonMouseExited(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Payment_Icon.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Payment");

        javax.swing.GroupLayout Payment_buttonLayout = new javax.swing.GroupLayout(Payment_button);
        Payment_button.setLayout(Payment_buttonLayout);
        Payment_buttonLayout.setHorizontalGroup(
            Payment_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Payment_buttonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(40, 40, 40))
        );
        Payment_buttonLayout.setVerticalGroup(
            Payment_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Payment_buttonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Payment_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel14))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Notification_button.setBackground(new java.awt.Color(153, 153, 153));
        Notification_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Notification_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Notification_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Notification_buttonMouseExited(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Notification_Icon.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Notification");

        javax.swing.GroupLayout Notification_buttonLayout = new javax.swing.GroupLayout(Notification_button);
        Notification_button.setLayout(Notification_buttonLayout);
        Notification_buttonLayout.setHorizontalGroup(
            Notification_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Notification_buttonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Notification_buttonLayout.setVerticalGroup(
            Notification_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Notification_buttonLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(Notification_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28))
        );

        Exit_button.setBackground(new java.awt.Color(153, 153, 153));
        Exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Exit_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Exit_buttonMouseExited(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit_Icon.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Log out");

        javax.swing.GroupLayout Exit_buttonLayout = new javax.swing.GroupLayout(Exit_button);
        Exit_button.setLayout(Exit_buttonLayout);
        Exit_buttonLayout.setHorizontalGroup(
            Exit_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Exit_buttonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Exit_buttonLayout.setVerticalGroup(
            Exit_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Exit_buttonLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Exit_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Vehicle_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Feedback_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Bookmark_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Payment_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Notification_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Home_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vehicle_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Feedback_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bookmark_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Payment_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Notification_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(Exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 1020));

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1730, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", HomePanel);

        VehiclePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 255));
        jScrollPane2.setForeground(new java.awt.Color(102, 102, 255));
        VehiclePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 1730, 950));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Available");

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Make/Brand");

        jLabel23.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Picture");

        jLabel24.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Model");

        jLabel25.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Year");

        jLabel26.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Vehicle Type");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        VehiclePanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, 50));

        jTabbedPane2.addTab("tab2", VehiclePanel);

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 48)); // NOI18N
        jLabel5.setText("FEEDBACK PAGE");

        javax.swing.GroupLayout FeedbackPanelLayout = new javax.swing.GroupLayout(FeedbackPanel);
        FeedbackPanel.setLayout(FeedbackPanelLayout);
        FeedbackPanelLayout.setHorizontalGroup(
            FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackPanelLayout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel5)
                .addContainerGap(818, Short.MAX_VALUE))
        );
        FeedbackPanelLayout.setVerticalGroup(
            FeedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackPanelLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel5)
                .addContainerGap(495, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab3", FeedbackPanel);

        BookmarkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BookmarkPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, 985));

        jTabbedPane2.addTab("tab4", BookmarkPanel);

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 48)); // NOI18N
        jLabel4.setText("NOTIFICATION PAGE");

        javax.swing.GroupLayout NotificationPanelLayout = new javax.swing.GroupLayout(NotificationPanel);
        NotificationPanel.setLayout(NotificationPanelLayout);
        NotificationPanelLayout.setHorizontalGroup(
            NotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificationPanelLayout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel4)
                .addContainerGap(704, Short.MAX_VALUE))
        );
        NotificationPanelLayout.setVerticalGroup(
            NotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NotificationPanelLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel4)
                .addContainerGap(495, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab6", NotificationPanel);

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 48)); // NOI18N
        jLabel7.setText("PAYMENT PAGE");

        javax.swing.GroupLayout PaymentPanelLayout = new javax.swing.GroupLayout(PaymentPanel);
        PaymentPanel.setLayout(PaymentPanelLayout);
        PaymentPanelLayout.setHorizontalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentPanelLayout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel7)
                .addContainerGap(849, Short.MAX_VALUE))
        );
        PaymentPanelLayout.setVerticalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentPanelLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel7)
                .addContainerGap(495, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab5", PaymentPanel);

        jPanel2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 1730, 1020));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_Menu_BG.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1920, 1040));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                
    private void Home_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_buttonMouseClicked
        
         Home_button.setBackground(Color.GRAY);
        
        if (jTabbedPane2.getSelectedIndex() == 0) {
    // Tab is already selected, so hide it or disable it
            jTabbedPane2.setEnabledAt(0, false);  // Disable the tab so it won't be clickable
            jTabbedPane2.setSelectedIndex(-1);  // Deselect the tab (hide the content)
        }
        else {
    // Tab is not selected, so select it
            jTabbedPane2.setEnabledAt(0, true);  // Ensure the tab is enabled
            jTabbedPane2.setSelectedIndex(0);  // Select the tab
        }
        
    }//GEN-LAST:event_Home_buttonMouseClicked

    private void Home_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_buttonMouseEntered
       Home_button.setBackground(new Color(211, 211, 211));
    }//GEN-LAST:event_Home_buttonMouseEntered

    private void Home_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_buttonMouseExited
        Home_button.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Home_buttonMouseExited

    
    
    public void fetchVehicleDetails(int userId) {
    String query = "SELECT vehicle_id, vehicle_Logo, vehicle_pic, model, year, vehicle_Type, is_active FROM vehicle_list";
    
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gulong_rentals", "username", "password");
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        // Create a main panel to hold all the vehicle details panels
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));  // Stack all vehicle panels vertically
        mainPanel.setBackground(new Color(0, 105, 105, 255));  // Set background color for main panel

        while (rs.next()) {
            // Retrieve vehicle details
            int vehicleId = rs.getInt("vehicle_id");
            String vehicleLogo = rs.getString("vehicle_Logo");
            String vehiclePic = rs.getString("vehicle_pic");
            String model = rs.getString("model");
            int year = rs.getInt("year");
            String vehicleType = rs.getString("vehicle_Type");
            boolean isActive = rs.getBoolean("is_active");

            // Create a new VehiclePanel and add it to the main panel
            VehiclePanel vehiclePanel = new VehiclePanel(vehicleLogo, vehiclePic, model, year, vehicleType, isActive, userId, vehicleId);
            mainPanel.add(vehiclePanel);

            // Add spacing between panels
            mainPanel.add(Box.createVerticalStrut(20));
        }

        // Set the main panel as the viewport of the scroll pane
        jScrollPane2.setViewportView(mainPanel);
        jScrollPane2.revalidate();
        jScrollPane2.repaint();
    
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    



   
    private void Vehicle_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vehicle_buttonMouseClicked
        Vehicle_button.setBackground(Color.GRAY);
        
        if (jTabbedPane2.getSelectedIndex() == 1) {
    // Tab is already selected, so hide it or disable it
            jTabbedPane2.setEnabledAt(1, false);  // Disable the tab so it won't be clickable
            jTabbedPane2.setSelectedIndex(-1);  // Deselect the tab (hide the content)
            
        }
        else {
    // Tab is not selected, so select it
            jTabbedPane2.setEnabledAt(1, true);  // Ensure the tab is enabled
            jTabbedPane2.setSelectedIndex(1);  // Select the tab
            fetchVehicleDetails(1);
        
    }//GEN-LAST:event_Vehicle_buttonMouseClicked
    }
    
    private void Vehicle_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vehicle_buttonMouseEntered
        Vehicle_button.setBackground(new Color(211, 211, 211));
    }//GEN-LAST:event_Vehicle_buttonMouseEntered

    private void Vehicle_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vehicle_buttonMouseExited
        Vehicle_button.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Vehicle_buttonMouseExited
    
    
    
    
    
    private void Feedback_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_buttonMouseClicked
        Feedback_button.setBackground(Color.GRAY);
        
        if (jTabbedPane2.getSelectedIndex() == 2) {
    // Tab is already selected, so hide it or disable it
            jTabbedPane2.setEnabledAt(2, false);  // Disable the tab so it won't be clickable
            jTabbedPane2.setSelectedIndex(-1);  // Deselect the tab (hide the content)
        }
        else {
    // Tab is not selected, so select it
            jTabbedPane2.setEnabledAt(2, true);  // Ensure the tab is enabled
            jTabbedPane2.setSelectedIndex(2);  // Select the tab
        }
    }//GEN-LAST:event_Feedback_buttonMouseClicked

    private void Feedback_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_buttonMouseEntered
        Feedback_button.setBackground(new Color(211, 211, 211));
    }//GEN-LAST:event_Feedback_buttonMouseEntered

    private void Feedback_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Feedback_buttonMouseExited
        Feedback_button.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Feedback_buttonMouseExited







    
    private void Bookmark_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bookmark_buttonMouseClicked
        Bookmark_button.setBackground(Color.GRAY);
        
        if (jTabbedPane2.getSelectedIndex() == 3) {
    // Tab is already selected, so hide it or disable it
            jTabbedPane2.setEnabledAt(3, false);  // Disable the tab so it won't be clickable
            jTabbedPane2.setSelectedIndex(-1);  // Deselect the tab (hide the content)
        }
        else {
    // Tab is not selected, so select it
            jTabbedPane2.setEnabledAt(3, true);  // Ensure the tab is enabled
            jTabbedPane2.setSelectedIndex(3);  // Select the tab
            
        }
    }//GEN-LAST:event_Bookmark_buttonMouseClicked

    private void Bookmark_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bookmark_buttonMouseEntered
        Bookmark_button.setBackground(new Color(211, 211, 211));
    }//GEN-LAST:event_Bookmark_buttonMouseEntered

    private void Bookmark_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bookmark_buttonMouseExited
        Bookmark_button.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Bookmark_buttonMouseExited

    
    
    
    private void Payment_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payment_buttonMouseClicked
        Payment_button.setBackground(Color.GRAY);
        
        if (jTabbedPane2.getSelectedIndex() == 4) {
    // Tab is already selected, so hide it or disable it
            jTabbedPane2.setEnabledAt(4, false);  // Disable the tab so it won't be clickable
            jTabbedPane2.setSelectedIndex(-1);  // Deselect the tab (hide the content)
        }
        else {
    // Tab is not selected, so select it
            jTabbedPane2.setEnabledAt(4, true);  // Ensure the tab is enabled
            jTabbedPane2.setSelectedIndex(4);  // Select the tab
        }
    }//GEN-LAST:event_Payment_buttonMouseClicked

    private void Payment_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payment_buttonMouseEntered
        Payment_button.setBackground(new Color(211, 211, 211));
    }//GEN-LAST:event_Payment_buttonMouseEntered

    private void Payment_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payment_buttonMouseExited
        Payment_button.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Payment_buttonMouseExited

    
    
    
    private void Notification_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Notification_buttonMouseClicked
        Notification_button.setBackground(Color.GRAY);
        
        if (jTabbedPane2.getSelectedIndex() == 5) {
    // Tab is already selected, so hide it or disable it
            jTabbedPane2.setEnabledAt(5, false);  // Disable the tab so it won't be clickable
            jTabbedPane2.setSelectedIndex(-1);  // Deselect the tab (hide the content)
        }
        else {
    // Tab is not selected, so select it
            jTabbedPane2.setEnabledAt(5, true);  // Ensure the tab is enabled
            jTabbedPane2.setSelectedIndex(5);  // Select the tab
        }
    }//GEN-LAST:event_Notification_buttonMouseClicked

    private void Notification_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Notification_buttonMouseEntered
        
        Notification_button.setBackground(new Color(211, 211, 211));
    }//GEN-LAST:event_Notification_buttonMouseEntered

    private void Notification_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Notification_buttonMouseExited
        Notification_button.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_Notification_buttonMouseExited

    
    
    private void Exit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseClicked
        Exit_button.setBackground(Color.LIGHT_GRAY);
        System.exit(0);
    }//GEN-LAST:event_Exit_buttonMouseClicked

    private void Exit_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseEntered
        Exit_button.setBackground(new Color(211, 211, 211));
    }//GEN-LAST:event_Exit_buttonMouseEntered

    private void Exit_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_buttonMouseExited
        Exit_button.setBackground(new Color(153, 153, 153)); 
    }//GEN-LAST:event_Exit_buttonMouseExited

    
    private void Account_NameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Account_NameComponentShown
        
    }//GEN-LAST:event_Account_NameComponentShown

    /**
     * @param args the command line arguments
     */
    public void run() {
    int userId = getLoggedInUserId();  // Get the logged-in user ID, assuming you have a method for this
    if (userId != -1) {
        Main_Menu_Frame mainMenu = new Main_Menu_Frame(userId); // Pass userId to the constructor
        mainMenu.setVisible(true);
    } else {
        System.out.println("No user is logged in.");
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Account_Name;
    private javax.swing.JPanel BookmarkPanel;
    private javax.swing.JPanel Bookmark_button;
    private javax.swing.JPanel Exit_button;
    private javax.swing.JPanel FeedbackPanel;
    private javax.swing.JPanel Feedback_button;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel Home_button;
    private javax.swing.JPanel NotificationPanel;
    private javax.swing.JPanel Notification_button;
    private javax.swing.JPanel PaymentPanel;
    private javax.swing.JPanel Payment_button;
    private javax.swing.JPanel VehiclePanel;
    private javax.swing.JPanel Vehicle_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
