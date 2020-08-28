/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package java_handball;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.AccessibleAttribute;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Luka
 */
public class TreningClass {
      Igrac igrac = new Igrac();
      Connection1 conn1 = new Connection1();

    
     public void TreningSijecanj(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry1 ="SELECT  `ime`, `prezime`,`training_id`, `2.1`, `5.1`, `8.1`, `15.1`, `20.1`, `22.1`, `25.1`, `30.1` FROM `igrac` INNER JOIN  `trening_1` ON `igrac`.`id`= `trening_1`.`training_id`";
        
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry1);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[11];
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
            row[10]=result.getString(11);
        tableModel.addRow(row);
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     
     public boolean  IzmjeniTablicuSijecanj(int training_id, String drugi,String peti,String osmi,String petnaesti, String dvadeseti, String dvadesetdrugi,String dvadesetpeti,String trideseti)
    
     {
          PreparedStatement prepareds;
          String editQuerry = "UPDATE `trening_1` SET `2.1`=?,`5.1`=?,`8.1`=?,`15.1`=?,`20.1`=?,`22.1`=?,`25.1`=?,`30.1`=? WHERE `training_id`=?";
          
          try {
                  prepareds = conn1.createConnection().prepareStatement(editQuerry);
           
            prepareds.setString(1, drugi);
            prepareds.setString(2, peti);
            prepareds.setString(3, osmi);
            prepareds.setString(4, petnaesti);
            prepareds.setString(5, dvadeseti);
            prepareds.setString(6, dvadesetdrugi);
            prepareds.setString(7, dvadesetpeti);
            prepareds.setString(8, trideseti);
             prepareds.setInt(9, training_id);
            
            
            
         return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
     
      public void TreningVeljaca(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry1 ="SELECT  `ime`, `prezime`,`training_id`, `2.2`, `5.2`, `8.2`, `15.2`, `20.2`, `22.2`, `25.2`, `30.2` FROM `igrac` INNER JOIN  `trening_2` ON `igrac`.`id`= `trening_2`.`training_id`";
        
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry1);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[11];
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
            row[10]=result.getString(11);
        tableModel.addRow(row);
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
       public boolean  IzmjeniTablicuVeljaca(int training_id, String drugi,String peti,String osmi,String petnaesti, String dvadeseti, String dvadesetdrugi,String dvadesetpeti,String trideseti)
    
     {
          PreparedStatement prepareds;
          String editQuerry = "UPDATE `trening_2` SET `2.2`=?,`5.2`=?,`8.2`=?,`15.2`=?,`20.2`=?,`22.2`=?,`25.2`=?,`30.2`=? WHERE `training_id`=?";
          
          try {
                  prepareds = conn1.createConnection().prepareStatement(editQuerry);
           
            prepareds.setString(1, drugi);
            prepareds.setString(2, peti);
            prepareds.setString(3, osmi);
            prepareds.setString(4, petnaesti);
            prepareds.setString(5, dvadeseti);
            prepareds.setString(6, dvadesetdrugi);
            prepareds.setString(7, dvadesetpeti);
            prepareds.setString(8, trideseti);
             prepareds.setInt(9, training_id);
            
            
            
         return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
      
      
      
      
      
      
      
      public void TreningOzujak(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry1 ="SELECT  `ime`, `prezime`,`training_id`, `2.3`, `5.3`, `8.3`, `15.3`, `20.3`, `22.3`, `25.3`, `30.3` FROM `igrac` INNER JOIN  `trening_3` ON `igrac`.`id`= `trening_3`.`training_id`";
        
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry1);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[11];
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
            row[10]=result.getString(11);
        tableModel.addRow(row);
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
      
      
      public boolean  IzmjeniTablicuOzujak(int training_id, String drugi,String peti,String osmi,String petnaesti, String dvadeseti, String dvadesetdrugi,String dvadesetpeti,String trideseti)
    
     {
          PreparedStatement prepareds;
          String editQuerry = "UPDATE `trening_3` SET `2.3`=?,`5.3`=?,`8.3`=?,`15.3`=?,`20.3`=?,`22.3`=?,`25.3`=?,`30.3`=? WHERE `training_id`=?";
          
          try {
                  prepareds = conn1.createConnection().prepareStatement(editQuerry);
           
            prepareds.setString(1, drugi);
            prepareds.setString(2, peti);
            prepareds.setString(3, osmi);
            prepareds.setString(4, petnaesti);
            prepareds.setString(5, dvadeseti);
            prepareds.setString(6, dvadesetdrugi);
            prepareds.setString(7, dvadesetpeti);
            prepareds.setString(8, trideseti);
             prepareds.setInt(9, training_id);
            
            
            
         return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
      
      public void TreningTravanj(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry1 ="SELECT  `ime`, `prezime`,`training_id`, `2.4`, `5.4`, `8.4`, `15.4`, `20.4`, `22.4`, `25.4`, `30.4` FROM `igrac` INNER JOIN  `trening_4` ON `igrac`.`id`= `trening_4`.`training_id`";
        
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry1);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[11];
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
            row[10]=result.getString(11);
        tableModel.addRow(row);
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
      
      
      public boolean  IzmjeniTablicuTravanj(int training_id, String drugi,String peti,String osmi,String petnaesti, String dvadeseti, String dvadesetdrugi,String dvadesetpeti,String trideseti)
    
     {
          PreparedStatement prepareds;
          String editQuerry = "UPDATE `trening_4` SET `2.4`=?,`5.4`=?,`8.4`=?,`15.4`=?,`20.4`=?,`22.4`=?,`25.4`=?,`30.4`=? WHERE `training_id`=?";
          
          try {
                  prepareds = conn1.createConnection().prepareStatement(editQuerry);
           
            prepareds.setString(1, drugi);
            prepareds.setString(2, peti);
            prepareds.setString(3, osmi);
            prepareds.setString(4, petnaesti);
            prepareds.setString(5, dvadeseti);
            prepareds.setString(6, dvadesetdrugi);
            prepareds.setString(7, dvadesetpeti);
            prepareds.setString(8, trideseti);
             prepareds.setInt(9, training_id);
            
            
            
         return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
      
   
       public void TreningSvibanj(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry1 ="SELECT  `ime`, `prezime`,`training_id`, `2.5`, `5.5`, `8.5`, `15.5`, `20.5`, `22.5`, `25.5`, `30.5` FROM `igrac` INNER JOIN  `trening_5` ON `igrac`.`id`= `trening_5`.`training_id`";
        
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry1);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[11];
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
            row[10]=result.getString(11);
        tableModel.addRow(row);
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
      
      
      public boolean  IzmjeniTablicuSvibanj(int training_id, String drugi,String peti,String osmi,String petnaesti, String dvadeseti, String dvadesetdrugi,String dvadesetpeti,String trideseti)
    
     {
          PreparedStatement prepareds;
          String editQuerry = "UPDATE `trening_5` SET `2.5`=?,`5.5`=?,`8.5`=?,`15.5`=?,`20.5`=?,`22.5`=?,`25.5`=?,`30.5`=? WHERE `training_id`=?";
          
          try {
                  prepareds = conn1.createConnection().prepareStatement(editQuerry);
           
            prepareds.setString(1, drugi);
            prepareds.setString(2, peti);
            prepareds.setString(3, osmi);
            prepareds.setString(4, petnaesti);
            prepareds.setString(5, dvadeseti);
            prepareds.setString(6, dvadesetdrugi);
            prepareds.setString(7, dvadesetpeti);
            prepareds.setString(8, trideseti);
             prepareds.setInt(9, training_id);
            
            
            
         return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
      
       public void TreningLipanj(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry1 ="SELECT  `ime`, `prezime`,`training_id`, `2.6`, `5.6`, `8.6`, `15.6`, `20.6`, `22.6`, `25.6`, `30.6` FROM `igrac` INNER JOIN  `trening_6` ON `igrac`.`id`= `trening_6`.`training_id`";
        
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry1);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[11];
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
            row[10]=result.getString(11);
        tableModel.addRow(row);
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
      
      
      public boolean  IzmjeniTablicuLipanj(int training_id, String drugi,String peti,String osmi,String petnaesti, String dvadeseti, String dvadesetdrugi,String dvadesetpeti,String trideseti)
    
     {
          PreparedStatement prepareds;
          String editQuerry = "UPDATE `trening_6` SET `2.6`=?,`5.6`=?,`8.6`=?,`15.6`=?,`20.6`=?,`22.6`=?,`25.6`=?,`30.6`=? WHERE `training_id`=?";
          
          try {
                  prepareds = conn1.createConnection().prepareStatement(editQuerry);
           
            prepareds.setString(1, drugi);
            prepareds.setString(2, peti);
            prepareds.setString(3, osmi);
            prepareds.setString(4, petnaesti);
            prepareds.setString(5, dvadeseti);
            prepareds.setString(6, dvadesetdrugi);
            prepareds.setString(7, dvadesetpeti);
            prepareds.setString(8, trideseti);
             prepareds.setInt(9, training_id);
            
            
            
         return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
      
      
}
