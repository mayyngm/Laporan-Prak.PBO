package frontend;

import backend.*;

public class TestBackend1841720003Mayang2 {

    public static void main(String[] args) {
        Kategori1841720003Mayang referensi = new Kategori1841720003Mayang().getByIdMayang(32);
        Kategori1841720003Mayang novel = new Kategori1841720003Mayang().getByIdMayang(31);
        
        Buku1841720003Mayang buku1 = new Buku1841720003Mayang(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720003Mayang buku2 = new Buku1841720003Mayang(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720003Mayang buku3 = new Buku1841720003Mayang(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
// test insert
        buku1.saveMayang();
        buku2.saveMayang();
// test update
        buku2.setmJudulMayang("Aljabar Linier");
        buku2.saveMayang();
// test delete
        buku3.deleteMayang();
// test select all
        for (Buku1841720003Mayang b : new Buku1841720003Mayang().getAllMayang()) {
            System.out.println("Kategori: " + b.getmKategoriMayang().getmNamaMayang()+ ", Judul: " + b.getmJudulMayang());
        }
// test search
        for (Buku1841720003Mayang b : new Buku1841720003Mayang().search("timun")) {
            System.out.println("Kategori: " + b.getmKategoriMayang().getmNamaMayang()+ ", Judul: " + b.getmJudulMayang());
        }
    }
}
