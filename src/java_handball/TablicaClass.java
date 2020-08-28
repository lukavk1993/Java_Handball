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
public class TablicaClass {
    Connection1 conn1 = new Connection1();
    
    public void PrikaziTablicu(JTable table)
            
    {
        PreparedStatement prepareds;
        ResultSet result;
        
        String getQuerry1 = "SELECT * FROM `tablica` order  by bodovi desc";
        
       
        
       
        try {
           
            prepareds=conn1.createConnection().prepareStatement(getQuerry1);
            
              DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
              result = prepareds.executeQuery();
             Object[] row;
             
        while(result.next())
        {
            row=new Object[9];
            row[0]=result.getString(1);
            row[1]=result.getInt(2);
            row[2]=result.getInt(3);
            row[3]=result.getInt(4);
            row[4]=result.getInt(5);
            row[5]=result.getInt(6);
            row[6]=result.getInt(7);
            row[7]=result.getInt(8);
            row[8]=result.getInt(9);
           
        tableModel.addRow(row);
        }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TreningClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
    }
    
    public boolean UrediTablicu(String Klub, int Odigrane,int Pobjede, int nerjeseno,int porazi, int postigunti, int primljeni, int razlika,int bodovi)
            
            {
                PreparedStatement prepareds;
                ResultSet result;
                
                String editQuerry = "UPDATE `tablica` SET `odigrane`=?,`pobjede`=?,`nerijeseno`= ?,`porazi`=?,`postignuti`=? ,`primljeni`=?,`gol_razlika`=?,`bodovi`= ? WHERE `klub`=?";
                
                 try {
             prepareds = conn1.createConnection().prepareStatement(editQuerry);
             
      
       prepareds.setInt(1, Odigrane);
       prepareds.setInt(2, Pobjede);
       prepareds.setInt(3, nerjeseno);
       prepareds.setInt(4, porazi);
       prepareds.setInt(5, postigunti);
       prepareds.setInt(6, primljeni);
       prepareds.setInt(7, razlika);
       prepareds.setInt(8, bodovi);
       prepareds.setString(9, Klub);
    
             return(prepareds.executeUpdate()> 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Tablica.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
                 
        
    
}
 