/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author IQBAL
 */
public class TestBackendKategori1841720003Mayang {

    public static void main(String[] args) {
        Kategori1841720003Mayang kat1 = new Kategori1841720003Mayang("Novel", "Koleksi buku novel");
        Kategori1841720003Mayang kat2 = new Kategori1841720003Mayang("Referensi", "Buku referensi ilmiah");
        Kategori1841720003Mayang kat3 = new Kategori1841720003Mayang("Novel", "Komik anak-anak");

        kat1.saveMayang();
        kat2.saveMayang();
        kat3.saveMayang();

        kat2.setKeteranganMayang("Koleksi buku referensi ilmiah");
        kat2.saveMayang();

        kat3.delete();

        for (Kategori1841720003Mayang k : new Kategori1841720003Mayang().getAllMayang()) {
            System.out.println("Nama: " + k.getNamaMayang()+ ", Ket: " + k.getKeteranganMayang());
        }

        for (Kategori1841720003Mayang k : new Kategori1841720003Mayang().search("ilmiah")) {
            System.out.println("Nama: " + k.getNamaMayang()+ ", Ket: " + k.getKeteranganMayang());
        }
    }

}
