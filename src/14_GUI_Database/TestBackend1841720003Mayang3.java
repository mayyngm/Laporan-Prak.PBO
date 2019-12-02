package frontend;

import backend.Anggota1841720003Mayang;
import backend.Peminjaman1841720003Mayang;
import backend.Buku1841720003Mayang;

public class TestBackend1841720003Mayang3 {
    public static void main(String[] args) {
        Anggota1841720003Mayang agt = new Anggota1841720003Mayang().getByIdMayang(4);
        Buku1841720003Mayang TimunMas = new Buku1841720003Mayang().getByIdMayang(12);
        Peminjaman1841720003Mayang pem1 = new Peminjaman1841720003Mayang(agt, TimunMas, "2019/12/26", "2019/12/28");
        pem1.saveMayang();
        for (Peminjaman1841720003Mayang p : new Peminjaman1841720003Mayang().getAllMayang()) {
            System.out.println("Nama Peminjam : " + p.getAnggotaMayang().getmNamaMayang()+ "\n"
                    +"Nama Buku : " + p.getBukuMayang().getmJudulMayang() + "\n"
                    +"Tanggal Pinjam: " + p.getmTanggalPinjamMayang()+ "\n"
                    +"Tanggal Kembali: " + p.getmTanggalKembaliMayang());
        }
    }
}