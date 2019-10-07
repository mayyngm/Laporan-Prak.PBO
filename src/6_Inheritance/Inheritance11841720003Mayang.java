package inharitance1841720003mayang;
public class Inheritance11841720003Mayang {
    public static void main(String[] args) {
        Manager1841720003Mayang m = new Manager1841720003Mayang();
        m.nama="Vivin";
        m.alamat="Jl.Vinolia";
        m.umur=25;
        m.jk="Perempuan";
        m.gaji=3000000;
        m.tunjangan=1000000;
        m.tampilDatamanagerMayang();
        
        Staff1841720003Mayang s = new Staff1841720003Mayang();
        s.nama="Lestari";
        s.alamat="Malang";
        s.umur=25;
        s.jk="Perempuan";
        s.gaji=2000000;
        s.lembur=500000;
        s.potongan=250000;
        s.tampilDataStaffMayang();
    }
}