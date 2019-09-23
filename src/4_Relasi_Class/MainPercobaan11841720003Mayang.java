package mayang.relasiclass.percobaan1;
public class MainPercobaan11841720003Mayang {
    public static void main(String[] args) {
        Processor1841720003Mayang p = new Processor1841720003Mayang("Intel i5", 3);
        Laptop1841720003Mayang l = new Laptop1841720003Mayang("Thinkpad", p);
        l.infoMayang();
        Processor1841720003Mayang p1 = new Processor1841720003Mayang();        
        p1.setmMerk("Intel i5");
        p1.setmCache(4);
        Laptop1841720003Mayang L1 = new Laptop1841720003Mayang();
        L1.setmMerk("Thinkpad");
        L1.setProc(p1);
        L1.infoMayang();
    }
}
