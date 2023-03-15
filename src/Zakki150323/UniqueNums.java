/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki150323;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class UniqueNums {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        int num=0; 
        int numValues=0;
        boolean valid = true;
        
        
        while(numValues<numbers.length){
            do{
                valid = true;
                System.out.println("Please enter a unique number: ");
                num = in.nextInt();
                for(int i = 0; i < numValues; i++)
                {
                    if(num == numbers[i]){
                        System.out.println("Number already exists");
                        valid = false;
                        break;
                    }//end if
                }//end for
            }
            while(!valid);
            numbers[numValues] = num;
            numValues++;
        }//end while
    }//end method main
}//end class
