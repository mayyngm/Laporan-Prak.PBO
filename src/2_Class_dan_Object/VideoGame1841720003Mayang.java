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
public class VideoGame1841720003Mayang {
    public String namaMemberMayang, namaGameMayang;
    public int idMayang, hargaMayang, sewaMayang;
    
    public void printMayang(){
        System.out.println("Nama Member : "+namaMemberMayang);
        System.out.println("ID Game     : "+idMayang);
        System.out.println("Nama Game   : "+namaGameMayang);
        System.out.println("Harga       : "+hargaMayang);
        System.out.println("Sewa        : "+sewaMayang+" hari");
    }
    int peminjamanMayang(){
        return hargaMayang*sewaMayang;
    }
}
