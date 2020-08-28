/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_handball;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Luka
 */
public class TreningForma extends javax.swing.JFrame {
    Connection1 conn1 = new Connection1();
    
//TreningClass.java
    
    TreningClass treningclass = new TreningClass();
    
    /**
     * Creates new form TreningForma
     */
    public TreningForma() {
        initComponents();
        
        
       // prikazivanje pocetne tablice i osvjezivanje tablice on reload
         jTableTrening.setModel(new DefaultTableModel(null, new Object[]{"Ime","Prezime","training_id","2.1","5.1","8.1","15.1","20.1","22.1","25.1", "30.1"}));
            treningclass.TreningSijecanj(jTableTrening);
    }
       

   
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTrening = new javax.swing.JTable();
        jComboBoxMjesec = new javax.swing.JComboBox<>();
        jTextFieldIme = new javax.swing.JTextField();
        jTextFieldPrezime = new javax.swing.JTextField();
        jTextFieldosmi = new javax.swing.JTextField();
        jTextFielddrugi = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldpet = new javax.swing.JTextField();
        jTextFieldpeti = new javax.swing.JTextField();
        jTextFieldDvadesetdva = new javax.swing.JTextField();
        jTextFieldDvadesetpet = new javax.swing.JTextField();
        jTextFieldTrideset = new javax.swing.JTextField();
        jTextFieldDvadeset = new javax.swing.JTextField();
        jButtonIzmjeni = new javax.swing.JButton();
        jButtonOsvjezi = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRISUSTVO TRENIGU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTableTrening.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableTrening.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ime", "Prezime", "trening_id", "2.1", "5.1", "8.1", "15.1", "20.1", "22.1", "25.1", "30.1"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTrening.setRowHeight(30);
        jTableTrening.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTreningMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTrening);

        jComboBoxMjesec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sijecan\t", "Veljaca\t\t", "Ozujak", "Travanj", " " }));

        jTextFieldIme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldPrezime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldosmi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFielddrugi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldpet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldpeti.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldDvadesetdva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldDvadesetpet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTrideset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldDvadeset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonIzmjeni.setBackground(new java.awt.Color(0, 0, 0));
        jButtonIzmjeni.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButtonIzmjeni.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIzmjeni.setText("IZMJENI");
        jButtonIzmjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmjeniActionPerformed(evt);
            }
        });

        jButtonOsvjezi.setBackground(new java.awt.Color(0, 0, 0));
        jButtonOsvjezi.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButtonOsvjezi.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOsvjezi.setText("OSVJEZI TABLICU");
        jButtonOsvjezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOsvjeziActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Nakon svake uporabe, molim vas osvjezite tablicu");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("ODABERI MJESEC:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMjesec, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jTextFielddrugi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jTextFieldpeti, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jTextFieldosmi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButtonIzmjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOsvjezi, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldpet, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jTextFieldDvadeset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jTextFieldDvadesetdva, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jTextFieldDvadesetpet, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(jTextFieldTrideset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(555, 555, 555)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMjesec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielddrugi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldpeti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldosmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDvadeset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDvadesetdva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDvadesetpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTrideset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonIzmjeni, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jButtonOsvjezi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTreningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTreningMouseClicked
          DefaultTableModel model = (DefaultTableModel)jTableTrening.getModel();
        //dohvacenje jednog rowa
        int colTable = jTableTrening.getSelectedColumn();
        int rowTable = jTableTrening.getSelectedRow();
        String klub = (String) jTableTrening.getModel().getValueAt(rowTable, colTable);
        
        
        // upisivanje rowa u textfield
        jTextFieldIme.setText(model.getValueAt(rowTable, 0).toString());
        jTextFieldPrezime.setText(model.getValueAt(rowTable, 1).toString());
        jTextFieldId.setText(model.getValueAt(rowTable, 2).toString());
        jTextFielddrugi.setText(model.getValueAt(rowTable, 3).toString());
        jTextFieldpeti.setText(model.getValueAt(rowTable, 4).toString());
        jTextFieldosmi.setText(model.getValueAt(rowTable, 5).toString());
        jTextFieldpet.setText(model.getValueAt(rowTable, 6).toString());
        jTextFieldDvadeset.setText(model.getValueAt(rowTable, 7).toString());
        jTextFieldDvadesetdva.setText(model.getValueAt(rowTable, 8).toString());
        jTextFieldDvadesetpet.setText(model.getValueAt(rowTable, 9).toString());
        jTextFieldTrideset.setText(model.getValueAt(rowTable, 10).toString());
       
    }//GEN-LAST:event_jTableTreningMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
        //combo box odabir mjeseca putem indexa ,krece od 0
        
        int selectedIndex = jComboBoxMjesec.getSelectedIndex();
        
        if (selectedIndex == 0)
            
        {
            treningclass.TreningSijecanj(jTableTrening);
        }
        
        else if(selectedIndex == 1)
            
        {
            treningclass.TreningVeljaca(jTableTrening);
        }
        
        else if(selectedIndex == 2)
            
        {
            treningclass.TreningOzujak(jTableTrening);
        }
        
        else if(selectedIndex == 3)
            
        {
            treningclass.TreningTravanj(jTableTrening);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonIzmjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmjeniActionPerformed
         
        //prikaz mjeseca i izmjena prisustva treninga igraca
        
        int selectedIndex = jComboBoxMjesec.getSelectedIndex();
           int id = Integer.valueOf(jTextFieldId.getText());
          String drugi = jTextFielddrugi.getText();
          String peti = jTextFieldpeti.getText();
          String osmi = jTextFieldosmi.getText();
          String petnaesti = jTextFieldpet.getText();
          String dvadeseti = jTextFieldDvadeset.getText();
          String dvadesetdrugi = jTextFieldDvadesetdva.getText();
          String dvadesetpeti = jTextFieldDvadesetpet.getText();
          String trideseti = jTextFieldTrideset.getText();
          
          
          if (selectedIndex == 0)
          {
               //poziv izmjene igraca iz mjeseca sijecanj iz klase TableClass.Java , IzmjenaSijecanj
              
             Boolean IzmjeniSijecanj= treningclass.IzmjeniTablicuSijecanj(id, drugi, peti, osmi, petnaesti, dvadeseti, dvadesetdrugi, dvadesetpeti, trideseti);  
                
             if(IzmjeniSijecanj)
                {     
             JOptionPane.showMessageDialog(rootPane, "Igrac uspjesno izmjenjen ", "Uspjesno izmjenjen",JOptionPane.INFORMATION_MESSAGE);
          }
          
          else {
              JOptionPane.showMessageDialog(rootPane, "Igrac ne uspjesno izmjenjen ", "Ne uspjesno izmjenjen",JOptionPane.ERROR_MESSAGE);
          
                }
          }
          
           if (selectedIndex == 1)
          {
              
               //poziv izmjene igraca iz mjeseca veljaca iz klase TableClass.Java , IzmjenaVeljaca
              
              Boolean IzmijeniVeljacu = treningclass.IzmjeniTablicuVeljaca(id, drugi, peti, osmi, petnaesti, dvadeseti, dvadesetdrugi, dvadesetpeti, trideseti);  
              if(IzmijeniVeljacu)
                  
              {
              JOptionPane.showMessageDialog(rootPane, "Igrac uspjesno izmjenjen ", "Uspjesno izmjenjen",JOptionPane.INFORMATION_MESSAGE);
          }
          
          else {
              JOptionPane.showMessageDialog(rootPane, "Igrac ne uspjesno izmjenjen ", "Ne uspjesno izmjenjen",JOptionPane.ERROR_MESSAGE);
          }
          
           }
            
           if (selectedIndex == 2)
          {
              
              //poziv izmjene igraca iz mjeseca ozujak iz klase TableClass.Java , IzmjenaOzujak
              Boolean IzmijeniOzujak = treningclass.IzmjeniTablicuOzujak(id, drugi, peti, osmi, petnaesti, dvadeseti, dvadesetdrugi, dvadesetpeti, trideseti);  
              if(IzmijeniOzujak)
                  
              {
              JOptionPane.showMessageDialog(rootPane, "Igrac uspjesno izmjenjen ", "Uspjesno izmjenjen",JOptionPane.INFORMATION_MESSAGE);
          }
          
          else {
              JOptionPane.showMessageDialog(rootPane, "Igrac ne uspjesno izmjenjen ", "Ne uspjesno izmjenjen",JOptionPane.ERROR_MESSAGE);
          }
          
           }
            
           if (selectedIndex == 3)
          {
              Boolean IzmijeniTravanj = treningclass.IzmjeniTablicuTravanj(id, drugi, peti, osmi, petnaesti, dvadeseti, dvadesetdrugi, dvadesetpeti, trideseti);  
              if(IzmijeniTravanj)
                  
              {
              JOptionPane.showMessageDialog(rootPane, "Igrac uspjesno izmjenjen ", "Uspjesno izmjenjen",JOptionPane.INFORMATION_MESSAGE);
          }
          
          else {
              JOptionPane.showMessageDialog(rootPane, "Igrac ne uspjesno izmjenjen ", "Ne uspjesno izmjenjen",JOptionPane.ERROR_MESSAGE);
          }
          
           }
    
        
    }//GEN-LAST:event_jButtonIzmjeniActionPerformed

    private void jButtonOsvjeziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOsvjeziActionPerformed
      int selectedIndex = jComboBoxMjesec.getSelectedIndex();
        
      //osvjezavanje tablice pomocu buttona Osvjezi, ovisno o odabiru comboboxa
      
        if (selectedIndex == 0)
            
        {
           jTableTrening.setModel(new DefaultTableModel(null, new Object[]{"Ime","Prezime","training_id","2.1","5.1","8.1","15.1","20.1","22.1","25.1", "30.1"}));
            treningclass.TreningSijecanj(jTableTrening);
        }
        
        else if(selectedIndex == 1)
            
        {
            jTableTrening.setModel(new DefaultTableModel(null, new Object[]{"Ime","Prezime","training_id","2.2","5.2","8.2","15.2","20.2","22.2","25.2", "30.2"}));
            treningclass.TreningVeljaca(jTableTrening);
        }
        
         else if(selectedIndex == 2)
            
        {
            jTableTrening.setModel(new DefaultTableModel(null, new Object[]{"Ime","Prezime","training_id","2.3","5.3","8.3","15.3","20.3","22.3","25.3", "30.3"}));
            treningclass.TreningOzujak(jTableTrening);
        }
        
        
        else if(selectedIndex == 3)
            
        {
            jTableTrening.setModel(new DefaultTableModel(null, new Object[]{"Ime","Prezime","training_id","2.4","5.4","8.4","15.4","20.4","22.4","25.4", "30.4"}));
            treningclass.TreningTravanj(jTableTrening);
        }
        
        
    }//GEN-LAST:event_jButtonOsvjeziActionPerformed

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
            java.util.logging.Logger.getLogger(TreningForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreningForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreningForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreningForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreningForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonIzmjeni;
    private javax.swing.JButton jButtonOsvjezi;
    private javax.swing.JComboBox<String> jComboBoxMjesec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTrening;
    private javax.swing.JTextField jTextFieldDvadeset;
    private javax.swing.JTextField jTextFieldDvadesetdva;
    private javax.swing.JTextField jTextFieldDvadesetpet;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldPrezime;
    private javax.swing.JTextField jTextFieldTrideset;
    private javax.swing.JTextField jTextFielddrugi;
    private javax.swing.JTextField jTextFieldosmi;
    private javax.swing.JTextField jTextFieldpet;
    private javax.swing.JTextField jTextFieldpeti;
    // End of variables declaration//GEN-END:variables
}
