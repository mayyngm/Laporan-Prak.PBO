package sepedademo;

public class Sepeda1841720003Mayang {
    private String mMerek, mWarna;
    private int mKecepatan;
    private int mGear;
    
    public void setMerekMayang(String newValue){
        mMerek = newValue;
    }
    public void gantiGearMayang(int newValue){
        mGear = newValue;
    }
    public void tambahKecepatanMayang(int mIncrement){
        mKecepatan = mKecepatan + mIncrement;
    }
    public void remMayang(int mDecrement){
        mKecepatan = mKecepatan - mDecrement;
    }
    public void setWarnaMayang(String newValue){
        mWarna = newValue;
    }
    public void cetakStatusMayang(){
        System.out.println("merek: "+mMerek);
        System.out.println("kecepatan: "+mKecepatan);
        System.out.println("gear: "+mGear);
        System.out.println("Warna: "+mWarna);
    }
}