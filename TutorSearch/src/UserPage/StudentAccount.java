/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPage;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.sql.*;

/**
 *
 * @author cptanu
 */
public class StudentAccount extends javax.swing.JPanel {

    /**
     * Creates new form tutor_details
     */
    public StudentAccount(JPanel j, String name){
        j.removeAll();
        j.add(this);
        initComponents();
        nameLabel.setVisible(false);
        emailLabel.setVisible(false);
        phoneLabel.setVisible(false);
        user.setText(name);
        msg.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        placeLabel = new javax.swing.JLabel();
        fieldLabel = new javax.swing.JLabel();
        placeText = new javax.swing.JTextField();
        fieldText = new javax.swing.JTextField();
        logLabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        emailArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        phoneArea = new javax.swing.JTextArea();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        user.setEditable(false);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        placeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        placeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeLabel.setText("Place");

        fieldLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fieldLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fieldLabel.setText("Field");

        logLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        logLabel.setForeground(new java.awt.Color(102, 102, 102));
        logLabel.setText("Logged in as");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserPage/freedom.jpg"))); // NOI18N

        searchLabel.setBackground(new java.awt.Color(0, 51, 153));
        searchLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(0, 0, 153));
        searchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLabel.setText("Search for a mentor and choose the appropriate");

        nameArea.setBackground(new java.awt.Color(204, 204, 255));
        nameArea.setColumns(20);
        nameArea.setRows(5);
        nameArea.setBorder(null);
        jScrollPane1.setViewportView(nameArea);

        emailArea.setEditable(false);
        emailArea.setBackground(new java.awt.Color(204, 204, 255));
        emailArea.setColumns(20);
        emailArea.setRows(5);
        jScrollPane2.setViewportView(emailArea);

        phoneArea.setEditable(false);
        phoneArea.setBackground(new java.awt.Color(204, 204, 255));
        phoneArea.setColumns(20);
        phoneArea.setRows(5);
        jScrollPane3.setViewportView(phoneArea);

        nameLabel.setText("Name");

        emailLabel.setText("Email Id");

        phoneLabel.setText("Phone Number");

        msg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(204, 0, 0));
        msg.setText("Mentor not found!!!");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(placeText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(placeLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fieldText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(49, 49, 49)
                                .addComponent(logoutButton)
                                .addGap(23, 23, 23))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(320, 320, 320))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logLabel)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailLabel)
                                .addGap(167, 167, 167))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(msg)
                                .addGap(112, 112, 112)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLabel))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(msg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(emailLabel)
                            .addComponent(phoneLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(logoutButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeLabel)
                    .addComponent(fieldLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(okButton)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    Connection c = null;
    Statement s = null;
    
    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed

    }//GEN-LAST:event_userActionPerformed
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try{
            int flag = 0;
            String place = placeText.getText();
            String field = fieldText.getText();
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cptanu", "cptanu", "iluvmybrother");
            System.out.println("Connection establised");
            s = c.createStatement();
            String sql = "select mname, memailid, mphoneno from mentor where mplace ='"+place+"' and mfield ='"+field+"';";
            ResultSet rs = s.executeQuery(sql);
                while(rs.next()){
                    String mname = rs.getString("mname");
                    String memailid = rs.getString("memailid");
                    String mphoneno = rs.getString("mphoneno");
                    nameArea.append(mname+"\n");
                    emailArea.append(memailid+"\n");
                    phoneArea.append(mphoneno+"\n");      
                    flag = 1;
                }
                if((!rs.next())&&(flag==0 )){
                    msg.setVisible(true);
                }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        searchLabel.setVisible(false); nameLabel.setVisible(true);
        placeLabel.setVisible(false); emailLabel.setVisible(true);
        fieldLabel.setVisible(false); phoneLabel.setVisible(true);
        placeText.setVisible(false);
        fieldText.setVisible(false);
        okButton.setVisible(false);
        nameArea.setVisible(true); emailArea.setVisible(true);
        phoneArea.setVisible(true);
    }//GEN-LAST:event_okButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new HomePage.Mainframe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        nameArea.setText(null);
        emailArea.setText(null);
        phoneArea.setText(null);
        nameArea.setVisible(false);
        emailArea.setVisible(false);
        phoneArea.setVisible(false);
        nameLabel.setVisible(false);
        emailLabel.setVisible(false);
        phoneLabel.setVisible(false);
        searchLabel.setVisible(true); 
        placeLabel.setVisible(true); 
        fieldLabel.setVisible(true); 
        placeText.setVisible(true);
        fieldText.setVisible(true);
        okButton.setVisible(true);
        msg.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea emailArea;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fieldLabel;
    private javax.swing.JTextField fieldText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel msg;
    private javax.swing.JTextArea nameArea;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JTextArea phoneArea;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel placeLabel;
    private javax.swing.JTextField placeText;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
