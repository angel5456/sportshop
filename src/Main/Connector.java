
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @autor Silva Santos Miguel Angel.
 */
public class Connector {
    public static void main(String[] args) {
        ConnectDb();
    }

    public static Connection ConnectDb() {
        Connection conn = null;
        String url, user, pass;
        try {
            Class.forName("oracle.jdbc.OracleDriver");//driver db
            url = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
            user = "jefe";
            pass = "123";
            conn = DriverManager.getConnection(url,user,pass);
            //JOptionPane.showMessageDialog(null, "Conexion establecida");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conn;
    }
}
