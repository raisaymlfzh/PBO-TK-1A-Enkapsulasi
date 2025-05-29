/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum15052025;

import java.util.Scanner;

/**
 *
 * @author MyBook Z Series
 */
public class testPoliMorfisme {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Utama");
            System.out.println("1. Input Data Kendaraan");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu (1/2): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanMenuKendaraan(scanner);
                    break;
                case 2:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 2);

        scanner.close();
    }

    private static void tampilkanMenuKendaraan(Scanner scanner) {
        System.out.println("\nPilih jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Taksi");
        System.out.println("3. Truk");
        System.out.println("4. Sepeda");
        System.out.println("5. Sepeda Listrik");
        System.out.print("Pilih jenis kendaraan (1-5): ");
        int jenisKendaraan = scanner.nextInt();
        scanner.nextLine(); 

        switch (jenisKendaraan) {
            case 1:
                inputMobil(scanner);
                break;
            case 2:
                inputTaksi(scanner);
                break;
            case 3:
                inputTruk(scanner);
                break;
            case 4:
                inputSepeda(scanner);
                break;
            case 5:
                inputSepedaListrik(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid. Kembali ke menu utama.");
        }
    }

    private static void inputMobil(Scanner scanner) {
        System.out.println("\nInput Data Mobil:");
        System.out.print("Jumlah Roda: ");
        int jmlRoda = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Warna: ");
        String warna = scanner.nextLine();
        System.out.print("Bahan Bakar: ");
        String bahanBakar = scanner.nextLine();
        System.out.print("Kapasitas Mesin (cc): ");
        int kapasitasMesin = scanner.nextInt();
        scanner.nextLine(); 

        Mobil mobil = new Mobil(jmlRoda, warna, bahanBakar, kapasitasMesin);
        mobil.display();
    }

    private static void inputTaksi(Scanner scanner) {
        System.out.println("\nInput Data Taksi:");
        System.out.print("Jumlah Roda: ");
        int jmlRoda = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Warna: ");
        String warna = scanner.nextLine();
        System.out.print("Bahan Bakar: ");
        String bahanBakar = scanner.nextLine();
        System.out.print("Kapasitas Mesin (cc): ");
        int kapasitasMesin = scanner.nextInt();
        System.out.print("Tarif Awal: ");
        int tarifAwal = scanner.nextInt();
        System.out.print("Tarif Per Km: ");
        int tarifPerKm = scanner.nextInt();
        scanner.nextLine(); 

        taxi taksi = new taxi(jmlRoda, warna, bahanBakar, kapasitasMesin, tarifAwal, tarifPerKm);
        taksi.display();
    }

    private static void inputTruk(Scanner scanner) {
        System.out.println("\nInput Data Truk:");
        System.out.print("Jumlah Roda: ");
        int jmlRoda = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Warna: ");
        String warna = scanner.nextLine();
        System.out.print("Bahan Bakar: ");
        String bahanBakar = scanner.nextLine();
        System.out.print("Kapasitas Mesin (cc): ");
        int kapasitasMesin = scanner.nextInt();
        System.out.print("Muatan Maksimal (kg): ");
        int muatanMaks = scanner.nextInt();
        scanner.nextLine(); 

        truk truk = new truk(jmlRoda, warna, bahanBakar, kapasitasMesin, muatanMaks);
        truk.display();
    }

    private static void inputSepeda(Scanner scanner) {
        System.out.println("\nInput Data Sepeda:");
        System.out.print("Jumlah Roda: ");
        int jmlRoda = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Warna: ");
        String warna = scanner.nextLine();
        System.out.print("Jumlah Sadel: ");
        String jmlSadel = scanner.nextLine();
        System.out.print("Jumlah Gir: ");
        int jmlGir = scanner.nextInt();
        scanner.nextLine(); 

        sepeda sepeda = new sepeda(jmlRoda, warna, jmlSadel, jmlGir);
        sepeda.display();
    }

    private static void inputSepedaListrik(Scanner scanner) {
        System.out.println("\nInput Data Sepeda Listrik:");
        System.out.print("Jumlah Roda: ");
        int jmlRoda = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Warna: ");
        String warna = scanner.nextLine();
        System.out.print("Jumlah Sadel: ");
        String jmlSadel = scanner.nextLine();
        System.out.print("Jumlah Gir: ");
        int jmlGir = scanner.nextInt();
        System.out.print("Kecepatan Maks (km/h): ");
        int kecepatanMaks = scanner.nextInt();
        System.out.print("Jarak Tempuh (km): ");
        int jarakTempuh = scanner.nextInt();
        scanner.nextLine(); 
        sepedaListrik sepedaListrik = new sepedaListrik(jmlRoda, warna, jmlSadel, jmlGir, kecepatanMaks, jarakTempuh);
        sepedaListrik.display();
    }
}

    
