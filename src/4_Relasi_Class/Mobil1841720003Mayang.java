package mayang.relasiclass.percobaan2;
public class Mobil1841720003Mayang {
    private String mMerk;
    private int mBiaya;

    public Mobil1841720003Mayang() {
    }
    //getter setter
    public String getmMerk() {
        return mMerk;
    }
    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaMobil(int hariMayang){
        return mBiaya*hariMayang;
    }
}
