/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author cptanu
 */
public class registertu extends javax.swing.JFrame {

    /**
     * Creates new form register tutor
     */
    public registertu() {
        this.getContentPane().setBackground(Color.white);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
            
    Connection c = null;
    Statement s = null;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        formLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        placeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        fieldLabel = new javax.swing.JLabel();
        experienceLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        placeText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        fieldText = new javax.swing.JTextField();
        expcText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Register/icon-tutor1.png"))); // NOI18N

        formLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        formLabel.setForeground(new java.awt.Color(0, 0, 102));
        formLabel.setText("Registration Form");

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameLabel.setText("Name");

        placeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        placeLabel.setText("Place");

        emailLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emailLabel.setText("Email Id");

        fieldLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fieldLabel.setText("Field");

        experienceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        experienceLabel.setText("Experience");

        phoneLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        phoneLabel.setText("Phone No.");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        fieldText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTextActionPerformed(evt);
            }
        });

        expcText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expcTextActionPerformed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passLabel.setText("Password");

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(placeLabel)
                            .addComponent(nameLabel)
                            .addComponent(emailLabel)
                            .addComponent(fieldLabel)
                            .addComponent(experienceLabel)
                            .addComponent(phoneLabel)
                            .addComponent(passLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(placeText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(expcText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerButton)
                            .addComponent(formLabel))))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placeLabel)
                            .addComponent(placeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldLabel)
                            .addComponent(fieldText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(experienceLabel)
                            .addComponent(expcText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLabel)
                            .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(formLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        dispose();
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cptanu", "cptanu", "iluvmybrother");
            System.out.println("Connection establised");
            s = c.createStatement();
            String name = nameText.getText();
            String place = placeText.getText();
            String emailid = emailText.getText();
            String field = fieldText.getText();
            String experience = expcText.getText();
            String phone = phoneText.getText();
            String password = new String(passField.getPassword());
            String sql = "insert into mentor values('"+name+"','"+place+"','"+field+"','"+experience+"','"+emailid+"','"+phone+"','"+password+"')";
            s.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed

    }//GEN-LAST:event_nameTextActionPerformed

    private void fieldTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTextActionPerformed

    }//GEN-LAST:event_fieldTextActionPerformed

    private void expcTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expcTextActionPerformed

    }//GEN-LAST:event_expcTextActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed

    }//GEN-LAST:event_passFieldActionPerformed

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
            java.util.logging.Logger.getLogger(registertu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registertu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registertu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registertu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registertu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField expcText;
    private javax.swing.JLabel experienceLabel;
    private javax.swing.JLabel fieldLabel;
    private javax.swing.JTextField fieldText;
    private javax.swing.JLabel formLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel placeLabel;
    private javax.swing.JTextField placeText;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
