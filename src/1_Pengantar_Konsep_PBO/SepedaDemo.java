package sepedademo;
public class SepedaDemo {
    public static void main(String[] args) {
        // buat 2 buah objek sepeda
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        SepedaGunung spd4 = new SepedaGunung();
        //panggil method didalam objek sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.setWarna("Red");
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
        
        spd4.setMerek("Holycycle");
        spd4.tambahKecepatan(15);
        spd4.gantiGear(6);
        spd4.setTipeSuspensi("Gas suspend");
        spd4.setWarna("Blue");
        spd4.cetakStatus();
    }
}
