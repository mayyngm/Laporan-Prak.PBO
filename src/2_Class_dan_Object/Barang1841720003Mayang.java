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
public class Barang1841720003Mayang {
    public String namaBrgMayang, jenisBrgMayang;
    public int stokMayang;
    
    public void tampilBarangMayang(){
        System.out.println("Nama Barang     : "+namaBrgMayang);
        System.out.println("Jenis Barang    : "+jenisBrgMayang);
        System.out.println("Stok            : "+stokMayang);
    }
    //method dengan argumen dan nilai balik (return)
    public int tambahStokMayang(int brgMasukMayang){
        int stokBaruMayang=brgMasukMayang+stokMayang;
        return stokBaruMayang;
    }
}
