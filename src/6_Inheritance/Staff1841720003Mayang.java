package inharitance1841720003mayang;
public class Staff1841720003Mayang extends Karyawan1841720003Mayang {

    public int lembur, potongan;

    public Staff1841720003Mayang() {

    }

    public Staff1841720003Mayang(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama,alamat,jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    public void tampilDataStaffMayang(){
        super.tampilDataKaryawanMayang();
        System.out.println("Lembur        = "+lembur);
        System.out.println("Potongan      = "+potongan);
        System.out.println("Total Gaji    = "+(gaji+lembur-potongan));
    }
}
