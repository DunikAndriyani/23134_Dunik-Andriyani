/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KonversiSuhu;

/**
 *
 * @author MRvL
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();
        
        double celcius = 25;
        double fahrenheit = 77;
        
        System.out.println(celcius + " derajat Celcius       = " + konversiSuhu.celciusToFahrenheit(celcius) + " derajat Fahrenheit");
        System.out.println(celcius + " derajat Celcius       = " + konversiSuhu.celciusToReamur(celcius) + " derajat Reamur");
        System.out.println(fahrenheit + " derajat Fahrenheit    = " + konversiSuhu2.fahrenheitToReamur(fahrenheit) + " derajat Reamur");
    }
}
