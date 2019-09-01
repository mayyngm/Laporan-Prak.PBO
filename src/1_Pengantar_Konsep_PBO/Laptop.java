package sepedademo;
public class Laptop {
    private String merk , series;
    private int windows, microsoft, biaya, instalasi, pemesanan;
  
    public void setMerk(String newValue){
        merk = newValue;
    }
    public void setSeries(String newValue){
        series = newValue;
    }
    public void getWindows(int newValue){
        windows = newValue;
    }
    public void getMicrosoft(int newValue){
        microsoft = newValue;
    }
    public void setInstalasi(int harga){
        instalasi = harga;
    }
    public void setPemesanan(int harga){
        pemesanan = harga;
    }
    public void getBiaya(){
        biaya = instalasi + pemesanan;
        System.out.println("Total: "+biaya);
    }
    public void cetakStatus(){
        System.out.println("Merk: "+merk);
        System.out.println("Series: "+series);
        System.out.println("Windows: "+windows);
        System.out.println("Microsoft: "+microsoft);
        System.out.println("Biaya instalasi: "+instalasi+ " pemesanan: "+pemesanan);
        getBiaya();
    }
}