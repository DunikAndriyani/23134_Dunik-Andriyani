/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author MRvL
 */
public class View {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok balok = new Balok(8,5,2);
        System.out.println("Volume Balok    : "+balok.getVolume());
        System.out.println("Luas Permukaan  : "+balok.getLuasPermukaan());
        
        Kubus kubus = new Kubus(3);
        System.out.println("Volume Kubus    : "+kubus.getVolume());
        System.out.println("Luas Permukaan  : "+kubus.getLuasPermukaan());
    }
}
