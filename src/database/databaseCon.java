
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class databaseCon {
    Connection con = null;
    
    public static Connection databaseConnection(){
        
        try{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\rhrony\\Documents\\NetBeansProjects\\MoviesSuccessPrediction\\MoviesSuccessPridiction.sqlite");
        
        JOptionPane.showMessageDialog(null, "Connected!");
        
        return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connected");
            
            return null;
        }
    }
    
    
}
