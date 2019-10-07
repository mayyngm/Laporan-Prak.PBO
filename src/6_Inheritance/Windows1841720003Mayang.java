package inharitance1841720003mayang;
public class Windows1841720003Mayang extends Laptop1841720003Mayang {
    public String fitur;
    
    public Windows1841720003Mayang(){
        
    }
    public Windows1841720003Mayang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur){
        super(merk,kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
        
    }
    public void tampilWindowsMayang(){
        System.out.println("=======WINDOWS=======");
        super.tampilLaptopMayang();
        System.out.println("Fitur :"+fitur);
    }
}
