/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum22052025;

/**
 *
 * @author MyBook Z Series
 */
public abstract class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String transmisi;
    
    public Mobil(String merek,int tahun,int jumlahPintu,String transmisi){
       super(merek,tahun);
       this.jumlahPintu=jumlahPintu;
       this.transmisi=transmisi;
    }
    public int getJumlahPintu(){
      return jumlahPintu; 
    }
    public int setJumlahPintu(int jumlahPintu){
      this.jumlahPintu=jumlahPintu; 
        return 0;
    }
    public String getTransmisi(){
        return transmisi;
    }
    public void setTransmisi(String transmisi){
        this.transmisi=transmisi;
    }

    @Override
    public void nyalakan() {
       System.out.println("Mobil"+merek+"dinyalakan dengan kunci");
    }

    @Override
    public void matikan() {
       System.out.println("Mobil"+merek+"dimatikan");
    }

    @Override
    public void info() {
         System.out.println("Mobil"+merek+",tahun"+tahun+","+jumlahPintu+"pintu, transmisi:"+transmisi);
    }
    @Override
    public void periksaKondisi() {
         System.out.println("periksa oli,rem, dan tekanan ban mobil"+merek+".");
    }
    @Override
    public void servis() {
         System.out.println("dijadwalkan servis setiap 10.00 km");
    }
    

}
