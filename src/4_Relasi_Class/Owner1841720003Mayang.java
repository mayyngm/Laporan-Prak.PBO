package mayang.relasiclass.tugas;
public class Owner1841720003Mayang {
    private String mNama;
    private int mNoIdentity;

    public Owner1841720003Mayang() {
    }
    
    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public int getmNoIdentity() {
        return mNoIdentity;
    }

    public void setmNoIdentity(int mNoIdentity) {
        this.mNoIdentity = mNoIdentity;
    }
    
    public String infoMayang(){
        String infoMayang= "OWNER \n";
        infoMayang+= "Nama: "+mNama+ "\n";
        infoMayang+= "Identity: "+mNoIdentity+ "\n";
        return infoMayang;
    }
}
