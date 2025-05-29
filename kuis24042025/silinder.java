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
public class silinder extends kerucut{
   private double tinggi;
    
    public silinder(){
        super();
        this.tinggi = 0;
    }
    public silinder(double r, double t){
        super();
        this.tinggi = t;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
       return super.getLuas()*tinggi;
    }
   public String toString(){
       return"silinder dengan r :"+super.getR()+
               "tinggi:"+tinggi+
               "volume:"+getVolume();
   }
   @Override
   public double getLuas(){
       double luasSelimut = 2* Math.PI * super.getR() * tinggi;
       double luasAlas = super.getLuas();
       return 2 * luasAlas + luasSelimut;
   }


}