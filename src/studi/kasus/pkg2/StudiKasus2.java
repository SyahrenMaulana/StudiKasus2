/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi.kasus.pkg2;

/**
 *
 * @author ASUS
 */
public class StudiKasus2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Selamat Datang dan Selamat Berhitung");
        Keliling balok = new Keliling();
        balok.input();
        balok.hitung();
        
        System.out.println(balok.hasil());
        
    }
    
}
