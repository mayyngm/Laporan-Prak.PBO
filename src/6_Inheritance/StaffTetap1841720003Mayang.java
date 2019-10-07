package inharitance1841720003mayang;
public class StaffTetap1841720003Mayang extends Staff1841720003Mayang {
    public String golongan;
    public int asuransi;
    
    public StaffTetap1841720003Mayang(){
        
    }
    public StaffTetap1841720003Mayang(String nama, String alamat, String jk, int umur, 
        int gaji, int lembur, int potongan,String golongan, int asuransi){
        super(nama,alamat,jk,umur,gaji,potongan,lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    public void tampilStaffTetapMayang(){
        System.out.println("==================Data Staff tetap==============");
        super.tampilDataStaffMayang();
        System.out.println("Golongan        ="+golongan);
        System.out.println("Jumlah Asuransi ="+asuransi);
        System.out.println("Gaji Bersih     ="+(gaji+lembur-potongan-asuransi));
    }
}
