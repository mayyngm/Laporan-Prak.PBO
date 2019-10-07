package inharitance1841720003mayang;

import inharitance1841720003mayang.Laptop1841720003Mayang;

public class Laptop1841720003Mayang extends Komputer1841720003Mayang {

    public String jnsBaterai;

    public Laptop1841720003Mayang() {

    }

    public Laptop1841720003Mayang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk,kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
    public void tampilLaptopMayang(){
        super.tampilDataMayang();
        System.out.println("Jenis Batrei : "+jnsBaterai);
    }
}
