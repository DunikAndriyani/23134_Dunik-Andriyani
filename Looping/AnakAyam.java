/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Looping;

/**
 *
 * @author MRvL
 */
public class AnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahAyam = 5;
        
        // for
        for (int i = jumlahAyam; i > 0; i--) {
            System.out.println("Tek kotek kotek kotek, anak ayam turun berkotek");
            System.out.println("Anak ayam turunlah " + i + ", mati satu tinggallah " + (i - 1));
        }
        
        System.out.println();
        
        // while
        int ayamWhile = jumlahAyam;
        while (ayamWhile > 0) {
            System.out.println("Tek kotek kotek kotek, anak ayam turun berkotek");
            System.out.println("Anak ayam turunlah " + ayamWhile + ", mati satu tinggallah " + (ayamWhile - 1));
            ayamWhile--;
        }
        
        System.out.println();
        
        // do while
        int ayamDoWhile = jumlahAyam;
        do {
            System.out.println("Tek kotek kotek kotek, anak ayam turun berkotek ");
            System.out.println("Anak ayam turunlah " + ayamDoWhile + ", mati satu tinggallah " + (ayamDoWhile - 1));
            ayamDoWhile--;
        } while (ayamDoWhile > 0);
    }
}