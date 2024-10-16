/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Looping;

/**
 *
 * @author MRvL
 */
public class Abjad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Huruf dari Z ke A menggunakan For :");   
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nHuruf dari Z - A menggunakan While :");
        char ch = 'Z';
        while (ch >= 'A') {
            System.out.print(ch + " ");
            ch--;
        }

        System.out.println("\n\nHuruf dari Z - A menggunakan Do-While :");
        ch = 'Z';
        do {
            System.out.print(ch + " ");
            ch--;
        } while (ch >= 'A');
    }
}