package inharitance1841720003mayang;
public class Karyawan1841720003Mayang {
    public String nama, alamat, jk;
    public int umur, gaji;
    public Karyawan1841720003Mayang() {

    }
    public Karyawan1841720003Mayang(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    public void tampilDataKaryawanMayang() {
        System.out.println("Nama          = "+nama);
        System.out.println("Alamat        = "+alamat);
        System.out.println("Jenis kelamin = "+jk);
        System.out.println("Umur          = "+umur);
        System.out.println("Gaji          = "+gaji);
    }
}
