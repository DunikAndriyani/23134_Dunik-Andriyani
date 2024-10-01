/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NilaiMahasiswa;
import java.util.Scanner;
/**
 *
 * @author MRvL
 */
public class PotonganHarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total pembelian    : ");
        int total_pembelian = scanner.nextInt();
        
        int potongan = hitungPotongan(total_pembelian);
        int jumlah_yang_harus_dibayarkan = hitungJumlahYangHarusDibayarkan(total_pembelian, potongan);

        System.out.println("Besarnya potongan           : " + potongan);
        System.out.println("Jumlah yang harus dibayarkan: " + jumlah_yang_harus_dibayarkan);

        scanner.close();
    }

    public static int hitungPotongan(int total_pembelian) {
        if (total_pembelian < 50000) {
            int potongan = (int) (total_pembelian * 0.05);
            return potongan;
        } else {
            int potongan = (int) (total_pembelian * 0.20);
            return potongan;
        }
    }

    public static int hitungJumlahYangHarusDibayarkan(int total_pembelian, int potongan) {
        int jumlah_yang_harus_dibayarkan = total_pembelian - potongan;
        return jumlah_yang_harus_dibayarkan;
    }
}