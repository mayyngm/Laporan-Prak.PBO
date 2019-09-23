package mayang.relasiclass.percobaan4;

public class Gerbong1841720003Mayang1 {

    private String mKode;
    private Kursi1841720003Mayang[] arrayKursiMayang;

    public Gerbong1841720003Mayang1(String mKode, int jumlah) {
        this.mKode = mKode;
        this.arrayKursiMayang = new Kursi1841720003Mayang[jumlah];
        this.initKursi();
    }

    public void setKode(String mKode) {
        this.mKode = mKode;
    }

    public String getmKode() {
        return mKode;
    }

    public Kursi1841720003Mayang[] getArrayKursiMayang() {
        return arrayKursiMayang;
    }
    
    public void setmPenumpang(Penumpang1841720003Mayang mPenumpang, int nomor) {
        this.arrayKursiMayang[nomor - 1].setmPenumpang(mPenumpang);
    }
    private void initKursi() {
        for (int i = 0; i < arrayKursiMayang.length; i++) {
            this.arrayKursiMayang[i] = new Kursi1841720003Mayang(String.valueOf(i + 1));
        }
    }
    public String info() {
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1841720003Mayang kursi : arrayKursiMayang) {
            info += kursi.info();
        }
        return info;
    }
}
