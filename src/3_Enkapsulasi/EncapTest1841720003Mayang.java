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
public class EncapTest1841720003Mayang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EncapDemo1841720003Mayang encap = new EncapDemo1841720003Mayang();
        encap.setNameMayang("Mayang");
        encap.setAgeMayang(17);
        System.out.println("Name: "+ encap.getNameMayang());
        System.out.println("Age : "+ encap.getAgeMayang());
        
        encap.setNameMayang("Muria");
        encap.setAgeMayang(31);
        System.out.println("Name: "+ encap.getNameMayang());
        System.out.println("Age : "+ encap.getAgeMayang());
    }
}