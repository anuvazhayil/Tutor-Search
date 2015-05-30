/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import java.awt.Color;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
/**
 *
 * @author cptanu
 */
public class registerst extends javax.swing.JFrame {

    /**
     * Creates new form register student
     */
    public registerst() {
        this.getContentPane().setBackground(Color.white);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        formLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        placeLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        placeText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Register/index1.jpeg"))); // NOI18N

        formLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        formLabel.setForeground(new java.awt.Color(0, 0, 102));
        formLabel.setText("Registration Form");

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameLabel.setText("Name");

        placeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        placeLabel.setText("Place");

        ageLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ageLabel.setText("Age");

        emailLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emailLabel.setText("Email Id");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passLabel.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logo)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerButton)
                    .addComponent(formLabel))
                .addGap(0, 83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageLabel)
                    .addComponent(placeLabel)
                    .addComponent(passLabel)
                    .addComponent(emailLabel)
                    .addComponent(nameLabel))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(placeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(emailText)
                    .addComponent(ageText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(formLabel))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(placeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(placeLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(registerButton)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection c = null;
    Statement s = null;
    
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        dispose();
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cptanu", "cptanu", "iluvmybrother");
            System.out.println("Connection establised");
            s = c.createStatement();
            String name = nameText.getText();
            String place = placeText.getText();
            String age = ageText.getText();
            String emailid = emailText.getText();
            String password = new String(passField.getPassword());
            String sql = "insert into student values('"+name+"','"+place+"','"+age+"','"+emailid+"','"+password+"');";
            s.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        
    }//GEN-LAST:event_emailTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(registerst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel formLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel placeLabel;
    private javax.swing.JTextField placeText;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
