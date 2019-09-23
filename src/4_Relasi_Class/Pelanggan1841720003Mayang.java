package mayang.relasiclass.percobaan2;
public class Pelanggan1841720003Mayang {
    private String mNama;
    private Mobil1841720003Mayang mMobil;
    private Sopir1841720003Mayang mSopir;
    private int mHari;

    public Pelanggan1841720003Mayang() {
    }
    //getter setter
    public String getmNama() {
        return mNama;
    }
    public void setmNama(String mNama) {
        this.mNama = mNama;
    }
    public Mobil1841720003Mayang getmMobil() {
        return mMobil;
    }

    public void setmMobil(Mobil1841720003Mayang mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720003Mayang getmSopir() {
        return mSopir;
    }

    public void setmSopir(Sopir1841720003Mayang mSopir) {
        this.mSopir = mSopir;
    }

    public int getmHari() {
        return mHari;
    }

    public void setmHari(int mHari) {
        this.mHari = mHari;
    }
    
    public int hitungBiayaTotal(){
        return mMobil.hitungBiayaMobil(mHari) + mSopir.hitungBiayaSopir(mHari);
    }
}