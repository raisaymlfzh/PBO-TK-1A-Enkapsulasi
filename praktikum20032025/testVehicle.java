/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20032025;

/**
 *
 * @author MyBook Z Series
 */
public class testVehicle {
    public static void main(String[] args){
        //buat kendaraan dengan beban maksimal
        System.out.println("buat kendaraan max beban 10000 kg");
        Vehicle kend1 = new Vehicle(10000);
        
        //menambahkan beberapa beban ke kendaraan
        System.out.println("menambahkan beban 1 (500 kg)");
        kend1.load = kend1.load+500;
        System.out.println("menambahkan beban 2 (1000 kg)");
        kend1.load = kend1.load+1000;
        System.out.println("menambahkan beban 3 (5000 kg)");
        kend1.load = kend1.load+5000;
        System.out.println("menambahkan beban 4 (750 kg)");
        kend1.load = kend1.load+750;
        System.out.println("menambahkan beban 5 (3000 kg)");
        kend1.load = kend1.load+3000;
        
        //menampilkan beban kendaraan saat ini
        System.out.println("beban kendaraan saat ini");
        System.out.println(kend1.getLoad()+" kg");
    }
    
}
