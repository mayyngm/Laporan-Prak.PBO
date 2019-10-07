package inharitance1841720003mayang;
public class Pc1841720003Mayang extends Komputer1841720003Mayang {

    public int ukuranMemori;

    public Pc1841720003Mayang() {
    }

    public Pc1841720003Mayang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMemori) {
        super(merk,kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMemori = ukuranMemori;
    }
    public void tampilPcMayang(){
        System.out.println("=======PC=======");
        super.tampilDataMayang();
        System.out.println("Ukuran memorinya : "+ukuranMemori);
    }
}
