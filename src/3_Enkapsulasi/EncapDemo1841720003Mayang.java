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
public class EncapDemo1841720003Mayang {
    private String mNameMayang;
    private int mAgeMayang;
    
    public String getNameMayang(){
        return mNameMayang;
    }
    public void setNameMayang(String newNameMayang){
        mNameMayang=newNameMayang;
    }
    public int getAgeMayang(){
        return mAgeMayang;
    }
    public void setAgeMayang(int newAgeMayang){
        if (newAgeMayang > 30) {
            mAgeMayang=30;
            System.out.println("Min Age is 30!");
        }
        else if(newAgeMayang < 18){
            mAgeMayang=18;
            System.out.println("Max Age is 18!");
        }
        else{
            mAgeMayang=newAgeMayang;
        }
    }
}