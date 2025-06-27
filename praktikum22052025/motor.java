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
public abstract class motor extends Kendaraan{
    private String jenisHelm;
    private int cc;
    
    public motor(String merek,int tahun,String jenisHelm,int cc){
       super(merek,tahun);
       this.jenisHelm=jenisHelm;
       this.cc=cc;
    }
    public String getJenisHelm(){
       return jenisHelm;
    }
    public void setJenisHelm(String jenisHelm){
        this.jenisHelm=jenisHelm;
    }
    public void setCc(int cc){
        this.cc=cc;
    }
    @Override
    public void nyalakan() {
       System.out.println("motor"+merek+"dinyalakan dengan stater");
    }
    @Override
    public void matikan() {
       System.out.println("motor"+merek+"dimatikan");
    }
     @Override
    public void info() {
         System.out.println("motor"+merek+",tahun"+tahun+","+"cc"+cc+",helm:"+jenisHelm);
    }
    @Override
    public void periksaKondisi() {
         System.out.println("periksa rantai,oli mesin,dan rem motor"+merek+".");
    }
    @Override
    public void servis() {
         System.out.println("motor"+merek+"perlu servis rutin setiap 3.00km.");
    }
    

    

}
