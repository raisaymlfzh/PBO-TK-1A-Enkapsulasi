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
public class Hewan {
    protected String nama;
    
    public Hewan (String nama){
        this.nama=nama;
    }
    
    public void bersuara(){
        System.out.println("Hewan bersuara....");
    }
    
    public void tampilkanNama(){
        System.out.println("Nama hewan "+nama);
    }
}