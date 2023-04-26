/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author LENOVO
 */
public class Account {
    private String AccountName;
    private int AccountNum;
    private int Balance;
    
    public int getBalance(){
        return Balance;
    }
    
    public void setBalance (int Balance){
        this.Balance = Balance;
    }
    
    public int getAccountNum(){
        return AccountNum;
    }
    
    public void setAccountNum (int AccountNum){
        this.AccountNum = AccountNum;
    }
    
    public String getAccountName(){
        return AccountName;
    }
    
    public void setAccountName (String AccountName){
        this.AccountName = AccountName;
    }
    
    void print(){
        System.out.println("Nama Nasabah : "+AccountName+"\nNo Rekening : "+AccountNum+"\nSaldo : "+Balance+"\n");
    }
    
    public void setDeposit(int Deposit){
        Balance = Balance+Deposit;
    }
    
    void setTarik(int i){
        Balance = Balance-i;
    }
}
