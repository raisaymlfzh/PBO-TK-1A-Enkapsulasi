/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20032025;

import java.util.Scanner;

/**
 *
 * @author MyBook Z Series
 */
public class textVehicleEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //berat max kendaraan
            System.out.println("buat kendaraan max 10000 kg");
            VehicleEnkapsulasi kend1=new VehicleEnkapsulasi(10000);
            
            //menambahkan beberapa beban ke kendaraan
        System.out.println("menambahkan beban 1 (500 kg)"+kend1.addBox(500));
        System.out.println("menambahkan beban 2 (1000 kg)"+kend1.addBox(1000));
        System.out.println("menambahkan beban 3 (5000 kg)"+kend1.addBox(5000));
        System.out.println("menambahkan beban 4 (750 kg)"+kend1.addBox(750));
        System.out.println("menambahkan beban 5 (3000 kg)"+kend1.addBox(3000));
        
        //beban kendaraan saat ini
        System.out.println("beban kendaraan saat ini");
        System.out.println(kend1.getLoad()+" kg");
        
        Scanner in=new Scanner(System.in); 
        //buat objek ke 2 dengan konstruktor kosong
        VehicleEnkapsulasi kend2=new VehicleEnkapsulasi();
        //input maxLoad
        System.out.println("beban max kendaraan = ");
        double bebanmax=in.nextDouble();
        kend2.setMaxLoad(bebanmax);
        
        //mengisi kendaraan dengan beban
        System.out.println("masukan beban ke kendaraan berat = ");
        double beban=in.nextDouble();
        while(kend2.addBox(beban)){
            kend2.addBox(beban);
            System.out.println("masukan beban ke kendaraan berat = ");
            beban=in.nextDouble();
        }
        if(!kend2.addBox(beban)){
            System.out.println("maaf beban berlebih. penambahan batal");
        }
        System.out.println("beban kendaraan saat ini");
        System.out.println(kend2.getLoad()+" kg");
        }
   
    }
    

