package mayang.relasiclass.percobaan3;
public class MainPercobaan31841720003Mayang {
    public static void main(String[] args) {
        Pegawai1841720003Mayang masinis = new Pegawai1841720003Mayang("1234", "Spongebob Squarepants");
        Pegawai1841720003Mayang asisten = new Pegawai1841720003Mayang("4567", "Patrick Star");
        KeretaApi184172003Mayang keretaApi = new KeretaApi184172003Mayang("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}