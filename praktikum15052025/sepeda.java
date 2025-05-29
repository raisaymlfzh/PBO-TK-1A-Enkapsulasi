/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum15052025;

/**
 *
 * @author MyBook Z Series
 */
public class sepeda {
   protected String jmlSadel;
    protected int jmlGir;
    String jmlRoda;
    String warna;
    
    public sepeda(){
        
    }
    public sepeda(String jmlSadel,int jmlGir){
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;   
    }
    public sepeda(int jmlRoda, String warna, String jmlSadel,int jmlGir){
        super ();
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;   
    }
    public void setJmlSadel(){
        this.jmlSadel=jmlSadel;
    }
    public String getJmlSadel(){
        return jmlSadel;
    }
    public void jmlGir(){
        this.jmlGir=jmlGir;
    }
    public int getJmlGir(){
        return jmlGir;
    }
    public void display (){
        System.out.println("Sepeda");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Jumlah Sadel :"+this.jmlSadel);
        System.out.println("Jumlah Gir :"+this.jmlGir);
        
    }
}
