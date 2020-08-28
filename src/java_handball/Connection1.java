/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_handball;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luka
 */
public class Connection1 {
    
    
    public Connection createConnection() 
    {
        Connection connection = null;
        MysqlDataSource mds = new MysqlDataSource();
        
        mds.setServerName("localhost");
        mds.setPortNumber(3306);
        mds.setUser("root");
        mds.setPassword("");
        mds.setDatabaseName("bp_handball");
        
        
        try {
            connection = mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Connection1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    PreparedStatement prepareStatement(String sqlCombo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


