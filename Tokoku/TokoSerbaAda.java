/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tokoku;
import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {5000, 3000, 7000};
        
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**********************");
        
        System.out.print("Masukkan Jumlah Item Barang : ");
        int jumlahItem = scanner.nextInt();
        
        String[] kodeInput = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];
        
        
        
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke - " + (i + 1));
            System.out.print("Masukkan Kode Barang    : ");
            kodeInput[i] = scanner.next();
            
            System.out.print("Masukkan Jumlah Beli    : ");
            jumlahBeli[i] = scanner.nextInt();
            
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                    break;
                }
            }
        }
        
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("===========================================================================");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("===========================================================================");
        
        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeInput[i].equals(kodeBarang[j])) {
                    System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\t\t%d\n", 
                            (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
                    totalBayar += jumlahBayar[i];
                    break;
                }
            }
        }
        
        System.out.println("===========================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + totalBayar);
        
        scanner.close();
    }
}
