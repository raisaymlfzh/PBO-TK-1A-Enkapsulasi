/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum13032025;

/**
 *
 * @author MyBook Z Series
 */
public class kendaraan {
    String jenis;
    int tahun;
    String warna;
    
    
    ///constructor
    public kendaraan(String j,int t,String w){
        this.jenis=j;
        this.tahun=t;
        this.warna=w;
        
    }
    public void TampilData(){
    System.out.println("jenis kendaraan = "+jenis);
    System.out.println("warna kendaraan = "+warna);
    System.out.println("tahun kendaraan = "+jenis);
    }

//method dengan parameter
public void TipeKendaraan(int kec){
       System.out.println("Tipe kendaraan Anda");
       if(kec<20){
           System.out.println("Lebih baik jalan kaki");
           System.out.println("Ganti kendaraan saja");
       }
       else if(kec<40){
           System.out.println("slow");
       }
       else if(kec<80){
           System.out.println("Standar");
       }
       else if(kec<100){
           System.out.println("Fast");
       }
       else
           System.out.println("Racing Car!!!!");
   }

    
}