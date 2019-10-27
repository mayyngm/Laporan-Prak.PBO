package abstrak1841720003mayang;
public class Orang1841720003Mayang {
    private String mNama;
    private Hewan1841720003Mayang mHewanPeliharaan;
    
    public Orang1841720003Mayang(String mNama){
        this.mNama=mNama;
    }
    public void peliharaanHewanMayang(Hewan1841720003Mayang mHewanPeliharaan){
        this.mHewanPeliharaan=mHewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalanMayang(){
        System.out.println("Namaku "+this.mNama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.mHewanPeliharaan.bergerakMayang();
        System.out.println("-----------------------------------------");
    }
}