package mayang.relasiclass.percobaan4;

public class Gerbong1841720003Mayang {

    private String mKode;
    private Kursi1841720003Mayang[] arrayKursiMayang;
    private String mPenumpang;

    public Gerbong1841720003Mayang(String mKode, int jumlah) {
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

    public void setmPenumpang(Penumpang1841720003Mayang mPenumpang, int nomor) {
        if (this.arrayKursiMayang[nomor - 1].getmPenumpang() == null) {
            this.arrayKursiMayang[nomor - 1].setmPenumpang(mPenumpang);
        } else {
            System.out.println("Maaf kursi nomor : " + nomor + " sudah terisi.");
        }
    }

    public String getmPenumpang() {
        return mPenumpang;
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
