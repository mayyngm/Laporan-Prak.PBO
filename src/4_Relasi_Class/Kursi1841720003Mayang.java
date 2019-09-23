package mayang.relasiclass.percobaan4;

public class Kursi1841720003Mayang {

    private String nomer;
    private Penumpang1841720003Mayang penumpang;

    public Kursi1841720003Mayang(String nomer) {
        this.nomer = nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getNomer() {
        return nomer;
    }

    public void setmPenumpang(Penumpang1841720003Mayang penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang1841720003Mayang getmPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomer + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
