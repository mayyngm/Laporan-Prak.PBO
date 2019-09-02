package sepedademo;
public class SepedaKhusus1841720003Mayang extends SepedaGunung1841720003Mayang {
    protected String mBan;
    
    public void setBanMayang(String newValue){
        mBan = newValue;
    }
    public void cetakStatusMayang(){
        super.cetakStatusMayang();
        System.out.println("Ban: "+mBan);
    }
}