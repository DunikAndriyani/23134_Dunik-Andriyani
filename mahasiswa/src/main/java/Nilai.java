/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MRvL
 */
public class Nilai {
    String NIM;
    String nama;
    int nilaiAbsen;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;
    
    public Nilai(String NIM, String nama, int nilaiAbsen, int nilaiTugas, int nilaiUTS, int nilaiUAS) {
        this.NIM = NIM;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public double hitungNilaiAkhir() {
        return (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
    
    public void CetakNilai() {
        System.out.println("NIM               : " + NIM);
        System.out.println("Nama              : " + nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS   [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS   [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir       : " + hitungNilaiAkhir());
    }
}