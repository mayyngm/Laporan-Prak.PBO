package sepedademo;
public class SepedaDemo1841720003Mayang {
    public static void main(String[] args) {
        // buat 2 buah objek sepeda
        Sepeda1841720003Mayang spd1 = new Sepeda1841720003Mayang();
        Sepeda1841720003Mayang spd2 = new Sepeda1841720003Mayang();
        SepedaGunung1841720003Mayang spd4 = new SepedaGunung1841720003Mayang();
        SepedaKhusus1841720003Mayang spd3 = new SepedaKhusus1841720003Mayang();
        //panggil method didalam objek sepeda
        spd3.setMerekMayang("katana");
        spd3.tambahKecepatanMayang(10);
        spd3.remMayang(6);
        spd3.gantiGearMayang(3);
        spd3.setTipeSuspensiMayang("gas suspend");
        spd3.setWarnaMayang("green");
        spd3.setBanMayang("Besar");
        spd3.cetakStatusMayang();
        
        /*spd1.setMerek("Polygone");
        spd1.tambahKecepatanMayang(10);
        spd1.gantiGearMayang(2);
        spd1.setWarnaMayang("Red");
        spd1.cetakStatusMayang();
        
        spd2.setMerekMayang("Wiim Cycle");
        spd2.tambahKecepatanMayang(10);
        spd2.gantiGearMayang(2);
        spd2.tambahKecepatanMayang(10);
        spd2.gantiGearMayang(3);
        spd2.cetakStatusMayang();

        spd4.setMerekMayang("Holycycle");
        spd4.tambahKecepatanMayang(15);
        spd4.gantiGearMayang(6);
        spd4.setTipeSuspensiMayang("Gas suspend");
        spd4.setWarnaMayang("Blue");
        spd4.cetakStatusMayang();*/
    }
}
