/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk1aRAISAYAUMIL2401081018;

import java.util.Scanner;

/**
 *
 * @author MyBook Z Series
 */
public class test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Awal: ");
        String namaAwal = input.nextLine();
        System.out.print("Nama Akhir: ");
        String namaAkhir = input.nextLine();

        Nasabah nasabah = new Nasabah(namaAwal, namaAkhir);

        System.out.print("Saldo Awal: ");
        int saldoAwal = input.nextInt();
        
        Tabungan tabungan = new Tabungan(saldoAwal);
        nasabah.setTabungan(tabungan);

        System.out.println("\nInfo Nasabah: " + nasabah);

        int menu;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Simpan Uang");
            System.out.println("3. Ambil Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1-4): ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo: " + tabungan.getSaldo());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah disimpan: ");
                    tabungan.simpanUang(input.nextInt());
                    System.out.println("Uang disimpan.");
                    break;
                case 3:
                    System.out.print("Masukkan jumlah diambil: ");
                    if (!tabungan.ambilUang(input.nextInt())) {
                        System.out.println("Saldo tidak cukup.");
                    } else {
                        System.out.println("Uang diambil.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan salah. Coba lagi.");
            }
        } while (menu != 4);

        input.close();
   
    }
}
    
    

