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
import javafx.scene.AccessibleAttribute;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luka
 */
public class Igrac {
    
    Connection1 conn1 = new Connection1();
    
    
    
    public boolean DodajIgraca(String ime, String prezime, String telefon, String datum, String pozicija, String gol , String visina, String tezina)
    {
    PreparedStatement  prepareds;
     ResultSet result;
    String insertQuerry ="INSERT INTO `igrac`(`ime`, `prezime`, `telefon`, `datum`, `pozicija`, `golovi`, `tezina`, `visina`) VALUES (?,?,?,?,?,?,?,?)";
      
       
    
        try {
             prepareds = conn1.createConnection().prepareStatement(insertQuerry);
             
       prepareds.setString(1, ime);
       prepareds.setString(2, prezime);
       prepareds.setString(3, telefon);
       prepareds.setString(4, datum);
       prepareds.setString(5, pozicija);
       prepareds.setString(6, gol);
       prepareds.setString(7, visina);
       prepareds.setString(8, tezina);
    
            if(prepareds.executeUpdate()> 0)
            {
                  return true;
            }
           
            else {
                  return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Igrac.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    
    
  
    }     
    
    public void prikazIgraca(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry = "SELECT * FROM `igrac`";
        
       
        
       
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[9];
            row[0]=result.getInt(1);
            row[1]=result.getString(2);
            row[2]=result.getString(3);
            row[3]=result.getString(4);
            row[4]=result.getString(5);
            row[5]=result.getString(6);
            row[6]=result.getString(7);
            row[7]=result.getString(8);
            row[8]=result.getString(9);
        tableModel.addRow(row);
        }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Igrac.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean izmjenaIgraca(int id, String ime, String prezime, String telefon, String datum, String pozicija, String gol , String tezina, String visina)
    {
        PreparedStatement prepareds;
      
        String editQuerry = "UPDATE `igrac` SET `ime`=?, `prezime`=? ,`telefon`=?, `datum`=?,`pozicija`=? ,`golovi`=?,`tezina`=?,`visina`=? WHERE `id` = ? ";
        
         try {
             prepareds = conn1.createConnection().prepareStatement(editQuerry);
             
       prepareds.setString(1, ime);
       prepareds.setString(2, prezime);
       prepareds.setString(3, telefon);
       prepareds.setString(4, datum);
       prepareds.setString(5, pozicija);
       prepareds.setString(6, gol);
       prepareds.setString(7, tezina);
       prepareds.setString(8, visina);
       prepareds.setInt(9, id);
    
             return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Igrac.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
  
    public boolean obrisiIgraca(int id)
    
    {
        PreparedStatement prepareds;
        
        String removeQuerry = "DELETE FROM `igrac` WHERE `id`=?";
        try {
             prepareds = conn1.createConnection().prepareStatement(removeQuerry);
             
     
       prepareds.setInt(1, id);
    
             return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Igrac.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
    

}
