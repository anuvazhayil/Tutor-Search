/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author cptanu
 */
public class UpdateTutor extends javax.swing.JFrame {

    /**
     * Creates new form UpdateTutor
     */
    public UpdateTutor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        frame = new javax.swing.JPanel();
        placeText = new javax.swing.JTextField();
        fieldText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        expeText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        placeLabel = new javax.swing.JLabel();
        fieldLabel = new javax.swing.JLabel();
        expeLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        updateLabel = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frame.setBackground(new java.awt.Color(204, 255, 204));

        placeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeTextActionPerformed(evt);
            }
        });

        fieldText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTextActionPerformed(evt);
            }
        });

        expeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expeTextActionPerformed(evt);
            }
        });

        placeLabel.setText("Place");

        fieldLabel.setText("Field");

        expeLabel.setText("Experience");

        phoneLabel.setText("Phone No.");

        passLabel.setText("Password");

        updateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        updateLabel.setForeground(new java.awt.Color(51, 51, 255));
        updateLabel.setText("Upate your Info");

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        nameLabel.setText("Enter your name:");

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(ok))
                    .addGroup(frameLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(updateLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLayout.createSequentialGroup()
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frameLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(nameLabel)
                        .addGap(57, 57, 57)
                        .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addGroup(frameLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(expeLabel)
                            .addGroup(frameLayout.createSequentialGroup()
                                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fieldLabel)
                                    .addComponent(placeLabel))
                                .addGap(17, 17, 17))
                            .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passLabel)
                                .addComponent(phoneLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordText)
                            .addComponent(phoneText)
                            .addComponent(placeText, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(fieldText)
                            .addComponent(expeText))))
                .addGap(91, 91, 91))
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(updateLabel)
                .addGap(17, 17, 17)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeLabel)
                    .addComponent(placeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expeLabel)
                    .addComponent(expeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void expeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expeTextActionPerformed

    }//GEN-LAST:event_expeTextActionPerformed
    Connection c = null;
    Statement s = null;
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        dispose();
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cptanu", "cptanu", "iluvmybrother");
            System.out.println("Connection establised");
            s = c.createStatement();
            String name = nameText.getText();
            String place = placeText.getText();
            String field = fieldText.getText();
            String experience = expeText.getText();
            String phone = phoneText.getText();
            String password = new String(passwordText.getPassword());
            String sql = "update mentor set mplace = '"+place+"',mfield ='"+field+"', mexperience = '"+experience+"',mphoneno = '"+phone+"',mpassword = '"+password+"' where mname = '"+name+"';";
            s.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_okActionPerformed

    private void fieldTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTextActionPerformed

    }//GEN-LAST:event_fieldTextActionPerformed

    private void placeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeTextActionPerformed

    }//GEN-LAST:event_placeTextActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel expeLabel;
    private javax.swing.JTextField expeText;
    private javax.swing.JLabel fieldLabel;
    private javax.swing.JTextField fieldText;
    private javax.swing.JPanel frame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton ok;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel placeLabel;
    private javax.swing.JTextField placeText;
    private javax.swing.JLabel updateLabel;
    // End of variables declaration//GEN-END:variables
}
