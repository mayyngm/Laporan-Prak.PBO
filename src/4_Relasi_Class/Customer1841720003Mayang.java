package mayang.relasiclass.tugas;
public class Customer1841720003Mayang {
    private String mNama;
    private int mMember;

    public Customer1841720003Mayang() {
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public int getmMember() {
        return mMember;
    }

    public void setmMember(int mMember) {
        this.mMember = mMember;
    }
    
    public String infoMayang(){
        String infoMayang= "CUSTOMER \n";
        infoMayang+= "Nama: "+mNama+ "\n";
        infoMayang+= "No Member: "+mMember+ "\n";
        return infoMayang;
    }
}
