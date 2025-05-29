/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum13032025;

import java.util.Scanner;

/**
 *
 * @author MyBook Z Series
 */
public class mahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long nim;
        String nama;
        int tugas;
        int quiz;
        int uts;
        int uas;
        
        Scanner in=new Scanner(System.in);
        ///meminta input
        System.out.print("Masukkan NIM = ");
        nim = in.nextLong();
        in.nextLine();
        
        System.out.print("Masukkan Nama = ");
        nama = in.nextLine();
        
        System.out.print("Masukkan Nilai Tugas = ");
        tugas = in.nextInt();
        
        System.out.print("Masukkan Nilai quiz = ");
        quiz = in.nextInt();
        
        System.out.print("Masukkan Nilai UTS = ");
        uts = in.nextInt();
        
        System.out.print("Masukkan Nilai UAS = ");
        uas = in.nextInt();
        
        ///deklarasi objek
        mahasiswa orang = new mahasiswa(nim, nama, tugas, uts, uas, quiz);
        
        System.out.println("--Informasi Mahasiswa--");
        orang.TampilData();
        
        System.out.println("---Nilai Akhir---");
        orang.NilaiAkhir();
        
        System.out.println("\n---Konversi Nilai---");
        orang.KonversiNilai();
    
    



    }
    
}
