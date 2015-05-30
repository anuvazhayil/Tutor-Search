
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomePage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

/**
 *
 * @author cptanu
 */
public class Mainframe extends javax.swing.JFrame {
    
    private Mainframe(String t) {
        setTitle(t);
        initComponents();
        invalidLabel.setVisible(false);
    }
    public Mainframe(){
        initComponents();
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myFrame = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        registerLabel = new javax.swing.JLabel();
        registerAs = new javax.swing.JComboBox();
        signIn = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        rightsText = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        chooseLogin = new javax.swing.JComboBox();
        invalidLabel = new javax.swing.JLabel();
        add1 = new javax.swing.JLabel();
        add2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        myFrame.setBackground(new java.awt.Color(204, 255, 204));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomePage/sizelogo.png"))); // NOI18N

        registerLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registerLabel.setText("Register As");

        registerAs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Mentor" }));
        registerAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAsActionPerformed(evt);
            }
        });

        signIn.setBackground(new java.awt.Color(0, 51, 204));
        signIn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        signIn.setForeground(new java.awt.Color(0, 0, 204));
        signIn.setText("Sign in to use Tutor Search");

        emailLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        emailLabel.setText("Email Id");

        passLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passLabel.setText("Password");

        rightsText.setBackground(new java.awt.Color(153, 204, 255));
        rightsText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rightsText.setText("Copyright © 2003-2014 AGL University. All rights reserved. Powered by AGL Girls");
        rightsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightsTextActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loginLabel.setText("Login As");

        chooseLogin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Mentor" }));
        chooseLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseLoginActionPerformed(evt);
            }
        });

        invalidLabel.setForeground(new java.awt.Color(204, 0, 0));
        invalidLabel.setText("Invalid username and/or password");

        add1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add1.setText("Search for a local mentor  ");

        add2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add2.setText("Enjoy effortless learning...");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myFrameLayout = new javax.swing.GroupLayout(myFrame);
        myFrame.setLayout(myFrameLayout);
        myFrameLayout.setHorizontalGroup(
            myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFrameLayout.createSequentialGroup()
                .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myFrameLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(logo))
                    .addGroup(myFrameLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add2)
                            .addComponent(add1))))
                .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myFrameLayout.createSequentialGroup()
                                    .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(myFrameLayout.createSequentialGroup()
                                            .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(passLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(80, 80, 80)
                                            .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(passText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(emailText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(signIn))
                                    .addGap(62, 62, 62))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myFrameLayout.createSequentialGroup()
                                    .addComponent(registerAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(160, 160, 160)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myFrameLayout.createSequentialGroup()
                                .addComponent(registerLabel)
                                .addGap(63, 63, 63)
                                .addComponent(exit)
                                .addGap(20, 20, 20))))
                    .addGroup(myFrameLayout.createSequentialGroup()
                        .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myFrameLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(loginLabel))
                            .addGroup(myFrameLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(chooseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(myFrameLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(invalidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(rightsText)
        );
        myFrameLayout.setVerticalGroup(
            myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myFrameLayout.createSequentialGroup()
                .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myFrameLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(logo)
                        .addGap(12, 12, 12))
                    .addGroup(myFrameLayout.createSequentialGroup()
                        .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myFrameLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(registerLabel))
                            .addGroup(myFrameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invalidLabel)
                        .addGap(6, 6, 6)))
                .addGap(12, 12, 12)
                .addComponent(signIn)
                .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myFrameLayout.createSequentialGroup()
                        .addGroup(myFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(myFrameLayout.createSequentialGroup()
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(myFrameLayout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(loginLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myFrameLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(rightsText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection c = null;
    Statement s = null;
    private void rightsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightsTextActionPerformed
        
    }//GEN-LAST:event_rightsTextActionPerformed

    private void registerAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAsActionPerformed
        Object selected = registerAs.getSelectedItem();
                if(selected.toString().equals("Student")){
                   Register.registerst student = new Register.registerst();
                   student.setVisible(true);
                }
                else if(selected.toString().equals("Mentor")){
                   Register.registertu tutor = new Register.registertu();
                   tutor.setVisible(true);
                }
    }//GEN-LAST:event_registerAsActionPerformed

    private void chooseLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseLoginActionPerformed
        Object item = chooseLogin.getSelectedItem();
    }//GEN-LAST:event_chooseLoginActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe("Tutor Search").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add1;
    private javax.swing.JLabel add2;
    private javax.swing.JComboBox chooseLogin;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton exit;
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel myFrame;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passText;
    private javax.swing.JComboBox registerAs;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JTextField rightsText;
    private javax.swing.JLabel signIn;
    // End of variables declaration//GEN-END:variables

}
