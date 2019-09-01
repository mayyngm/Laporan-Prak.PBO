package sepedademo;
public class LaptopAhoy {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop();
        LaptopColor lpc2 = new LaptopColor();
        
        lp1.setMerk("ASUS");
        lp1.setSeries("WXYZ");
        lp1.getWindows(10);
        lp1.getMicrosoft(2013);
        lp1.setInstalasi(50000);
        lp1.setPemesanan(4675000);
        lp1.cetakStatus();
        System.out.println("-----------------------------------");
        lpc2.setMerk("ACER");
        lpc2.setSeries("PQRS");
        lpc2.getWindows(11);
        lpc2.getMicrosoft(2018);
        lpc2.setColor("Blue");
        lpc2.tipeKeyboard("dvorak");
        lpc2.setInstalasi(65000);
        lpc2.setPemesanan(7450000);
        lpc2.cetakStatus();
    }
}