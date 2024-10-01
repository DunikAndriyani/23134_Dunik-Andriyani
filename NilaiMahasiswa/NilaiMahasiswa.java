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
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Tampilan Input
        System.out.println("NPM    : ");
        String npm = scanner.nextLine();

        System.out.println("Nama Mahasiswa : ");
        String nama = scanner.nextLine();

        System.out.println("Nilai Kehadiran : ");
        double kehadiran = scanner.nextDouble();

        System.out.println("Nilai Tugas : ");
        double tugas = scanner.nextDouble();

        System.out.println("Nilai UTS : ");
        double uts = scanner.nextDouble();

        System.out.println("Nilai UAS : ");
        double uas = scanner.nextDouble();

        double nilaiAkhir = (0.1 * kehadiran) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);

        char grade;
        String keterangan;

        if (nilaiAkhir >= 76) {
            grade = 'A';
            keterangan = "Istimewa";
        } else if (nilaiAkhir >= 66) {
            grade = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir >= 56) {
            grade = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir >= 46) {
            grade = 'D';
            keterangan = "Kurang";
        } else {
            grade = 'E';
            keterangan = "Kurang Sekali";
        }
        
        System.out.println("NPM             : " + npm);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("Nilai Akhir     : " + nilaiAkhir);
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan      : " + keterangan);
    }
}
