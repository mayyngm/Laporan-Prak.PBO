package overloadingride;
public class Staff1841720003Mayang extends Karyawan1841720003Mayang {
    private int mLembur;
    private double mGajiLembur;

    public void setmLemburMayang(int mLembur) {
        this.mLembur = mLembur;
    }

    public int getmLemburMayang() {
        return mLembur;
    }

    public void setmGajiLemburMayang(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getmGajiLemburMayang() {
        return mGajiLembur;
    }
    
    //Overloading
    public double getmGajiMayang(int mLembur, double mGajiLembur){
        return super.getmGajiMayang()+mLembur*mGajiLembur;
    }
    //Override
    public double getGajiMayang(){
        return super.getmGajiMayang()+mLembur*mGajiLembur;
    }
    
    public void lihatInfoMayang(){
        System.out.println("NIP             : "+this.getmNipMayang());
        System.out.println("Nama            : "+this.getmNamaMayang());
        System.out.println("Golongan        : "+this.getmGolonganMayang());
        System.out.println("Jml Lembur      : "+this.getmLemburMayang());
        System.out.printf("Gaji Lembur      : %.0f\n", this.getmGajiLemburMayang());
        System.out.printf("Gaji             : %.0f\n" ,this.getGajiMayang());
    }
}