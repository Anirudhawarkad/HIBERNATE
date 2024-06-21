
package org.nlt.view;


import java.io.File;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Query;

import org.nlt.model.Persons;
import static org.nlt.view.ParentInterface.ses;


public class PersonFrame extends javax.swing.JFrame implements ParentInterface {

    private Persons person;
    
    public PersonFrame() {
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
        nameTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        cityComboBox = new javax.swing.JComboBox<>();
        cityAddButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jPanel2.setLayout(new java.awt.GridLayout(5, 2, 10, 10));

        jPanel4.setLayout(new java.awt.GridLayout(1, 2, 50, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter Name");
        jPanel4.add(jLabel1);

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(nameTextField);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2, 50, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Enter Age");
        jPanel5.add(jLabel2);

        ageTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel5.add(ageTextField);

        jPanel2.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2, 50, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Enter Phone");
        jPanel6.add(jLabel3);
        jPanel6.add(phoneTextField);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2, 50, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Select City");
        jPanel7.add(jLabel4);

        jPanel9.setLayout(new java.awt.BorderLayout());

        cityComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "NAGPUR", "PUNE", "MUMBAI" }));
        cityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboBoxActionPerformed(evt);
            }
        });
        jPanel9.add(cityComboBox, java.awt.BorderLayout.CENTER);

        cityAddButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cityAddButton.setText("NEW");
        cityAddButton.setFocusPainted(false);
        cityAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityAddButtonActionPerformed(evt);
            }
        });
        jPanel9.add(cityAddButton, java.awt.BorderLayout.EAST);

        jPanel7.add(jPanel9);

        jPanel2.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(1, 6, 10, 10));

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel8.add(submitButton);

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel8.add(updateButton);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel8.add(deleteButton);

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setText("RESET");
        jPanel8.add(resetButton);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("REPORT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1);

        reportButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reportButton.setText("REPORT ALL");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });
        jPanel8.add(reportButton);

        jPanel2.add(jPanel8);

        jPanel1.add(jPanel2);

        personTable.setModel(new javax.swing.table.DefaultTableModel(
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
        personTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        try {
            String name =nameTextField.getText().toUpperCase();
            int age = Integer.parseInt(ageTextField.getText());
            long phone=Long.parseLong(phoneTextField.getText());
            String cityName = cityComboBox.getSelectedItem().toString();
            
            //validation
            if(name.isEmpty()|| cityName.equalsIgnoreCase("Select")){
                JOptionPane.showMessageDialog(this,"Invalid Input","Person Frame", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Persons person= new Persons();
                person.setAge(age);
                person.setCity(cityName);
                person.setCreated(new Date());
                person.setModified(new Date());
                person.setName(name);
                person.setPhone(phone);
                person.setStatus(1);
                  
              ses.beginTransaction();
              ses.save(person);//object will into db i.e into persons table
              ses.getTransaction().commit();
              JOptionPane.showMessageDialog(this,"Record Saved Successfully" , "person Frame", JOptionPane.INFORMATION_MESSAGE);
              
                //reset data
                nameTextField.setText("");
                ageTextField.setText("");
                phoneTextField.setText("");
                cityComboBox.setSelectedIndex(0);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex,"person Frame",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityComboBoxActionPerformed

    private void personTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personTableMouseClicked
        try {
            String pid =personTable.getValueAt(personTable.getSelectedRow(),0).toString();
            int id = Integer.parseInt(pid);
            ses.beginTransaction();
            person = (Persons) ses.get(Persons.class,id);
            ses.getTransaction().commit();
            
            nameTextField.setText(person.getName());
            ageTextField.setText(person.getAge()+ "");
            phoneTextField.setText(person.getPhone()+"");
            cityComboBox.setSelectedItem(person.getCity());
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex,"person Frame",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_personTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(person ==null){
            JOptionPane.showMessageDialog(this,"please Select Record To Update", "person Frame",JOptionPane.INFORMATION_MESSAGE);
        }else{
             String name =nameTextField.getText().toUpperCase();
            int age = Integer.parseInt(ageTextField.getText());
            long phone=Long.parseLong(phoneTextField.getText());
            String cityName = cityComboBox.getSelectedItem().toString();
            
            //validation
            if(name.isEmpty()|| cityName.equalsIgnoreCase("Select")){
                JOptionPane.showMessageDialog(this,"Invalid Input","Person Frame", JOptionPane.ERROR_MESSAGE);
            }
            else{
               
                person.setAge(age);
                person.setCity(cityName);
                person.setModified(new Date());
                person.setName(name);
                person.setPhone(phone);
               
                  
              ses.beginTransaction();
              ses.update(person);//object will into db i.e into persons table
              ses.getTransaction().commit();
              JOptionPane.showMessageDialog(this,"Record updated Successfully" , "person Frame", JOptionPane.INFORMATION_MESSAGE);
              
                //reset data
                nameTextField.setText("");
                ageTextField.setText("");
                phoneTextField.setText("");
                cityComboBox.setSelectedIndex(0);
                person = null;
                setTableData();
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
      if(person==null){
           JOptionPane.showMessageDialog(this,"please Select Record To Delete", "person Frame",JOptionPane.INFORMATION_MESSAGE);
        }else{
         
                person.setModified(new Date());
                person.setStatus(0);
               
                  
              ses.beginTransaction();
              ses.update(person);//object will into db i.e into persons table
              ses.getTransaction().commit();
              JOptionPane.showMessageDialog(this,"Record Deleted Successfully" , "person Frame", JOptionPane.INFORMATION_MESSAGE);
              
                //reset data
                nameTextField.setText("");
                ageTextField.setText("");
                phoneTextField.setText("");
                cityComboBox.setSelectedIndex(0);
                person = null;
                setTableData();
            
             
      }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cityAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityAddButtonActionPerformed
       cityFrame.setVisible(true);
       this.setEnabled(false);
    }//GEN-LAST:event_cityAddButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        try {
            File file = new File(".");
            String path = file.getCanonicalPath()+File.separator+"build"+File.separator+"classes"+File.separator+"ORG"+File.separator+"NLT"+File.separator+"ireport"+File.separator+"report1.jrxml";
            File f = new File(path);
            if(f.exists())
            {
                JasperDesign jd = JRXmlLoader.load(f);
                String sql="SELECT\n" +
                            "     persons.`age` AS persons_age,\n" +
                            "     persons.`name` AS persons_name,\n" +
                            "     persons.`phone` AS persons_phone,\n" +
                            "     persons.`city` AS persons_city\n" +
                            "FROM\n" +
                            "     `persons` persons";
                
                JRDesignQuery query = new JRDesignQuery();
                query.setText(sql);
                
                jd.setQuery(query);
                JasperReport jr = JasperCompileManager.compileReport(jd);
                
                JasperPrint jp = JasperFillManager.fillReport(jr, null, ses.connection());
                JasperViewer.viewReport(jp,false);
                
                JasperExportManager.exportReportToPdfFile(jp,"PersonReport");
            }
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_reportButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton cityAddButton;
    public javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable personTable;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

public void setTableData()
{
ses.beginTransaction();
        
        Query query =ses.createQuery("From Persons where status =1");
        List<Persons> personList= query.list();
        ses.getTransaction().commit();
  
  String[] cols={"ID","NAME","AGE","PHONE","CITY"};
  String[][] data =new String[personList.size()][cols.length];
  int i=0;
  for (Persons person : personList){
      data[i][0]=person.getId()+"";
      data[i][1]=person.getName();
      data[i][2]=person.getAge()+"";
      data[i][3]=person.getPhone()+"";
      data[i][4]=person.getCity();
      i++;
  }
    DefaultTableModel model=new DefaultTableModel(data,cols);
    personTable.setModel(model);
    
    
  }
}
  
  
    
