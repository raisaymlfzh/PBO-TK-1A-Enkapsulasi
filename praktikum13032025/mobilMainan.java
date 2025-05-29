/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum13032025;
import java.util.Scenner;

/**
 *
 * @author MyBook Z Series
 */
public class mobilMainan {

    public static void main(String[] args) {
        // TODO code application logic here
        
        mobil mobil1=new mobil();
        mobil1.merk="toyota";
        mobil1.plat="BA 111 AL";
        mobil1.tahun=2000;
        mobil1.warna="hitam";
        
        System.out.println("merek mobil anda = "+mobil1.merk);
        System.out.println("no plat mobil = "+mobil1.plat);
        System.out.println("tahun keluaran = "+mobil1.tahun);
        System.out.println("warna mobil = "+mobil1.warna);
        mobil1.MobilAktif();
        System.out.println(mobil1.suaraMobil());
    }
    
}
