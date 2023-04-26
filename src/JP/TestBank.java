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
public class TestBank {
    public static void main(String[] args) {
        Account a2 = new Account();
        Account a3 = new Account();
        
        a2.setAccountName("Zakki");
        a2.setAccountNum(2101092028);
        a2.setBalance(100000);
        
        a3.setAccountName("Faris");
        a3.setAccountNum(282828);
        a3.setBalance(200000);
        
        a2.print();
        a3.print();
    }
}
