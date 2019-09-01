package sepedademo;
public class LaptopColor extends Laptop{
    private String color, tipeKeyboard;
    
    public void setColor(String newValue){
        color = newValue;
    }
    public void tipeKeyboard(String newValue){
        tipeKeyboard = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Color: "+color);
        System.out.println("Keyboard: "+tipeKeyboard);
    }
}
