package inharitance1841720003mayang;
public class Manager1841720003Mayang extends Karyawan1841720003Mayang {
    public int tunjangan;
    
    public Manager1841720003Mayang(){
        
    }
    public void tampilDatamanagerMayang(){
        super.tampilDataKaryawanMayang();
        System.out.println("Tunjangan     = "+tunjangan);
        System.out.println("Total Gaji    = "+(super.gaji+tunjangan));
    }
}
