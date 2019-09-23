package mayang.relasiclass.tugas;
public class Order1841720003Mayang {
    private String mJudul, mBioskop, mHari, mJam;
    private int mHarga, mTotal, mJumlah;
    private Kursi1841720003Mayang mKursi;
    int mTax=3000;

    public Order1841720003Mayang(String mJudul, String mBioskop, String mHari, String mJam, int mHarga, int mJumlah, Kursi1841720003Mayang mKursi) {
        this.mJudul = mJudul;
        this.mBioskop = mBioskop;
        this.mHari = mHari;
        this.mJam = mJam;
        this.mHarga = mHarga;
        this.mJumlah = mJumlah;
        this.mKursi = mKursi;
    }

    public Kursi1841720003Mayang getmKursi() {
        return mKursi;
    }

    public void setmKursi(Kursi1841720003Mayang mKursi) {
        this.mKursi = mKursi;
    }

    public String getmJudul() {
        return mJudul;
    }

    public void setmJudul(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmBioskop() {
        return mBioskop;
    }

    public void setmBioskop(String mBioskop) {
        this.mBioskop = mBioskop;
    }

    public String getmHari() {
        return mHari;
    }

    public void setmHari(String mHari) {
        this.mHari = mHari;
    }

    public String getmJam() {
        return mJam;
    }

    public void setmJam(String mJam) {
        this.mJam = mJam;
    }

    public int getmHarga() {
        return mHarga;
    }

    public void setmJumlah(int mJumlah){
        this.mJumlah = mJumlah;
    }
    
    public int getmJumlah(){
        return mJumlah;
    }
    
    public void setmHarga(int mHarga) {
        this.mHarga = mHarga;
    }

    public int getmTotal() {
        return mTotal=mHarga*mJumlah;
    }
    
    public String infoMayang(){
        String infoMayang= "";
        infoMayang+= "----------"+mJudul+"----------\n";
        infoMayang+= "Tanggal: "+mHari+ "\n";
        infoMayang+= "Jam: "+mJam+ "\n";
        infoMayang+= "Studio: "+mBioskop+ "\n";
        infoMayang+= "Jumlah Tiket: "+mJumlah+ "\n";
        infoMayang+= "Seat: "+mKursi.getmNomor()+ "\n";
        infoMayang+= "-----------------------------\n";
        infoMayang+= "Harga tiket: "+mHarga+ "\n";
        infoMayang+= "Total Bayar: "+mTotal+ "\n";
        infoMayang+= "-----------------------------\n";
        return infoMayang;
    }
}