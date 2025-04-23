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
public class udara extends Kendaraan {
   private boolean mesin;
    
    public udara(){    
        super();
    }
    
    public udara(String nama, int tahunProduksi, boolean mesin){
        super(nama, tahunProduksi);
        this.mesin=mesin;
    }
    
    public boolean getMesin(){
        return mesin;
    }
    
    public void setMesin(boolean Mesin){
        this.mesin=mesin;
    }
    
   @Override
    public void Cetak(){
        super.Cetak();
        System.out.println("Menggunkan mesin="+(mesin? "Ya": "Tidak"));
    }
}
