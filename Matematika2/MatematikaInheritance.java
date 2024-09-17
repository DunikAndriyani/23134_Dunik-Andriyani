/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matematika2;

import com.mycompany.matematika.Matematika;

/**
 *
 * @author MRvL
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika matematika = new Matematika();
        Matematika2 matematika2 = new Matematika2();
        
        System.out.println("Hasil penjumlahan   : " + matematika.pertambahan(10,3));
        System.out.println("Hasil pengurangan   : " + matematika.pengurangan(10,3));
        System.out.println("Hasil perkalian     : " + matematika.perkalian(10,3));
        System.out.println("Hasil pembagian     : " + matematika.pembagian(10,3));
        
        System.out.println("Hasil modulus       : " + matematika2.modulus(10,3));
    }
}
