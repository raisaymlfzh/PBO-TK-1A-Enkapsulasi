/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis24042025;

/**
 *
 * @author MyBook Z Series
 */
public class kerucut extends lingkaran{
    private double tinggi;
    
    public kerucut(){
        super();
        this.tinggi = 0;
    }
    public kerucut(double r, double t){
        super(r);
        this.tinggi = t;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        return (1.0 / 3) * super.getLuas() * tinggi;
    }
    @Override
    public String toString(){
        return "Kerucut dengan r: " + super.getR() +
                "Tinggi: " + tinggi +
                "Volume: " + getVolume() +
                "Luas: " + getLuas();
        
    }
   public double getLUas(){
       double s = Math.sqrt(super.getR()* tinggi * tinggi);
       return super.getLuas()+(Math.PI*super.getR()*s);
   }
}