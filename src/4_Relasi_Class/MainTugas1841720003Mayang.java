package mayang.relasiclass.tugas;

public class MainTugas1841720003Mayang {

    public static void main(String[] args) {
        Owner1841720003Mayang b = new Owner1841720003Mayang();
        b.setmNama("Muria");
        b.setmNoIdentity(4455);
        System.out.println(b.infoMayang());
        Customer1841720003Mayang a = new Customer1841720003Mayang();
        a.setmNama("Mayang");
        a.setmMember(12345);
        System.out.println(a.infoMayang());
        Kursi1841720003Mayang d = new Kursi1841720003Mayang("A10 A11", a);
        Order1841720003Mayang c = new Order1841720003Mayang("HELLO BBY", "STUDIO 1", "Selasa, 01 Jan 2019", "10.15", 35000, 2, d);
        System.out.println(c.infoMayang());
    }
}
