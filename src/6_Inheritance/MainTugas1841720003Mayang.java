package inharitance1841720003mayang;
public class MainTugas1841720003Mayang {
    public static void main(String[] args) {
        Mac1841720003Mayang M = new Mac1841720003Mayang();
        M.merk = "Macbook Pro";
        M.kecProsesor = 1;
        M.sizeMemory = 216;
        M.jnsProsesor = "Intel core m5";
        M.jnsBaterai="Gatau ";
        M.security="File Vault 2";
        M.tampilMacMayang();
        
        System.out.println("-----------------------------------------");
        
        Windows1841720003Mayang W = new Windows1841720003Mayang();
        W.merk = "Acer Aspire ";
        W.kecProsesor = 2;
        W.sizeMemory = 512;
        W.jnsProsesor = "Intel Core i7";
        W.jnsBaterai ="Whrs battery";
        W.fitur = "Windows 10";
        W.tampilWindowsMayang();
        
        System.out.println("----------------------------------------------");
        
        Pc1841720003Mayang P = new Pc1841720003Mayang();
        P.merk = "Asus";
        P.kecProsesor = 2;
        P.sizeMemory = 512;
        P.jnsProsesor = "Intel Core i5";
        P.ukuranMemori = 14;
        P.tampilPcMayang();
    }
}
