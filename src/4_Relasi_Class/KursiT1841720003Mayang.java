package mayang.relasiclass.tugas;
public class KursiT1841720003Mayang {
    private String mNomor;
    private Customer1841720003Mayang mCustomer;

    public KursiT1841720003Mayang(String mNomor, Customer1841720003Mayang mCustomer) {
        this.mNomor = mNomor;
        this.mCustomer = mCustomer;
    }

    public String getmNomor() {
        return mNomor;
    }

    public void setmNomor(String mNomor) {
        this.mNomor = mNomor;
    }

    public Customer1841720003Mayang getmCustomer() {
        return mCustomer;
    }

    public void setmCustomer(Customer1841720003Mayang mCustomer) {
        this.mCustomer = mCustomer;
    }
    
    public String infoMayang(){
        String infoMayang= "";
        infoMayang +="Nomor: "+mNomor+ "\n";
        if(this.mNomor != null){
            infoMayang += "Kursi: " +this.getmNomor()+"\n";
        }
        return infoMayang;
    }
}
