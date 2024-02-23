/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import DAO.Dao;
import Model.Appoints;
import Model.GetAppt;
import Model.LogIn;
import Model.User;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class SentAppointments extends javax.swing.JFrame {
DefaultTableModel tableModel = new DefaultTableModel();
    /** Creates new form SentAppointments */
    public SentAppointments() {
        initComponents();
        addColumnTableHeader();
       // addRowTableData();
    }
    
   private void addColumnTableHeader(){
        
        tableModel.addColumn("Names");
        tableModel.addColumn("Day");
        tableModel.addColumn("Time");
        tableModel.addColumn("Doctor");
        tableModel.addColumn("Status");
        
        sentappsTable.setModel(tableModel);
    }
     private void addRowTableData(){
         tableModel.setRowCount(0);
        Dao dao = new Dao();
        GetAppt obj = new GetAppt();
        List<Appoints> users = dao.allAppts(obj);
        for (Appoints Obj : users) {
            tableModel.addRow(new Object[]{
                    Obj.getName(),
                    Obj.getDay(),
                    Obj.getTime(),
                    Obj.getDoctor(),
                    Obj.getStatus()
            });
        }
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        welcomelbl = new javax.swing.JLabel();
        reqapplbl = new javax.swing.JLabel();
        sentlbl = new javax.swing.JLabel();
        logoutlbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        patientlbl = new javax.swing.JLabel();
        presclbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sentappsTable = new javax.swing.JTable();
        welcomelbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 179, 173));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\APEX HEALTH HAVEN last.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        welcomelbl.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        welcomelbl.setText("Welcome");
        welcomelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        welcomelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcomelblMouseClicked(evt);
            }
        });

        reqapplbl.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        reqapplbl.setText("RequestAppointment");
        reqapplbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reqapplbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reqapplblMouseClicked(evt);
            }
        });

        sentlbl.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        sentlbl.setText("View Sent Appointment");
        sentlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sentlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sentlblMouseClicked(evt);
            }
        });

        logoutlbl.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        logoutlbl.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons8-logout-30.png")); // NOI18N
        logoutlbl.setText("Logout");
        logoutlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlblMouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons8-user-24.png")); // NOI18N

        patientlbl.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        patientlbl.setText("Patient");

        presclbl.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        presclbl.setText("Prescrption and comments");
        presclbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        presclbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presclblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presclbl)
                    .addComponent(logoutlbl)
                    .addComponent(reqapplbl)
                    .addComponent(welcomelbl)
                    .addComponent(sentlbl)
                    .addComponent(patientlbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(patientlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addComponent(welcomelbl)
                .addGap(18, 18, 18)
                .addComponent(reqapplbl)
                .addGap(18, 18, 18)
                .addComponent(sentlbl)
                .addGap(18, 18, 18)
                .addComponent(presclbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(logoutlbl)
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(0, 179, 173));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        sentappsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(sentappsTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );

        welcomelbl1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        welcomelbl1.setForeground(new java.awt.Color(255, 255, 255));
        welcomelbl1.setText("Sent Appointments");
        welcomelbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        welcomelbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcomelbl1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter your ID");

        Search.setBackground(new java.awt.Color(0, 0, 0));
        Search.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(welcomelbl1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addComponent(Search)))
                        .addGap(0, 106, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(welcomelbl1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Search)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void welcomelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomelblMouseClicked
    LogIn loggedInUser = new LogIn();
        MainForm mainForm = new MainForm(loggedInUser);
        mainForm.setVisible(true);
        mainForm.pack();
        mainForm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_welcomelblMouseClicked

    private void reqapplblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reqapplblMouseClicked
        Appointment apt = new Appointment();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_reqapplblMouseClicked

    private void sentlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sentlblMouseClicked
        
        SentAppointments apt = new SentAppointments();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_sentlblMouseClicked

    private void logoutlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlblMouseClicked
        Login apt = new Login();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutlblMouseClicked

    private void presclblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presclblMouseClicked
        Prescriptions apt = new Prescriptions();
        apt.setVisible(true);
        apt.pack();
        apt.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_presclblMouseClicked

    private void welcomelbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomelbl1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomelbl1MouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
    if(idtxt.getText().trim().isEmpty()){
     JOptionPane.showMessageDialog(this, "Insert Your Id to serach");
      }else{       
        GetAppt obj = new GetAppt();
    obj.setId(Integer.parseInt(idtxt.getText()));
    
    tableModel.setRowCount(0);
        Dao dao = new Dao();
         List<Appoints> users = dao.allAppts(obj);
        for (Appoints Obj : users) {
            tableModel.addRow(new Object[]{
                    Obj.getName(),
                    Obj.getDay(),
                    Obj.getTime(),
                    Obj.getDoctor(),
                    Obj.getStatus()
            });
        }
    }
    }//GEN-LAST:event_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(SentAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SentAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SentAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SentAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SentAppointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutlbl;
    private javax.swing.JLabel patientlbl;
    private javax.swing.JLabel presclbl;
    private javax.swing.JLabel reqapplbl;
    private javax.swing.JTable sentappsTable;
    private javax.swing.JLabel sentlbl;
    private javax.swing.JLabel welcomelbl;
    private javax.swing.JLabel welcomelbl1;
    // End of variables declaration//GEN-END:variables

}