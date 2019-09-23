package mayang.relasiclass.percobaan3;
public class Pegawai1841720003Mayang {
    private String mNip, mNama;
    //cons parameter
    public Pegawai1841720003Mayang(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }
    //getter setter
    public String getmNip() {
        return mNip;
    }
    public void setmNip(String mNip) {
        this.mNip = mNip;
    }
    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String infoMayang() {
        String infoMayang = "";
        infoMayang += "Nip: " + this.mNip + "\n";
        infoMayang += "Nama: " + this.mNama + "\n";
        return infoMayang;
    }
}
