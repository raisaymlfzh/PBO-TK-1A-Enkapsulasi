/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsRaisa2401081018;

/**
 *
 * @author MyBook Z Series
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone(){
    }
    
    public void setkapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    public int getkapasitasBaterai(){
        return kapasitasBaterai;
    }
   
    public void setjumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
    
    public int getjumlahKamera(){
        return jumlahKamera;
    }
    
    @Override
    public String toString(){
        return "Smartphone dgn kapasitas baterai:"+getkapasitasBaterai()+
                "\n Smartphone ada kamera:"+getjumlahKamera();
    }
}
