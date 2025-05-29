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
public class mahasiswa {
     long nim;
    String nama;
    int tugas;
    int quiz;
    int uts;
    int uas;
    double nilaiakhir;
    
    
    public mahasiswa (long nim, String nama, int tugas ,int quiz , int uts , int uas ){
        this.nim=nim;
        this.nama=nama;
        this.tugas=tugas;
        this.quiz=quiz;
        this.uts=uts;
        this.uas=uas;
    }
    
    public void TampilData(){
        System.out.println("NIM Mahasiswa    = "+nim);
        System.out.println("Nama Mahasiswa   = "+nama);
        System.out.println("Nilai Tugas      = "+tugas);
        System.out.println("Nilai Quiz       = "+quiz);
        System.out.println("Nilai UTS        = "+uts);
        System.out.println("Nilai UAS        = "+uas);
    }
    public void NilaiAkhir(){
        nilaiakhir = tugas*0.15 + quiz*0.2 + uts*0.3 + uas*0.35;
        System.out.print("Nilai Akhir     = "+nilaiakhir);
    }
    public void KonversiNilai(){
        System.out.print("Nilai Akhir Anda = ");
        
        if(nilaiakhir<40){
            System.out.println("E");
            System.out.println("BSS aja mas");
        }
        else if (nilaiakhir<50){
            System.out.println("D");
        }
        else if (nilaiakhir<65){
            System.out.println("C");
        }
        else if (nilaiakhir<80){
            System.out.println("B");
        }
        else
            System.out.println("A");
    }
    
}