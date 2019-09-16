/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi1841720003mayang;

/**
 *
 * @author ASUS
 */
public class TestKoperasi1841720003Mayang12 {

    public static void main(String[] args) {
        AnggotaK1841720003Mayang donny = new AnggotaK1841720003Mayang("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getmNamaMayang());
        System.out.println("Limit Pinjaman: " + donny.getmLimPinjamMayang());
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjamMayang(10000000);
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjamMayang(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getmJumPinjamMayang());
        System.out.println("\nMembayar angsuran 10.000");
        donny.angsurMayang(10000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getmJumPinjamMayang());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsurMayang(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getmJumPinjamMayang());
    }
}
