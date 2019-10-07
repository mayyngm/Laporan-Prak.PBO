package inharitance1841720003mayang;
public class Mac1841720003Mayang extends Laptop1841720003Mayang{
    public String security;
    
    public Mac1841720003Mayang(){
        
    }
    public Mac1841720003Mayang(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security){
        super(merk,kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
        
    }
    public void tampilMacMayang(){
        System.out.println("=======MAC=======");
        super.tampilLaptopMayang();
        System.out.println("Security :"+security);
    }
}

