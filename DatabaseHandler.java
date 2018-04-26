
package test;
/*
This class will handle all of the database statements.
It will make the connection and contain the q
*/

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

public class DatabaseHandler {
    //makes connection to database
    public static Connection setupConnection(){
        String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
        String jdbcURL = "jdbc:oracle:thin@cswinserv.eku.edu:1521:cscdb";
        
        String username = "koger5452018";
        String password = "3053";
        
        try {
            //load jdbc driver
            Class.forName(jdbcDriver);
            
            //connect to db
            Connection conn = DriverManager.getConnection(jdbcURL, username, password);
            return conn;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    return null;
    }
    static void close(Connection conn) 
    {
        if(conn != null) 
        {
            try
            {
                conn.close();
            }
            catch(Throwable whatever)
            {}
        }
    }

    static void close(OraclePreparedStatement st)
    {
        if(st != null)
        {
            try
            {
                st.close();
            }
            catch(Throwable whatever)
            {}
        }
    }

    static void close(OracleResultSet rs)
    {
        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Throwable whatever)
            {}
        }
    }
    //this method will insert a recipe into the database
    static void insertRecipe(String n, String i, String c){
        Connection conn = DatabaseHandler.setupConnection();
        OraclePreparedStatement pst = null;
        try
        {
            //"insert into recipie values (seq_recipe.nextval, 'Turn it up!', 'Deserts')";
            String sqlStatement = "insert into recipe values (seq_recipe.nextval, ? , ? , ?)";
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sqlStatement);
            //pst = (OraclePreparedStatement) conn.prepareStatement(sqlStatement);
            pst.setString(1, n);
            pst.setString(2, i);
            pst.setString(3, c);
            pst.execute();
                        
            //rs = (OracleResultSet) pst.executeQuery();
            // Now rs contains the rows from the COFFEES table. To access the data, use the method NEXT to access all rows in rs, one row at a time
            //System.out.println("Coffees between " + lowestPriceField.getText() + " and " + highestPriceField.getText() + " dolloars include:");
            /*
            while (rs.next())
            {
                String name = rs.getString("COF_NAME");
                float price = rs.getFloat("PRICE");

                // print names and prices and left align them
                System.out.printf("%-32s%-5.2f\n", name, price);
            }*/
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            //DatabaseHandler.close(rs);
            DatabaseHandler.close(pst);
            DatabaseHandler.close(conn);
        }
    }
}