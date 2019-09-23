package mayang.relasiclass.percobaan4;

public class MainPercobaan41841720003Mayang {
    public static void main(String[] args) {
        Penumpang1841720003Mayang p = new Penumpang1841720003Mayang("12345", "Mr. Krab");
        Penumpang1841720003Mayang budi = new Penumpang1841720003Mayang("12334", "Budi");
        Gerbong1841720003Mayang gerbong = new Gerbong1841720003Mayang("A", 10); 
        gerbong.setmPenumpang(p, 1);
        gerbong.setmPenumpang(budi, 1);
        System.out.println(gerbong.info()); 
    }
}