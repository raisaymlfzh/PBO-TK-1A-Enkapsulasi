/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktek22052025;

/**
 *
 * @author MyBook Z Series
 */
public class kartuKredit extends Pembayaran {
    private String nomorKartu;
    private String bankPenerbit;

    public kartuKredit(double totalHarga, String nomorKartu, String bankPenerbit) {
        super(totalHarga);
        this.nomorKartu = nomorKartu;
        this.bankPenerbit = bankPenerbit;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("\n=== PEMBAYARAN KARTU KREDIT ===");
        System.out.println("Total: Rp" + totalHarga);
        System.out.println("Bank Penerbit: " + bankPenerbit);
        System.out.println("No. Kartu: " + nomorKartu.replaceAll(".(?=.{4})", "*"));
        System.out.println("\nSilakan masukkan kartu Anda ke mesin EDC");
        
        statusPembayaran = true;
        System.out.println("\nPembayaran kartu kredit berhasil diproses!");
    }

    @Override
    public String getDetailPembayaran() {
        return super.getDetailPembayaran() + " | Metode: Kartu Kredit | Bank: " + bankPenerbit;
    }
}



