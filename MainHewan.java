/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum17042025;

/**
 *
 * @author MyBook Z Series
 */
public class MainHewan {
    public static void main(String[] agrs){
          //pembuatan objek
        Hewan hewanku=new Hewan ("Makhluk hidup");
        kucing kucingku=new kucing("Bobby");
        anjing anjingku=new anjing ("Helly");
        //mengakses super class
        System.out.println("Tampilkan akses sub class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        //mengakses sub class Kucing
        System.out.println("\nTampilkan akses sub class kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        //mengakses sub class anjing
        System.out.println("\nTampilkan akses sub class anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
    }
}
