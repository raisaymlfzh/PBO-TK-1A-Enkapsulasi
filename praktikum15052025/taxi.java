/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum15052025;

/**
 *
 * @author MyBook Z Series
 */
public class taxi extends truk{
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public taxi(){
    }
    
    public taxi (int tarifAwal, int tarifPerKm){
        this.tarifAwal=tarifAwal;
        this.tarifPerKm=tarifPerKm;
    }
    
    public taxi (int jmlRoda, String warna, String bahanBakar, int kapasitasMesin,int tarifAwal, int tarifPerKm){
        super();
        this.tarifAwal=tarifAwal;
        this.tarifPerKm=tarifPerKm;
    }
    
    public void setTarifAwal(){
        this.tarifAwal=tarifAwal;
        
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKm(){
        this.tarifPerKm=tarifPerKm;
    }
    
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    
    @Override
    public void display (){
        System.out.println("Taxi");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Bahan Bakar :"+this.bahanBakar);
        System.out.println("Kapasitas Mesin :"+this.kapasitasMesin);
        System.out.println("Tarif Awal :"+this.tarifAwal);
        System.out.println("Tarif Per KM :"+this.tarifPerKm);   
    }
}

