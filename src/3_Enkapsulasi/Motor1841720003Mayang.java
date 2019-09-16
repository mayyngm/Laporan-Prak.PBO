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
public class Motor1841720003Mayang {
    private int kecepatanMayang=0;
    private boolean kontakOnMayang=false;
    
    public void printStatusMayang(){
        if (kontakOnMayang==true) {
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepatanMayang+"\n");
    }
    public void nyalakanMesinMayang(){
        kontakOnMayang=true;
    }
    public void matikanMesinMayang(){
        kontakOnMayang=false;
        kecepatanMayang=0;
    }
    public void tambahKecepatanMayang(){
        if (kontakOnMayang==true) {
            kecepatanMayang+=5;
        }
        else{
            System.out.println("kecepatan tidak bisa bertambah karena mesin off!");
        }
    }
    public void kurangiKecepatanMayang(){
        if (kontakOnMayang==true) {
            kecepatanMayang-=5;
        }
        else{
            System.out.println("kecepatan tidak bisa berkurang karena mesin off!");
        }
    }
}