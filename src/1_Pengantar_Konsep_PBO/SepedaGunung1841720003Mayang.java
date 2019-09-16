package sepedademo;
public class SepedaGunung1841720003Mayang extends Sepeda1841720003Mayang {
    private String mTipeSuspensi;
    
    public void setTipeSuspensiMayang(String newValue){
        mTipeSuspensi = newValue;
    }
    public void cetakStatusMayang(){
        super.cetakStatusMayang();
        System.out.println("Tipe suspensi: "+mTipeSuspensi);
    }
}