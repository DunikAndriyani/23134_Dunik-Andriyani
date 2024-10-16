/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Looping;


/**
 *
 * @author MRvL
 */
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Prima dari 0-20 : ");
        for(int i = 0; i <= 20; i++){
            if(isPrima(i)){
                System.out.println(i + " ");
            }
        }
        
        System.out.println("\nBilangan bukan Prima dari 0-20 : ");
        int j = 0;
        while (j <= 20){
            if(!isPrima(j)){
                System.out.println(j + " ");
            }
            j++;
        }
        
        System.out.println("\nBilangan bukan Prima (do-while) : ");
        int k = 0;
        do{
            if(isPrima(k)){
                System.out.println(k + " ");
            }
            k++;
        }while(k <= 20);
    }

    private static boolean isPrima(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
           if(n % i == 0){
               return false;
           }
        }
        return true;
    }
}
