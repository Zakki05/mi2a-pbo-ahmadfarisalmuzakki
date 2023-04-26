/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Deposit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pil;
        
        Account a2 = new Account();
        a2.setAccountName("Zakki");
        a2.setAccountNum(2101092028);
        
        System.out.println("Anda Mau Melakukan Transaksi : ");
        System.out.println("1. Penarikan \n2. Deposit \n3. Informasi Saldo");
        System.out.println("Pilihan : ");
        pil=s.nextInt();
        // baca input keyboard
        
        //switch case
        switch(pil){
            case 1 :System.out.println("");
            //Penarikan
            a2.setTarik(50000);
            a2.print();
            break;
            
            case 2 :
            System.out.println("");
            //Deposit
            a2.setDeposit(1000000);
            a2.print();
            break;
            
            case 3 :System.out.println("");
            //Informasi Saldo
            a2.setBalance(50000);
            a2.print();
            break;
            
            default : System.out.println("Input Error");
        }
    }
}
