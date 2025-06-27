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
public class gitar extends alatMusik {
    private int jumlahSenar;
    
    public gitar(String nama, String jenis, int jumlahSenar){
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }
    @Override
    public void mainkan(){
      System.out.println(nama+"dipetik dengan"+jumlahSenar);   
    }
    @Override
    public void stem(){
         System.out.println("menyetem gitar"+nama+"dilakukan manual.");
    }
}
