/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railway;
import java.lang.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class passenger_details extends javax.swing.JFrame {

    /**
     * Creates new form passenger_details
     */
    public passenger_details() {
        initComponents();
        Connect();
       Details();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
        public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con =  (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/reservation","root","");
             System.out.println("connected");
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(book.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        public void Details(){
        try {
            pst= con.prepareStatement("select * from passengerdetail");
            rs = pst.executeQuery();
            ResultSetMetaData rsd = rs.getMetaData();
            int c;
            c = rsd.getColumnCount();
            DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                Vector v = new Vector();
                
                for(int i=0;i<=c;i++){
                   v.add(rs.getString("id"));
                   v.add(rs.getString("name"));
                   v.add(rs.getInt("age"));
                   v.add(rs.getString("gender"));
                    
                }
                d.addRow(v);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(passenger_details.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtgender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Gender");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Third Gender" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(txtage)
                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(38, 38, 38))
        );

        jTable1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "         ID", "       Name", "        Age", "     Gender"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("PASSENGER DETAILS");

        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton5.setText("Confirm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String name = txtname.getText();
            String age = txtage.getText();
            String id = txtid.getText();
            String gender = txtgender.getSelectedItem().toString();               
            pst = con.prepareStatement("insert into passengerdetail(id,name,age,gender)values(?,?,?,?)");
            pst.setString(1,id);
            pst.setString(2,name);
            pst.setString(3,age);
            pst.setString(4,gender);
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this,"Record added");
            }
            else{
                JOptionPane.showMessageDialog(this,"Record not added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(passenger_details.class.getName()).log(Level.SEVERE, null, ex);
        }
         txtname.setText("");  
         txtage.setText("");
         txtid.setText("");
         txtgender.setSelectedItem("Select");
         txtname.requestFocus();
         Details();
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
         int selectindex = jTable1.getSelectedRow();
         txtid.setText(d.getValueAt(selectindex,0).toString());
         txtname.setText(d.getValueAt(selectindex,1).toString());
         txtage.setText(d.getValueAt(selectindex,2).toString());
         txtgender.setSelectedItem(d.getValueAt(selectindex,3).toString());
         jButton1.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String name = txtname.getText();
            String age = txtage.getText();
            String gender = txtgender.getSelectedItem().toString(); 
            String id = txtid.getText();
            pst = con.prepareStatement("update passengerdetail set name = ?, age = ? ,gender = ? where id = ?");
            
            pst.setString(1,name);
            pst.setString(2,age);
            pst.setString(3, gender);
            pst.setString(4, id);
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this,"Record updated");
            }
            else{
                JOptionPane.showMessageDialog(this,"Record not updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(passenger_details.class.getName()).log(Level.SEVERE, null, ex);
        }
         txtname.setText("");  
         txtage.setText("");
         txtgender.setSelectedItem("Select");
         txtid.setText("");
         txtname.requestFocus();
         Details();
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
             
            String id = txtid.getText();
            pst = con.prepareStatement("delete from passengerdetail where id = ?");
            pst.setString(1,id);
            
            int k = pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(this,"Record deleted");
            }
            else{
                JOptionPane.showMessageDialog(this,"Record not deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(passenger_details.class.getName()).log(Level.SEVERE, null, ex);
        }
         txtname.setText("");  
         txtage.setText("");
         txtgender.setSelectedItem("Select");
         txtid.setText("");
         txtname.requestFocus();
         Details();
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(this,"Details Stored Successfully!!");
        JOptionPane.showMessageDialog(this,"To proceed with the payment click on NEXT");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        payment p = new payment();
        this.hide();
        p.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(passenger_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passenger_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passenger_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passenger_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passenger_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtage;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}