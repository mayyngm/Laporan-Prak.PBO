package sepedademo;
public class SepedaKhusus extends SepedaGunung {
    protected String ban;
    
    public void setBan(String newValue){
        ban = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Ban: "+ban);
    }
}