package inharitance1841720003mayang;
public class StaffHarian1841720003Mayang extends Staff1841720003Mayang {

    public int jmlJamKerja;

    public StaffHarian1841720003Mayang() {

    }

    public StaffHarian1841720003Mayang(String nama, String alamat, String jk,
        int umur, int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilStaffHarianMayang() {
        System.out.println("==================Data Staff Harian==============");
        super.tampilDataStaffMayang();
        System.out.println("Jumlah Jam kerja =" + jmlJamKerja);
        System.out.println("Gaji bersih      =" + (gaji * jmlJamKerja + lembur - potongan));
    }
}
