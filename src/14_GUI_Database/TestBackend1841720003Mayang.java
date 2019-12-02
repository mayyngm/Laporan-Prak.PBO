package frontend;

import backend.*;

public class TestBackend1841720003Mayang {

    public static void main(String[] args) {
        Kategori1841720003Mayang kat1 = new Kategori1841720003Mayang("Novel", "Koleksi buku novel");
        Kategori1841720003Mayang kat2 = new Kategori1841720003Mayang("Referensi", "Buku referensi ilmiah");
        Kategori1841720003Mayang kat3 = new Kategori1841720003Mayang("Komik", "Komik anak-anak");
// test insert
        kat1.saveMayang();
        kat2.saveMayang();
        kat3.saveMayang();
// test update
        kat2.setmKeteranganMayang("Koleksi buku referensi ilmiah");
        kat2.saveMayang();
// test delete
        kat3.deleteMayang();
// test select all
        for (Kategori1841720003Mayang k : new Kategori1841720003Mayang().getAllMayang()) {
            System.out.println("Nama: " + k.getmNamaMayang()+ ", Ket: " + k.getmKeteranganMayang());
        }
// test search
        for (Kategori1841720003Mayang k : new Kategori1841720003Mayang().search("ilmiah")) {
            System.out.println("Nama: " + k.getmNamaMayang()+ ", Ket: " + k.getmKeteranganMayang());
        }
    }
}
