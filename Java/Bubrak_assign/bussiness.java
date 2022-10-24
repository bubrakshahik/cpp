/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessLayer;

import DataLayer.MyDBHelper;

/**
 *
 * @author Muhammad Bilal
 */
public class ManageVoter {
    private final MyDBHelper dbHelper = MyDBHelper.getObj();
    private static ManageVoter obj=null;
    
    private ManageVoter(){}

    public static ManageVoter getObj(){
        if(obj==null)
            obj = new ManageVoter();
        return obj;
    }
    
    public Voter getVotingDetails() {
        Voter voter = dbHelper.retriveVoterRecord();
        return voter;
    }
    
    public boolean insertVoterData(String std_id, String selected_candidate){
        boolean isDataInserted = dbHelper.insertVoterRecord(std_id, selected_candidate);
        return isDataInserted;
    }
    
}
