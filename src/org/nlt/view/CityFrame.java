
package org.nlt.view;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.nlt.model.Cities;
import org.nlt.model.Persons;
import static org.nlt.view.ParentInterface.ses;


public class CityFrame extends javax.swing.JFrame implements ParentInterface{

    private Cities city;
    

   public CityFrame() {
        initComponents();
        setTableData();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cityTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 10, 50));

        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 50, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter City Name");
        jPanel4.add(jLabel1);

        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });
        jPanel4.add(cityTextField);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel5.add(submitButton);

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel5.add(updateButton);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setText("DELETE");
        jPanel5.add(deleteButton);

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setText("RESET");
        jPanel5.add(resetButton);

        jPanel2.add(jPanel5);

        jPanel1.add(jPanel2);

        cityTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityTable.setModel(new javax.swing.table.DefaultTableModel(
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
        cityTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cityTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
         try {
            String name =cityTextField.getText().toUpperCase();
         
            //validation
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this,"Invalid Input","Cities Frame", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Cities city= new Cities();//create Empty object.
                // city.setCity(cityName);//
                city.setName(name);
                city.setCreated(new Date());
                city.setModified(new Date());
                city.setStatus(1);
                  
              ses.beginTransaction();
              ses.save(city);//object will into db i.e into persons table
              ses.getTransaction().commit();
              
              JOptionPane.showMessageDialog(this,"Record Saved Successfully" , "Cities Frame", JOptionPane.INFORMATION_MESSAGE);
              
                //reset data
              cityTextField.setText(city.getName());
           }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex,"Cities Frame",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void cityTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityTableMouseClicked
        try {
            String pid =cityTable.getValueAt(cityTable.getSelectedRow(),0).toString();
            int id = Integer.parseInt(pid);
            ses.beginTransaction();
            city = (Cities) ses.get(Cities.class,id);
            ses.getTransaction().commit();
            
            cityTextField.setText(city.getName());
            
             
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex,"city Frame",JOptionPane.ERROR_MESSAGE);
        }
                                
    }//GEN-LAST:event_cityTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(city ==null)
        {
            JOptionPane.showMessageDialog(this,"please Select Record To Update", "city Frame",JOptionPane.INFORMATION_MESSAGE);
        }
      else
        {
             String name =cityTextField.getText().toUpperCase();
           
      //validation
            if(name.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Invalid Input","Cities Frame", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
               
                
                
                city.setModified(new Date());
                city.setName(name);
             
               
              ses.beginTransaction();
              ses.update(city);//object will into db i.e into persons table
              ses.getTransaction().commit();
              JOptionPane.showMessageDialog(this,"Record updated Successfully" , "Cities Frame", JOptionPane.INFORMATION_MESSAGE);
              
              cityTextField.setText("");
                //reset data
                
                city = null;
                setTableData();
            }
        }
    }                                            

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) { 
         if(city==null)
         {
           JOptionPane.showMessageDialog(this,"please Select Record To Delete", "Cities Frame",JOptionPane.INFORMATION_MESSAGE);
        }
         else
         {
                city.setModified(new Date());
                city.setStatus(0);
               
              ses.beginTransaction();
              ses.delete(city);//object will into db i.e into Cities table
              ses.getTransaction().commit();
              JOptionPane.showMessageDialog(this,"Record Deleted Successfully" , "Cities Frame", JOptionPane.INFORMATION_MESSAGE);
              
              cityTextField.setText("");
              
                city=null;
                setTableData();
            } 
    }//GEN-LAST:event_updateButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       personFrame.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

  
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
            java.util.logging.Logger.getLogger(CityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CityFrame().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cityTable;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
public void setTableData()
{
ses.beginTransaction();
        
        Query query =ses.createQuery("From Cities where status =1");
        List<Cities> cityList= query.list();
        ses.getTransaction().commit();
  
  String[] cols={"ID","NAME"};
  String[][] data =new String[cityList.size()][cols.length];
  int i=0;
  
  
  personFrame.cityComboBox.removeAllItems();
  personFrame.cityComboBox.addItem("SELECT");
  for (Cities city : cityList)
  {
      data[i][0]=city.getId()+"";
      data[i][1]=city.getName();
      personFrame.cityComboBox.addItem(city.getName());
       i++;
  }
    DefaultTableModel model=new DefaultTableModel(data,cols);
    cityTable.setModel(model);   
  }
}
        
