/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi.kasus.pkg2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Keliling {
    int panjang, tinggi, lebar, keliling;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("============");
        System.out.println("Masukan Panjang Balok :");
        panjang = input.nextInt();
        System.out.println("Masukan Tinggi Balok :");
        tinggi = input.nextInt();
        System.out.println("Masukan Lebar Balok :");
        lebar = input.nextInt();
    }
    
    void hitung(){
        System.out.println("============");
        System.out.println("Masukan Panjang Balok :"+panjang);
        System.out.println("Masukan Tinggi Balok :"+tinggi);
        System.out.println("Masukan Lebar Balok :"+lebar);
        keliling = 4 * (panjang + lebar + tinggi);
        
        
        
    }
    
    int hasil(){
        System.out.println("============");
        System.out.println("Keliling Balok :");
        return keliling;
    }
        
}
