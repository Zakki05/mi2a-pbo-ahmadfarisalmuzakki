/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zakki150323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        int kandang = 0;
        int jenis = 0;
        int jumlah = 0;
        String jenisAyam = "";
        
        System.out.println("==Program Menentukan Jenis Ayam==\n");
        System.out.println("Jenis Ayam :");
        System.out.println("1. Ayam Kate");
        System.out.println("2. Ayam Kampung");
        
        try {
            System.out.print("\nInput Jumlah Kandang : ");
            kandang = Integer.parseInt(dataIn.readLine());
            for (int i = 0; i < kandang; i++ ){
                System.out.println("\nInputan Kandang ke-"+(i+1));
                System.out.print("Input Jenis Ayam : ");
                jenis = Integer.parseInt(dataIn.readLine());
                System.out.print("Input Jumlah Ayam : ");
                jumlah = Integer.parseInt(dataIn.readLine());
            }
        }
        catch (IOException e){
            System.out.println("Error!");
        }
        
        if(jenis == 1){
            jenisAyam = "Jenis Ayam : Ayam Kate"; 
        }
        if(jenis == 2){
            jenisAyam = "Jenis Ayam : Ayam Kampung"; 
        }
        else{
            jenisAyam = "Jenis Ayam Tidak Diketahui";
        }
        
        System.out.println("\n==================");
        
        for (int i = 0; i < kandang; i++ ){
            System.out.println("Data Kandang ke-"+(i+1));
            System.out.println(jenisAyam);
            System.out.println("Jumlah Ayam : "+jumlah+"\n");
        }
    }
}
