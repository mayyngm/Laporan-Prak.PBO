/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author ASUS
 */
public class Diskon1841720003Mayang {
    public String kodeMayang, namaBarangMayang;
    public int hargaDasarMayang;
    public float diskonMayang;
    
    int hitungHargaJualMayang(){
        return (int) (hargaDasarMayang - (diskonMayang * hargaDasarMayang));
    }
    public void tampilDataMayang(){
        System.out.println("Kode Barang : "+kodeMayang);
        System.out.println("Nama Barang : "+namaBarangMayang);
        System.out.println("Harga Dasar : Rp."+hargaDasarMayang);
        System.out.println("Diskon      : "+diskonMayang+"%");
        System.out.println("Total Bayar : Rp."+hitungHargaJualMayang());
    }
}
