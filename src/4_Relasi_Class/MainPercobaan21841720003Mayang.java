package mayang.relasiclass.percobaan2;
public class MainPercobaan21841720003Mayang {
    public static void main(String[] args) {
        Mobil1841720003Mayang m = new Mobil1841720003Mayang();
        m.setmMerk("Avanza");
        m.setmBiaya(350000);
        Sopir1841720003Mayang s = new Sopir1841720003Mayang();
        s.setmNama("John Doe");
        s.setmBiaya(200000);
        Pelanggan1841720003Mayang p = new Pelanggan1841720003Mayang();
        p.setmNama("Jane Doe");
        p.setmMobil(m);
        p.setmSopir(s);
        p.setmHari(2);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());
        //tambahan kode pada pertanyaan
        //percobaan 2 nomor 6
        System.out.println(p.getmMobil().getmMerk());
    }
}