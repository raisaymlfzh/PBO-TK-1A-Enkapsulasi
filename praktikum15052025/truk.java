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
public class truk extends Mobil {
       protected int muatanMaks;
    
    public truk(){
    }
    
    public truk (int muatanMaks){
        this.muatanMaks=muatanMaks;
    }
    
    public truk (int jmlRoda, String warna,String bahanBakar, int kapasitasMesin, int muatanMaks){
        super (jmlRoda,warna,bahanBakar,kapasitasMesin);
        this.muatanMaks=muatanMaks;
    }
    
    public void setMuatanMaks(){
        this.muatanMaks=muatanMaks;
    }
    
    public int getMuatanMaks(){
        return muatanMaks;
    }
    
    @Override
    public void display (){
        System.out.println("Truk");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Bahan Bakar :"+this.bahanBakar);
        System.out.println("Kapasitas Mesin :"+this.kapasitasMesin);
        System.out.println("Muatan Maksimal :"+this.muatanMaks);
        
    }
}
