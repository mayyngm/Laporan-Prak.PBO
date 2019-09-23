package mayang.relasiclass.percobaan1;
public class Processor1841720003Mayang {
    private String mMerk;
    private double mCache;

    public Processor1841720003Mayang() {
    }
    //
    public Processor1841720003Mayang(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }
    //getter setter
    public String getmMerk() {
        return mMerk;
    }
    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }
    public double getmCache() {
        return mCache;
    }
    public void setmCache(double mCache) {
        this.mCache = mCache;
    }
    public void infoMayang(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}
