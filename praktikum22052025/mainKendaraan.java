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
public class mainKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mobil = new Mobil("tayota avanza",2022,4,"automatic") {};
        motor motor = new motor("yamahe NMAX",2023,"full face",155) {};
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
        
        System.out.println();
        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan();
        
    }
    
}
