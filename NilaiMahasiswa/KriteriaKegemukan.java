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
public class KriteriaKegemukan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan berat badan (kg) : ");
        double berat_badan = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi_badan = scanner.nextDouble();

        double imt = hitungIMT(berat_badan, tinggi_badan);

        String kriteria = tentukanKriteriaKegemukan(imt);

        System.out.println("IMT                       : " + imt);
        System.out.println("Kriteria kegemukan        : " + kriteria);

        scanner.close();
    }

    public static double hitungIMT(double berat_badan, double tinggi_badan) {
        double imt = berat_badan / Math.pow(tinggi_badan / 100, 2);
        return imt;
    }

    public static String tentukanKriteriaKegemukan(double imt) {
        if (imt <= 18.4) {
            return "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}