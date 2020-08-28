/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_handball;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;

/**
 *
 * @author Luka
 */
public class Tablica extends javax.swing.JFrame {
    
    Connection1 conn1 = new Connection1();
   
    
    TablicaClass tablica = new TablicaClass();
    public Tablica() {
        initComponents();
        
        jTableTablica.setAutoCreateRowSorter(true);
         jTableTablica.setModel(new DefaultTableModel(null, new Object[]{"klub","odigrane","pobjede","nerjeseno","porazi","postgnuti","primljeni","razlika", "bodovi"}));
        // prikaz tablice on reload
        tablica.PrikaziTablicu(jTableTablica);
        
        
        
    }

    public Tablica(JLabel jLabel1, JPanel jPanel1, JPanel jPanel2, JScrollPane jScrollPane1, JTable jTable1) throws HeadlessException {
        this.jLabel1 = jLabel1;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.jScrollPane1 = jScrollPane1;
        this.jTableTablica = jTable1;
    }
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTablica = new javax.swing.JTable();
        jTextFieldKlub = new javax.swing.JTextField();
        jTextFieldOdigrane = new javax.swing.JTextField();
        jTextFieldPobjede = new javax.swing.JTextField();
        jTextFieldPorazi = new javax.swing.JTextField();
        jTextFieldPostignuti = new javax.swing.JTextField();
        jTextFieldPrimljeni = new javax.swing.JTextField();
        jTextFieldRazlika = new javax.swing.JTextField();
        jTextFieldBodovi = new javax.swing.JTextField();
        jTextFieldNerjeseno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TABLICA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(576, 576, 576))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTableTablica.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTableTablica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Klub", "Odigrane", "Pobijede", "Nerijeseno", "Porazi", "Postignuti", "Primljeni", "Razlika", "Bodovi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableTablica.setToolTipText("");
        jTableTablica.setGridColor(new java.awt.Color(0, 0, 0));
        jTableTablica.setRowHeight(40);
        jTableTablica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTablicaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTablica);

        jTextFieldKlub.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextFieldOdigrane.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldOdigrane.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldPobjede.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldPobjede.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldPorazi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldPorazi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldPostignuti.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldPostignuti.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldPrimljeni.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldPrimljeni.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldRazlika.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldRazlika.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldBodovi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldBodovi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextFieldNerjeseno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldNerjeseno.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OSVJEZI TABLICU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("IZMJENI PODATKE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Nakon svake uporabe, molimo vas osvjezite tablicu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextFieldKlub, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldOdigrane, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jTextFieldPobjede, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jTextFieldNerjeseno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jTextFieldPorazi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jTextFieldPostignuti, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jTextFieldPrimljeni, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jTextFieldRazlika, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jTextFieldBodovi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(479, 479, 479))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldKlub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldOdigrane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPobjede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNerjeseno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPorazi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPostignuti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrimljeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRazlika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBodovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTablicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTablicaMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)jTableTablica.getModel();
        
        //dohvacenje jednog rowa
        int colTable = jTableTablica.getSelectedColumn();
        int rowTable = jTableTablica.getSelectedRow();
        String klub = (String)jTableTablica.getModel().getValueAt(rowTable, colTable);
        // upisivanje rowa u textfield
        
        jTextFieldKlub.setText(model.getValueAt(rowTable, 0).toString());
        jTextFieldOdigrane.setText(model.getValueAt(rowTable, 1).toString());
        jTextFieldPobjede.setText(model.getValueAt(rowTable, 2).toString());
        jTextFieldNerjeseno.setText(model.getValueAt(rowTable, 3).toString());
        jTextFieldPorazi.setText(model.getValueAt(rowTable, 4).toString());
        jTextFieldPostignuti.setText(model.getValueAt(rowTable, 5).toString());
        jTextFieldPrimljeni.setText(model.getValueAt(rowTable, 6).toString());
        jTextFieldRazlika.setText(model.getValueAt(rowTable, 7).toString());
        jTextFieldBodovi.setText(model.getValueAt(rowTable, 8).toString());
       
        
        
        
        
    }//GEN-LAST:event_jTableTablicaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //brisanje visak polja u tablici
        
          jTableTablica.setModel(new DefaultTableModel(null, new Object[]{"klub","odigrane","pobjede","nerjeseno","porazi","postgnuti","primljeni","razlika", "bodovi"}));
        
        
         //refresh tablice prikaz tablice
        tablica.PrikaziTablicu(jTableTablica);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        String klub = jTextFieldKlub.getText();
        int odigrane = Integer.valueOf(jTextFieldOdigrane.getText());
        int pobjede = Integer.valueOf(jTextFieldPobjede.getText());
        int nerjeseno = Integer.valueOf(jTextFieldNerjeseno.getText());
        int porazi = Integer.valueOf(jTextFieldPorazi.getText());
        int postignuti = Integer.valueOf(jTextFieldPostignuti.getText());
        int primljeni = Integer.valueOf(jTextFieldPrimljeni.getText());
        int razlika = Integer.valueOf(jTextFieldRazlika.getText());
        int bodovi = Integer.valueOf(jTextFieldBodovi.getText());
    
        //izmjena tablice
        
        if(tablica.UrediTablicu(klub, odigrane, pobjede, nerjeseno, porazi, postignuti, primljeni, razlika, bodovi))
        {
         JOptionPane.showMessageDialog(rootPane, "Tablica uspjesno izmjenjena ", "Uspjesna izmjena",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed
        
    
    else 
        {
            JOptionPane.showMessageDialog(rootPane, "Tablica nije  uspjesno izmjenjena ", " Ne uspjesna izmjena",JOptionPane.ERROR_MESSAGE);
          }
    }
    
    
        
    
    
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
            java.util.logging.Logger.getLogger(Tablica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTablica;
    private javax.swing.JTextField jTextFieldBodovi;
    private javax.swing.JTextField jTextFieldKlub;
    private javax.swing.JTextField jTextFieldNerjeseno;
    private javax.swing.JTextField jTextFieldOdigrane;
    private javax.swing.JTextField jTextFieldPobjede;
    private javax.swing.JTextField jTextFieldPorazi;
    private javax.swing.JTextField jTextFieldPostignuti;
    private javax.swing.JTextField jTextFieldPrimljeni;
    private javax.swing.JTextField jTextFieldRazlika;
    // End of variables declaration//GEN-END:variables
}
