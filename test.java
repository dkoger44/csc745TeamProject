/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
/**
 *
 * @author ekustudent
 */
public class test {
    Connection conn = DatabaseHandler.setupConnection();
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    public static void main(String[] args) {
        String name = "Pizza";
        String instructions = "Put it in the oven!";
        String category = "Lunch";
       // Connection conn = DatabaseHandler.setupConnection();
        DatabaseHandler.insertRecipe(name, instructions, category);
        //OraclePreparedStatement pst = null;
        
        
    }
    /*
    public void doStuff(){
        try
        {
            //"insert into recipie values (seq_recipe.nextval, 'Turn it up!', 'Deserts')";
            String sqlStatement = "select * from recipe";
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sqlStatement);
            //pst = (OraclePreparedStatement) conn.prepareStatement(sqlStatement);
            //pst.setString(1, name);
            //pst.setString(2, instructions);
            //pst.setString(3, category);
            //pst.execute();
                        
            rs = (OracleResultSet) pst.executeQuery();
            // Now rs contains the rows from the COFFEES table. To access the data, use the method NEXT to access all rows in rs, one row at a time
            //System.out.println("Coffees between " + lowestPriceField.getText() + " and " + highestPriceField.getText() + " dolloars include:");
            
            while (rs.next())
            {
                //String name = rs.getString("COF_NAME");
                //float price = rs.getFloat("PRICE");

                // print names and prices and left align them
                System.out.print(rs.getString("name"));
            }
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
    */

}

