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
public class kyboard extends alatMusik implements BisaDinyalakan {
    private boolean dayaTersambung;
    
    public kyboard(String nama,String jenis,boolean dayaTersambung){
        super(nama,jenis);
        this.dayaTersambung=dayaTersambung;
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama+"dinyalakan");
        }else{
            System.out.println(nama+"tidak bisa dinyalakan");
        }
    }
    @Override
    public void matikan(){
        System.out.println(nama+"dinyalakan");
    } 
    @Override
    public boolean cekListrik(){
        return dayaTersambung;
    }
    @Override
    public void mainkan(){
         System.out.println(nama+"dimainkan dengan menekan tuts");
    }
    @Override
    public void stem(){
         System.out.println("kyboard"+nama+"distem secara");
    }
    
}
