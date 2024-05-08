/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author apurva
 */
public class Agents extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Agents() {
        initComponents();
        SelectAgent();
    }
    
    Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void SelectAgent()
    {
        try{
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Java_Project","User1","user1");
        St = Con.createStatement();
        Rs= St.executeQuery("SELECT * FROM User1.AGENTS");
        AGENTS.setModel(DbUtils.resultSetToTableModel(Rs));
        
        } catch(SQLException e )
        {
            e.printStackTrace();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        MedicinesBtn = new javax.swing.JLabel();
        CompanyBtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        PASSWORD = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        AGENTS = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        AGE = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        GENDER = new javax.swing.JTextField();
        ExitBtn = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        BillingBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));

        MedicinesBtn.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        MedicinesBtn.setForeground(new java.awt.Color(255, 255, 255));
        MedicinesBtn.setText("MEDICINES");
        MedicinesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicinesBtnMouseClicked(evt);
            }
        });

        CompanyBtn.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        CompanyBtn.setForeground(new java.awt.Color(255, 255, 255));
        CompanyBtn.setText("COMPANY");
        CompanyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompanyBtnMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Maruti Medicals");

        jLabel29.setFont(new java.awt.Font("Liberation Sans", 2, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 51));
        jLabel29.setText("Manage Agents");

        jLabel30.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel30.setText("NAME");

        jLabel31.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel31.setText("ID");

        jLabel32.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel32.setText("PASSWORD");

        jLabel33.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel33.setText("AGE");

        jLabel34.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel34.setText("PHONE");

        jLabel35.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel35.setText("GENDER");

        ID.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        PASSWORD.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        NAME.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        AddBtn.setBackground(new java.awt.Color(0, 102, 51));
        AddBtn.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(0, 102, 51));
        DeleteBtn.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        AGENTS.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        AGENTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "PASSWORD", "GENDER", "PHONE"
            }
        ));
        AGENTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AGENTSMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(AGENTS);

        jLabel36.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel36.setText("AGENTS LIST");

        AGE.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        AGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGEActionPerformed(evt);
            }
        });

        PHONE.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        GENDER.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(DeleteBtn))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AGE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(PHONE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GENDER, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(59, 59, 59))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(486, 486, 486))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(434, 434, 434))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33)
                        .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(DeleteBtn))
                .addGap(97, 97, 97)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        ExitBtn.setFont(new java.awt.Font("Liberation Sans", 1, 30)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setText("X");
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });

        BillingBtn.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        BillingBtn.setForeground(new java.awt.Color(255, 255, 255));
        BillingBtn.setText("Billing");
        BillingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillingBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CompanyBtn)
                            .addComponent(MedicinesBtn)
                            .addComponent(BillingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(CompanyBtn)
                        .addGap(122, 122, 122)
                        .addComponent(MedicinesBtn)
                        .addGap(94, 94, 94)
                        .addComponent(BillingBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AGEActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
         try{
            
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Java_Project","User1","user1");
            PreparedStatement add = Con.prepareStatement("INSERT INTO AGENTS (ID, NAME, AGE, PHONE, PASSWORD, GENDER) VALUES (?, ?, ?, ?, ?, ?)");
            add.setInt(1, Integer.parseInt(ID.getText()));
            add.setString(2,NAME.getText());
            add.setInt(3,Integer.parseInt(AGE.getText()));
            add.setString(4,PHONE.getText());
            add.setString(5,PASSWORD.getText());
            add.setString(6,GENDER.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Agent added Successfully");
            Con.close();
            SelectAgent();
            
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(ID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the Agent to be deleted.");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/Java_Project","User1","user1");
                String Id = ID.getText();
                String Query = "DELETE FROM User1.AGENTS WHERE ID=Id";
                Statement Add= Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "The Agent is Deleted.");
                SelectAgent();
                Con.close();
                
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void AGENTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AGENTSMouseClicked
        DefaultTableModel model = (DefaultTableModel)AGENTS.getModel();
        int Myindex = AGENTS.getSelectedRow();
        ID.setText(model.getValueAt(Myindex, 0).toString());
        NAME.setText(model.getValueAt(Myindex, 1).toString());
        AGE.setText(model.getValueAt(Myindex, 2).toString());
        PHONE.setText(model.getValueAt(Myindex, 3).toString());
        PASSWORD.setText(model.getValueAt(Myindex, 4).toString());
        GENDER.setText(model.getValueAt(Myindex, 5).toString());
    }//GEN-LAST:event_AGENTSMouseClicked

    private void CompanyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompanyBtnMouseClicked
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CompanyBtnMouseClicked

    private void MedicinesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicinesBtnMouseClicked
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MedicinesBtnMouseClicked

    private void BillingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillingBtnMouseClicked
        new Billing().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BillingBtnMouseClicked

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JTable AGENTS;
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel BillingBtn;
    private javax.swing.JLabel CompanyBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JTextField GENDER;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel MedicinesBtn;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JTextField PHONE;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
