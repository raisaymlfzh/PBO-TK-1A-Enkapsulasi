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
public class MainMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // membuat objek statis
         // membuat objek statis
        gitar gitar = new gitar("Klasik","petik",6);
        kyboard kyboard = new Kyboard("Yamaha","Elektronik"`);
        
        System.out.println("\n Alat Musik Gitar");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
    }
    
}
