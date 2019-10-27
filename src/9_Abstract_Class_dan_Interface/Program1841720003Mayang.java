package abstrak1841720003mayang;
public class Program1841720003Mayang {
    public static void main(String[] args) {
        Kucing1841720003Mayang kucingKampung = new Kucing1841720003Mayang();
        Ikan1841720003Mayang lumbalumba = new Ikan1841720003Mayang();
        
        Orang1841720003Mayang ani = new Orang1841720003Mayang("Ani");
        Orang1841720003Mayang budi = new Orang1841720003Mayang("Budi");
        
        ani.peliharaanHewanMayang(kucingKampung);
        budi.peliharaanHewanMayang(lumbalumba);
        
        ani.ajakPeliharaanJalanJalanMayang();
        budi.ajakPeliharaanJalanJalanMayang();
    }
}