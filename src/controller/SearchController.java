/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.DummyData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class SearchController implements ActionListener {
    private JTextField searchTxt = new JTextField();
    private DefaultTableModel model;
    
    public SearchController(JTextField searchTxt, DefaultTableModel model){
        this.searchTxt = searchTxt;
        this.model = model;
    }
    
    //@Override;
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String searchDataString = this.searchTxt.getText();
        if (searchDataString.trim().equals("*")){
            model.setDataVector(DummyData.data, DummyData.TABLE_HEADER);
            return;
        }
        
        Object[][] newData = new Object[DummyData.data.length][];
        int index = 0;
        for (Object[] obj : DummyData.data){
            if(String.valueOf(obj[1]).toUpperCase().
                    contains(searchDataString.toUpperCase().trim())){
                newData[index++]=obj;
            }
            model.setDataVector(newData, DummyData.TABLE_HEADER);
        }
    }
    
}
