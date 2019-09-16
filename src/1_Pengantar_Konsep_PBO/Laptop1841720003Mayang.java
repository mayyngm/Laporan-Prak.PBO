package sepedademo;
public class Laptop1841720003Mayang {
    private String mMerk , mSeries;
    private int mWindows, mMicrosoft, mBiaya, mInstalasi, mPemesanan;
  
    public void setMerkMayang(String newValue){
        mMerk = newValue;
    }
    public void setSeriesMayang(String newValue){
        mSeries = newValue;
    }
    public void getWindowsMayang(int newValue){
        mWindows = newValue;
    }
    public void getMicrosoftMayang(int newValue){
        mMicrosoft = newValue;
    }
    public void setInstalasiMayang(int harga){
        mInstalasi = harga;
    }
    public void setPemesananMayang(int harga){
        mPemesanan = harga;
    }
    public void getBiayaMayang(){
        mBiaya = mInstalasi + mPemesanan;
        System.out.println("Total: "+mBiaya);
    }
    public void cetakStatusMayang(){
        System.out.println("Merk: "+mMerk);
        System.out.println("Series: "+mSeries);
        System.out.println("Windows: "+mWindows);
        System.out.println("Microsoft: "+mMicrosoft);
        System.out.println("Biaya instalasi: "+mInstalasi+ " pemesanan: "+mPemesanan);
        getBiayaMayang();
    }
}