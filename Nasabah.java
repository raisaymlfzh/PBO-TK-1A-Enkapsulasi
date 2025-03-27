/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk1aRAISAYAUMIL2401081018;

/**
 *
 * @author MyBook Z Series
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;   
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
    public Tabungan getTabungan() {
        return tabungan;
    }
    
    @Override
    public String toString() {
        //return namaAwal + " " + namaAkhir + "-" + (tabungan != null ? tabungan.toString() : "Tidak ada tabungan");
        if(tabungan !=null) {
            return namaAwal + " " + namaAkhir + "-" + tabungan.toString();
        }else{
            return namaAwal + " " + namaAkhir + "- Tidak ada tabungan";
        }
    }
}