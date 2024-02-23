/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.Dao;
import Model.Signup;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdClient extends javax.swing.JFrame {
DefaultTableModel tableModel = new DefaultTableModel();
    /**
     * Creates new form AdClient
     */
    public AdClient() {
        initComponents();
         addColumnTableHeader();
        addRowTableData();
    }

     private void addColumnTableHeader(){
        tableModel.addColumn("Id");
        tableModel.addColumn("Names");
        tableModel.addColumn("Email");
        tableModel.addColumn("Phone");
         tableModel.addColumn("Password");
        
        userTable.setModel(tableModel);
    }
     private void addRowTableData(){
        tableModel.setRowCount(0);
        Dao dao = new Dao();
        List<Signup> users = dao.allUsers();
        for(Signup Obj : users){
            tableModel.addRow(new Object[]{
                Obj.getId(),
                Obj.getName(),
                 Obj.getEmail(),
                Obj.getPhone(),
                Obj.getPassword()
            });
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clientlabel = new javax.swing.JLabel();
        doctorslabel = new javax.swing.JLabel();
        logoutlabel = new javax.swing.JLabel();
        billinglabel = new javax.swing.JLabel();
        dashboardlabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        appointmentslabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 179, 173));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\APEX HEALTH HAVEN timmed.png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        clientlabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        clientlabel.setText("Clients");
        clientlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientlabelMouseClicked(evt);
            }
        });

        doctorslabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        doctorslabel.setText("Doctors");
        doctorslabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctorslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorslabelMouseClicked(evt);
            }
        });

        logoutlabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        logoutlabel.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons8-logout-30.png")); // NOI18N
        logoutlabel.setText("Logout");
        logoutlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlabelMouseClicked(evt);
            }
        });

        billinglabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        billinglabel.setText("Billing History");
        billinglabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billinglabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billinglabelMouseClicked(evt);
            }
        });

        dashboardlabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        dashboardlabel.setText("Dashboard");
        dashboardlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardlabelMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons8-admin-24.png")); // NOI18N
        jLabel15.setText("Admin");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        appointmentslabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        appointmentslabel.setText("Appointments");
        appointmentslabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointmentslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentslabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentslabel)
                    .addComponent(jLabel15)
                    .addComponent(dashboardlabel)
                    .addComponent(billinglabel)
                    .addComponent(logoutlabel)
                    .addComponent(doctorslabel)
                    .addComponent(clientlabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(dashboardlabel)
                .addGap(18, 18, 18)
                .addComponent(clientlabel)
                .addGap(18, 18, 18)
                .addComponent(doctorslabel)
                .addGap(18, 18, 18)
                .addComponent(appointmentslabel)
                .addGap(18, 18, 18)
                .addComponent(billinglabel)
                .addGap(108, 108, 108)
                .addComponent(logoutlabel)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 179, 173));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(userTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LIST OF CUSTOMERS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(306, 306, 306))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientlabelMouseClicked
        AdClient apt = new AdClient();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_clientlabelMouseClicked

    private void doctorslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorslabelMouseClicked
        AdDoctor apt = new AdDoctor();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_doctorslabelMouseClicked

    private void logoutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseClicked
        Login apt = new Login();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutlabelMouseClicked

    private void billinglabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billinglabelMouseClicked
        AdBilling apt = new AdBilling();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_billinglabelMouseClicked

    private void dashboardlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardlabelMouseClicked
        Admin apt = new Admin();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_dashboardlabelMouseClicked

    private void appointmentslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentslabelMouseClicked
        AdAppointments apt = new AdAppointments();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_appointmentslabelMouseClicked

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
            java.util.logging.Logger.getLogger(AdClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentslabel;
    private javax.swing.JLabel billinglabel;
    private javax.swing.JLabel clientlabel;
    private javax.swing.JLabel dashboardlabel;
    private javax.swing.JLabel doctorslabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}