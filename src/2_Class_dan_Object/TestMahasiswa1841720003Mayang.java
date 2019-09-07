/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author ASUS
 */
public class TestMahasiswa1841720003Mayang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa1841720003Mayang mhs1=new Mahasiswa1841720003Mayang();
        Mahasiswa1841720003Mayang mhs2=new Mahasiswa1841720003Mayang();
        Mahasiswa1841720003Mayang mhs3=new Mahasiswa1841720003Mayang();
        mhs1.nimMayang=101;
        mhs1.namaMayang="Mayang";
        mhs1.alamatMayang="Jl. Terusan Ambarawa";
        mhs1.kelasMayang="TI-2C";
        mhs1.tampilBiodataMayang();
        System.out.println("----------------------------");
        mhs2.nimMayang=102;
        mhs2.namaMayang="Muria";
        mhs2.alamatMayang="Jl. Terusan Surabaya";
        mhs2.kelasMayang="TI-2D";
        mhs2.tampilBiodataMayang();
        System.out.println("----------------------------");
        mhs3.nimMayang=103;
        mhs3.namaMayang="Cahyaningsih";
        mhs3.alamatMayang="Jl. Terusan Jombang";
        mhs3.kelasMayang="TI-2E";
        mhs3.tampilBiodataMayang();
    }
}