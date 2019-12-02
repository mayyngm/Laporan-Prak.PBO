package frontend;

import backend.*;

public class TestBackend1841720003Mayang1 {

    public static void main(String[] args) {
        Anggota1841720003Mayang agt1 = new Anggota1841720003Mayang("Mayang", "Blitar", "081237114151");
        Anggota1841720003Mayang agt2 = new Anggota1841720003Mayang("Bella", "Malang", "081234567890");
        Anggota1841720003Mayang agt3 = new Anggota1841720003Mayang("Abdulloh", "Lamongan", "081209876543");
// test insert
        agt1.saveMayang();
        agt2.saveMayang();
        agt3.saveMayang();
// test update
        agt2.setmAlamatMayang("Surabaya");
        agt2.saveMayang();
// test delete
        agt1.deleteMayang();
// test select all
        for (Anggota1841720003Mayang a : new Anggota1841720003Mayang().getAllMayang()) {
            System.out.println("Nama: " + a.getmNamaMayang());
            System.out.println("Alamat: " + a.getmAlamatMayang());
            System.out.println("Telepon: " + a.getmTeleponMayang());
        }
// test search
        for (Anggota1841720003Mayang a : new Anggota1841720003Mayang().search("Abdulloh")) {
            System.out.println("RESULT: ");
            System.out.println("Nama: " + a.getmNamaMayang());
            System.out.println("Alamat: " + a.getmAlamatMayang());
            System.out.println("Telepon: " + a.getmTeleponMayang());
        }
    }
}
