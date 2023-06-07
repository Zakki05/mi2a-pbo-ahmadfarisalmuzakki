/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import helper.DosenData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class DosenModel extends DefaultTableModel{
    public DosenModel(){
        super(DosenData.data, DosenData.TABLE_HEADER);
    }
}
