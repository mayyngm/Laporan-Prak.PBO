package mayang.relasiclass.percobaan3;
public class KeretaApi184172003Mayang {
    private String mNama;
    private String mKelas;
    private Pegawai1841720003Mayang mMasinis;
    private Pegawai1841720003Mayang mAsisten;
    //konstruktor
    public KeretaApi184172003Mayang(String mNama, String mKelas, Pegawai1841720003Mayang mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }
    public KeretaApi184172003Mayang(String mNama, String mKelas, Pegawai1841720003Mayang mMasinis, Pegawai1841720003Mayang mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    //getter setter
    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelas() {
        return mKelas;
    }

    public void setmKelas(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720003Mayang getmMasinis() {
        return mMasinis;
    }

    public void setmMasinis(Pegawai1841720003Mayang mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720003Mayang getmAsisten() {
        return mAsisten;
    }

    public void setmAsisten(Pegawai1841720003Mayang mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n\n";
        info += "Masinis: \n" + this.mMasinis.infoMayang()+ "\n";
        info += "Asisten: \n" + this.mAsisten.infoMayang()+ "\n";
        return info;
    }
}
