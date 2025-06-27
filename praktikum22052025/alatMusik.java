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
public abstract class alatMusik {
    String nama;
    private String jenis;
    
    public alatMusik(String nama,String jenis){
        this.nama=nama;
        this.jenis=jenis;
    }
    public void info(){
        System.out.println("alat musik"+nama+"jenis :"+jenis);
    }
    public abstract void mainkan();
    public abstract void stem();
   
    
}
