package overloadingride;
public class Manager1841720003Mayang extends Karyawan1841720003Mayang{
    private double mTunjangan;
    private String mBagian;
    private Staff1841720003Mayang st[];

    public void setmTunjanganMayang(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public double getmTunjanganMayang() {
        return mTunjangan;
    }
    
    public void setmBagianMayang(String mBagian) {
        this.mBagian = mBagian;
    }
    
    public String getmBagianMayang() {
        return mBagian;
    }

    public void setStMayang(Staff1841720003Mayang st[]) {
        this.st = st;
    }
    
    public void viewStaffMayang(){
        int i;
        System.out.println("--------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoMayang();
        }
        System.out.println("--------------------");
    }
    
    public void lihatInfoMayang(){
        System.out.println("Manager             : "+this.getmBagianMayang());
        System.out.println("NIP                 : "+this.getmNipMayang());
        System.out.println("Nama                : "+this.getmNamaMayang());
        System.out.println("Golongan            : "+this.getmGolonganMayang());
        System.out.println("Tunjangan           : "+this.getmTunjanganMayang());
        System.out.println("Gaji                : "+this.getmGajiMayang());
        System.out.println("Bagian              : "+this.getmBagianMayang());
        this.viewStaffMayang();
    }
    //Override
    public double getmGajiMayang(){
        return super.getmGajiMayang()+mTunjangan;
    }
}