/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_handball;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luka
 */
public class Svojstva {
    Connection1 conn1 = new Connection1();
    Igrac igrac = new Igrac();
    
    
     public void IgracSvojstva1(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry1 ="SELECT  `ime`, `prezime`,`igrac_id`, `Bench Press`, `Cucanj`, `Zgibovi`, `Potisci`, `Deadlift`, `100m`, `1600m` FROM `igrac` INNER JOIN  `svojstva` ON `igrac`.`id`= `svojstva`.`igrac_id`";
        
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry1);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[10];
            row[0]=result.getString(1);
            row[1]=result.getString(2);
            row[2]=result.getInt(3);
            row[3]=result.getString(4);
            row[4]=result.getString(5);
            row[5]=result.getString(6);
            row[6]=result.getString(7);
            row[7]=result.getString(8);
            row[8]=result.getString(9);
            row[9]=result.getString(10);
           
        tableModel.addRow(row);
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(Svojstva.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public boolean  IzmjeniSvojstva(int igrac_id, String BP,String Cucanj,String Zgibovi,String Potisci, String DL, String sto,String maraton)
    
     {
          PreparedStatement prepareds;
          String editQuerry = "UPDATE `svojstva` SET `Bench Press`=?,`Cucanj`=?,`Zgibovi`=?,`Potisci`=?,`Deadlift`=?,`100m`=?,`1600m`=? WHERE `igrac_id`=?";
          
          try {
                  prepareds = conn1.createConnection().prepareStatement(editQuerry);
           
            prepareds.setString(1, BP);
            prepareds.setString(2, Cucanj);
            prepareds.setString(3, Zgibovi);
            prepareds.setString(4, Potisci);
            prepareds.setString(5, DL);
            prepareds.setString(6, sto);
            prepareds.setString(7, maraton);
    
            prepareds.setInt(8,igrac_id);
            
            
            
         return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Svojstva.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
}
