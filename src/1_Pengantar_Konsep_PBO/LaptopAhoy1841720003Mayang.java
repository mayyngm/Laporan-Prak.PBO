package sepedademo;
public class LaptopAhoy1841720003Mayang {
    public static void main(String[] args) {
        Laptop1841720003Mayang lp1 = new Laptop1841720003Mayang();
        LaptopColor1841720003Mayang lpc2 = new LaptopColor1841720003Mayang();
        
        lp1.setMerkMayang("ASUS");
        lp1.setSeriesMayang("WXYZ");
        lp1.getWindowsMayang(10);
        lp1.getMicrosoftMayang(2013);
        lp1.setInstalasiMayang(50000);
        lp1.setPemesananMayang(4675000);
        lp1.cetakStatusMayang();
        System.out.println("-----------------------------------");
        lpc2.setMerkMayang("ACER");
        lpc2.setSeriesMayang("PQRS");
        lpc2.getWindowsMayang(11);
        lpc2.getMicrosoftMayang(2018);
        lpc2.setColorMayang("Blue");
        lpc2.tipeKeyboardMayang("dvorak");
        lpc2.setInstalasiMayang(65000);
        lpc2.setPemesananMayang(7450000);
        lpc2.cetakStatusMayang();
    }
}