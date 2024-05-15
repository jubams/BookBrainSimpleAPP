/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookstore;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class BorrowedBooks extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    static int BorrowedBookCounter = 1000; 
    
    public BorrowedBooks() {
        initComponents();
        con = DBConnection.getInstance();
        UpdateTable();
    }

    private void UpdateTable() {
        String sql = "select * from BorrowedBooks;";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            BorrowedBook.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    private void Clear(){
        BorrowID.setText(null);
            CustomerID.setText(null);
            CustomerName.setText(null);
            BookID.setText(null);
            BookName.setText(null);
            DateBorrowed.setDate(null);
            DueDate.setDate(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BorrowedBook = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CustomerID = new javax.swing.JTextField();
        BookID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        ADD = new javax.swing.JButton();
        DISPLAY = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        REMOVE = new javax.swing.JButton();
        BorrowID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DateBorrowed = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        DueDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        CustomerName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BookName = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Search = new javax.swing.JTextField();
        HomePage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(101, 117, 246));

        BorrowedBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "BorrowID", "CustomerID", "CustomerName", "BookID", "BookName", "Date Borrowed", "Due Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BorrowedBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowedBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BorrowedBook);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/1.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Borrowed Books");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setText("BorrowID:");

        jLabel4.setText("CustomerID:");

        jLabel5.setText("BookID:");

        CustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIDActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        DISPLAY.setText("DISPLAY");
        DISPLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISPLAYActionPerformed(evt);
            }
        });

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        REMOVE.setText("REMOVE");
        REMOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REMOVEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DISPLAY)
                        .addGap(18, 18, 18)
                        .addComponent(ADD))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(UPDATE)
                        .addGap(18, 18, 18)
                        .addComponent(REMOVE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISPLAY)
                    .addComponent(ADD))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATE)
                    .addComponent(REMOVE))
                .addContainerGap())
        );

        BorrowID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowIDActionPerformed(evt);
            }
        });

        jLabel6.setText("DateBorrowed:");

        jLabel7.setText("DueDate: ");

        jLabel8.setText("CustomerName:");

        jLabel9.setText("Book Name:");

        BookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerID)
                            .addComponent(BorrowID)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BookID)
                            .addComponent(CustomerName)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(25, 25, 25)
                        .addComponent(BookName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DateBorrowed, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clear)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(BorrowID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateBorrowed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DueDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clear)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        HomePage.setText("HomePage");
        HomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(HomePage)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(HomePage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrowedBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowedBookMouseClicked
            int row = BorrowedBook.getSelectedRow();
        if (row >= 0) {
            DefaultTableModel model = (DefaultTableModel) BorrowedBook.getModel();

            SimpleDateFormat dateFormatTable = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormatField = new SimpleDateFormat("MM-yyyy-dd");

            String borrowID = model.getValueAt(row, 0).toString();
            String customerID = model.getValueAt(row, 1).toString();
            String customerName = model.getValueAt(row, 2).toString();
            String bookID = model.getValueAt(row, 3).toString();
            String bookName = model.getValueAt(row, 4).toString();
            String dateBorrowed1 = model.getValueAt(row, 5).toString();
            String dueDate1 = model.getValueAt(row, 6).toString();
            
            java.util.Date dateBorrowed = null;
            java.util.Date dueDate = null;
            try {
                dateBorrowed = dateFormatTable.parse(dateBorrowed1);
                dueDate = dateFormatTable.parse(dueDate1);
            } catch (ParseException ex) {
                Logger.getLogger(BorrowedBooks.class.getName()).log(Level.SEVERE, null, ex);
                
                return; 
            }

            
            java.sql.Date sqlDateBorrowed = new java.sql.Date(dateBorrowed.getTime());
            java.sql.Date sqlDueDate = new java.sql.Date(dueDate.getTime());

            
            BorrowID.setText(borrowID);
            CustomerID.setText(customerID);
            CustomerName.setText(customerName);
            BookID.setText(bookID);
            BookName.setText(bookName);
            DateBorrowed.setDate(sqlDateBorrowed);
            DueDate.setDate(sqlDueDate);
        }

    }//GEN-LAST:event_BorrowedBookMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        String searchQuery = Search.getText();

        if (!searchQuery.isEmpty()) {
            try {

                String query = "SELECT * FROM BorrowedBooks WHERE BorrowID LIKE ? OR CustomerID LIKE ? OR CustomerName LIKE ? OR BookID LIKE ? OR BookName LIKE ? OR DateBorrowed LIKE ? OR DueDate LIKE ?";
                pst = con.prepareStatement(query);

                for (int i = 1; i <= 7; i++) {
                    pst.setString(i, "%" + searchQuery + "%");
                }

                rs  = pst.executeQuery();

                BorrowedBook.setModel(DbUtils.resultSetToTableModel(rs));

                rs.close();
                pst.close();
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        } else {

            UpdateTable();
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void HomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomePageActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
        setVisible(false);
    }//GEN-LAST:event_HomePageActionPerformed

    private void REMOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REMOVEActionPerformed
        // TODO add your handling code here:
        
        if(BorrowID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the BorrowID to remove");
        } else {

            try {

                String query = "DELETE FROM BorrowedBooks WHERE BorrowID = ?";
                pst = con.prepareStatement(query);

                pst.setString(1, BorrowID.getText());

                pst.executeUpdate();
                UpdateTable();
                String updateBookQuery = "UPDATE Books SET Availability=? WHERE BookID=?";
                pst = con.prepareStatement(updateBookQuery);
                pst.setString(1, "available");
                pst.setString(2, BookID.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Removed Successfully");

                Clear();

            } catch (SQLException ex) {
               
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_REMOVEActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        
        if(BorrowID.getText().isEmpty() || CustomerID.getText().isEmpty() || CustomerName.getText().isEmpty() || BookID.getText().isEmpty() || BookName.getText().isEmpty() || DateBorrowed.getDate() == null || DueDate.getDate() == null){
            JOptionPane.showMessageDialog(this, "Please Enter all Data");
        } else {

            try {

                String query = "UPDATE BorrowedBooks SET DateBorrowed=?, DueDate=? WHERE BorrowID=?";
                pst = con.prepareStatement(query);

                SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");

                
                java.util.Date borrowedDate = DateBorrowed.getDate();
                java.util.Date dueDate = DueDate.getDate();

                
                String formattedBorrowedDate = outputDateFormat.format(borrowedDate);
                String formattedDueDate = outputDateFormat.format(dueDate);

               
                pst.setString(1, formattedBorrowedDate);
                pst.setString(2, formattedDueDate);
                pst.setString(3, BorrowID.getText());
                

                int rowsAffected = pst.executeUpdate();

                if(rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Data Updated Successfully");
                    UpdateTable();
                    Clear();

                } else {
                    JOptionPane.showMessageDialog(this, "No data found with the provided Username");
                }
            } catch (SQLException ex) {
                // Handle any database errors
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DISPLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISPLAYActionPerformed

        UpdateTable();
        
    }//GEN-LAST:event_DISPLAYActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        
    if(CustomerID.getText().isEmpty() || CustomerName.getText().isEmpty() || BookID.getText().isEmpty() || BookName.getText().isEmpty() || DateBorrowed.getDate() == null || DueDate.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Please Enter all Data");
    } else {
        
        try {
            
            String checkAvailabilityQuery = "SELECT Availability FROM Books WHERE BookID = ?";
            pst = con.prepareStatement(checkAvailabilityQuery);
            pst.setString(1, BookID.getText());
            rs = pst.executeQuery();
            
            if (rs.next()) {
                String availability = rs.getString("Availability");
                if (!availability.equals("available")) {
                    JOptionPane.showMessageDialog(this, "The book is not available for borrowing.");
                    return; 
                }
            } else {
                JOptionPane.showMessageDialog(this, "Book ID not found.");
                return; 
            }
            
            
            String maxBorrowIDQuery = "SELECT MAX(BorrowID) FROM BorrowedBooks";
            pst = con.prepareStatement(maxBorrowIDQuery);
            rs = pst.executeQuery();

            
            if (rs.next()) {
                BorrowedBookCounter = rs.getInt(1);
            }

           
            BorrowedBookCounter++;

           
            String customerCheckQuery = "SELECT COUNT(*) FROM Customer WHERE CustomerID = ? AND Name = ?";
            pst = con.prepareStatement(customerCheckQuery);
            pst.setString(1, CustomerID.getText());
            pst.setString(2, CustomerName.getText());
            rs = pst.executeQuery();
            rs.next();
            int customerCount = rs.getInt(1);

            
            String bookCheckQuery = "SELECT COUNT(*) FROM Books WHERE BookID = ? AND Title = ?";
            pst = con.prepareStatement(bookCheckQuery);
            pst.setString(1, BookID.getText());
            pst.setString(2, BookName.getText());
            rs = pst.executeQuery();
            rs.next();
            int bookCount = rs.getInt(1);

            if(customerCount == 0) {
                JOptionPane.showMessageDialog(this, "Customer does not exist or name does not match.");
            } else if(bookCount == 0) {
                JOptionPane.showMessageDialog(this, "Book does not exist or name does not match.");
            } else {
                // Prepare a SQL statement to insert data into your database
                String query = "INSERT INTO BorrowedBooks (BorrowID, CustomerID, CustomerName, BookID, BookName, DateBorrowed, DueDate) VALUES (?, ?, ?, ?, ?, ?, ?)";

                pst = con.prepareStatement(query);

                pst.setInt(1, BorrowedBookCounter);
                pst.setString(2, CustomerID.getText());
                pst.setString(3, CustomerName.getText());
                pst.setString(4, BookID.getText());
                pst.setString(5, BookName.getText());

                SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");

                
                java.util.Date borrowedDate = DateBorrowed.getDate();
                java.util.Date dueDate = DueDate.getDate();

                String formattedBorrowedDate = outputDateFormat.format(borrowedDate);
                String formattedDueDate = outputDateFormat.format(dueDate);

                pst.setString(6, formattedBorrowedDate);
                pst.setString(7, formattedDueDate);

                pst.executeUpdate();
                
                String updateBookQuery = "UPDATE Books SET Availability=? WHERE BookID=?";
                pst = con.prepareStatement(updateBookQuery);
                pst.setString(1, "not available");
                pst.setString(2, BookID.getText());
                pst.executeUpdate();

                UpdateTable();

                Clear();
            }

        } catch(SQLException ex) {
            // Handle any database errors
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }       
    }
    }//GEN-LAST:event_ADDActionPerformed

    private void CustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIDActionPerformed

    private void BorrowIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowIDActionPerformed

    private void BookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
            Clear();
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowedBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JTextField BookID;
    private javax.swing.JTextField BookName;
    private javax.swing.JTextField BorrowID;
    private javax.swing.JTable BorrowedBook;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField CustomerID;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JButton DISPLAY;
    private com.toedter.calendar.JDateChooser DateBorrowed;
    private com.toedter.calendar.JDateChooser DueDate;
    private javax.swing.JButton HomePage;
    private javax.swing.JButton REMOVE;
    private javax.swing.JTextField Search;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
