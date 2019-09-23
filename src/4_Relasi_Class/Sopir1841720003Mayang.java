package mayang.relasiclass.percobaan2;
public class Sopir1841720003Mayang {
    private String mNama;
    private int mBiaya;

    public Sopir1841720003Mayang() {
    }
    //getter setter
    public String getmNama() {
        return mNama;
    }
    public void setmNama(String mNama) {
        this.mNama = mNama;
    }
    public int getmBiaya() {
        return mBiaya;
    }
    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaSopir(int hariMayang){
        return mBiaya*hariMayang;
    }
}