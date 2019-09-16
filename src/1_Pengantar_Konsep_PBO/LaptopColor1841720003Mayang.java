package sepedademo;
public class LaptopColor1841720003Mayang extends Laptop1841720003Mayang{
    private String mColor, mTipeKeyboard;
    
    public void setColorMayang(String newValue){
        mColor = newValue;
    }
    public void tipeKeyboardMayang(String newValue){
        mTipeKeyboard = newValue;
    }
    public void cetakStatusMayang(){
        super.cetakStatusMayang();
        System.out.println("Color: "+mColor);
        System.out.println("Keyboard: "+mTipeKeyboard);
    }
}
