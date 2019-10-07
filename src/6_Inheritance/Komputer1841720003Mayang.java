package inharitance1841720003mayang;
public class Komputer1841720003Mayang {

    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer1841720003Mayang() {
    }

    public Komputer1841720003Mayang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.jnsProsesor = jnsProsesor;
        this.sizeMemory = sizeMemory;
    }
    public void tampilDataMayang(){
        System.out.println("Merek Komputer      : "+merk);
        System.out.println("Kecepatan Prosesor  : "+kecProsesor);
        System.out.println("Ukuran memori       : "+sizeMemory);
        System.out.println("Jenis Prosesor      : "+jnsProsesor);
    }
}
