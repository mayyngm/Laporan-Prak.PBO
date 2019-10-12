package overloadingride;
public class Karyawan1841720003Mayang {
    private String mNama, mNip, mGolongan;
    private double mGaji;    

    public void setmNamaMayang(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipMayang(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganMayang(String mGolongan) {
        this.mGolongan = mGolongan;
        switch (mGolongan.charAt(0)){
            case '1': this.mGaji=5000000;
                break;
            case '2': this.mGaji=3000000;
                break;
            case '3': this.mGaji=2000000;
                break;
            case '4': this.mGaji=1000000;
                break;
            case '5': this.mGaji=750000;
                break;
        }
    }
    public void setmGajiMayang(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNamaMayang() {
        return mNama;
    }

    public String getmNipMayang() {
        return mNip;
    }

    public String getmGolonganMayang() {
        return mGolongan;
    }

    public double getmGajiMayang() {
        return mGaji;
    }
}