/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author MRvL
 */
public class Kubus extends BangunRuang{
    private double s;
    
    public Kubus(double s){
        this.s = s;
    }
    
    @Override
    public double getVolume(){
        return s*s*s;
    }
    @Override
    public double getLuasPermukaan(){
        return 6*(s*s);
    }
}
