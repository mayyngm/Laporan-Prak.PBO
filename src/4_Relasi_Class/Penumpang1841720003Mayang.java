package mayang.relasiclass.percobaan4;

public class Penumpang1841720003Mayang {

    private String mKtp;
    private String mNama;

    public Penumpang1841720003Mayang(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public void setmKtp(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmKtp() {
        return mKtp;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmNama() {
        return mNama;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + mKtp + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }
}
