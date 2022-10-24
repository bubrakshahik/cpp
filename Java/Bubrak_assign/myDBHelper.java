/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer;

import BusinessLayer.Voter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Muhammad Bilal
 */
public class MyDBHelper {
    public static String PATH = "";
    private static final String FILE = "BCXXXXXXXXX.accdb";
    private static MyDBHelper obj=null;
    
    private MyDBHelper(){
        
    }

    public static MyDBHelper getObj(){
        if(obj==null)
            obj = new MyDBHelper();
        return obj;
    }
    
    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String url = "jdbc:ucanaccess://" + PATH + "\\assets\\" + FILE;  
        Connection con = DriverManager.getConnection(url);
        return con;
    }
    
    public Voter retriveVoterRecord() {
        
        Voter voter = new Voter();

        try {
            Connection con = getConnection();
            Statement st = con.createStatement();

            String sql = "SELECT"
                    + " std_id, selected_candidate"
                    + " FROM VoteCasted"
                    + " WHERE std_id = 'BCXXXXXXXXX'";

            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                String std_id = rs.getString("std_id");
                String selected_candidate = rs.getString("selected_candidate");

                voter.setID(std_id);
                voter.setCandidate(selected_candidate);
                
            }

            st.close();
            rs.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException: " + ex.toString());
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.toString());
        }

        return voter;
    }    
    
    public boolean insertVoterRecord(String stdId, String selectedCandidate) {
        
        int isRecordInserted = 0;
        
        try{
            Connection con = getConnection();
            
            String sql = " INSERT INTO VoteCasted(std_id, selected_candidate) VALUES (?,?)";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1 , stdId);
            st.setString(2 , selectedCandidate);

            isRecordInserted = st.executeUpdate();
           
            st.close();
   
        }
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException: " + ex.toString());
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.toString());
        }
        
        if(isRecordInserted == 1){
            return true;
        }
        else{
            return false;
        }
        
    }    
    
}
