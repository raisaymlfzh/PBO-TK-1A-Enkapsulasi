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
public class Mobil extends kendaraan{
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public Mobil(){
    }
    
    public Mobil (String bahanBakar, int kapasitasMesin){
        this.bahanBakar=bahanBakar;
        this.kapasitasMesin=kapasitasMesin;
    }
    
    public Mobil (int jmlRoda, String warna ,String bahanBakar, int kapasitasMesin){
        super (jmlRoda,warna);
        this.bahanBakar=bahanBakar;
        this.kapasitasMesin=kapasitasMesin;
    }
    
    public void setBahanBakar(){
        this.bahanBakar=bahanBakar;
    }
    
    public String getBahanBakar(){
        return bahanBakar;
    }
    
    public void setKapasitasMesin(){
        this.kapasitasMesin=kapasitasMesin;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    
    public void display (){
        System.out.println("Mobil");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Bahan Bakar :"+this.bahanBakar);
        System.out.println("Kapasitas Mesin :"+this.kapasitasMesin);
        
    }
}
