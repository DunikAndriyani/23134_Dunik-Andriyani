/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author MRvL
 */
public class Balok extends BangunRuang{
    private double p;
    private double l;
    private double t;
    
    public Balok(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    @Override
    public double getVolume(){
        return p*l*t;
    }
    
    @Override
    public double getLuasPermukaan(){
        return 2*(p*l+p*t+l*t);
    }
}
