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
import java.util.Scanner;  
  
public class TestKoperasi1841720003Mayang {  
  
    public void menuMayang() {  
        System.out.println("1. Passing Data");  
        System.out.println("2. Pinjaman");  
        System.out.println("3. Angsuran");  
        System.out.println("4. Exit");  
    }  
    public static void main(String[] args) {  
        AnggotaK1841720003Mayang p = new AnggotaK1841720003Mayang(); 
        TestKoperasi1841720003Mayang m = new TestKoperasi1841720003Mayang();  
  
        Scanner scInt = new Scanner(System.in);  
        Scanner scLine = new Scanner(System.in);  
        int pilih = 0;
        
        do{
        m.menuMayang();  
        System.out.print("Masukkan pilihan Anda: ");  
        pilih = scInt.nextInt();
        switch(pilih){
            case 1: 
            System.out.print("No Ktp: ");  
            String ktp = scLine.nextLine();  
            System.out.print("Nama  : ");  
            String nama = scLine.nextLine();  
            System.out.print("Limit : ");  
            int limit = scInt.nextInt();  
            p = new AnggotaK1841720003Mayang(ktp, nama, limit);
            break;
            case 2:
            System.out.print("Banyak Pinjaman: ");  
            int pinjam = scInt.nextInt();  
            p.pinjamMayang(pinjam);
            break;
            case 3:
            System.out.print("Banyak Angsuran: ");  
            int angsur = scInt.nextInt();  
            p.angsurMayang(angsur);  
            System.out.println("Jumlah pinjaman sekarang: " + p.getmJumPinjamMayang());
            break;
            case 4:
            System.out.println("Terima kasih");
            break;
        }
    }while(pilih<4);
    }
}