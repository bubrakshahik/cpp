/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;

/**
 *
 * @author Muhammad Bilal
 */
public class Voter {
    //Attributes
    String stdID;
    String candidate;

    //Constructor
    public Voter(){
        stdID = null;
        candidate = null;             
    }
    
    //Setter Methods
    public void setID(String stdID){
        this.stdID = stdID;
    }
    public void setCandidate(String candidate){
        this.candidate = candidate;
    }

    //Getter Methods
    public String getID(){
        return stdID;
    }
    public String getCandidate(){
        return candidate;
    }

}
