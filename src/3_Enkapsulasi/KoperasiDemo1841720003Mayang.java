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
public class KoperasiDemo1841720003Mayang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //percobaan 3
        /*Anggota1841720003Mayang anggota1=new Anggota1841720003Mayang();
        anggota1.setNamaMayang("Mayang");
        anggota1.setAlamatMayang("Jl. Ambarawa 4");
        anggota1.setorMayang(100000);
        System.out.println("Simpanan "+anggota1.getNamaMayang()+" : Rp "+anggota1.getSimpananMayang());
        anggota1.pinjamMayang(5000);
        System.out.println("Simpanan "+anggota1.getNamaMayang()+" : Rp "+anggota1.getSimpananMayang());*/
        //percobaan 4
        //passing parameter
        Anggota1841720003Mayang anggota1=new Anggota1841720003Mayang("Mayang","Jl Ambarawa 4");
        System.out.println("Simpanan "+anggota1.getNamaMayang()+" : Rp "+anggota1.getSimpananMayang());
        
        anggota1.setNamaMayang("Mayang");
        anggota1.setAlamatMayang("Jl. Ambarawa 4");
        anggota1.setorMayang(100000);
        System.out.println("Simpanan "+anggota1.getNamaMayang()+" : Rp "+anggota1.getSimpananMayang());
        anggota1.pinjamMayang(5000);
        System.out.println("Simpanan "+anggota1.getNamaMayang()+" : Rp "+anggota1.getSimpananMayang());
    }
    
}
