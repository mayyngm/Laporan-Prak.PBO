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
public class TestBarang1841720003Mayang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang1841720003Mayang brg1=new Barang1841720003Mayang();
        brg1.namaBrgMayang="pensil";
        brg1.jenisBrgMayang="ATK";
        brg1.stokMayang=10;
        brg1.tampilBarangMayang();
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah "+brg1.tambahStokMayang(20));
    }
    
}
