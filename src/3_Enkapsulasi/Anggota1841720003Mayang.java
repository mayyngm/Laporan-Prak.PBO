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
public class Anggota1841720003Mayang {
    private String mNamaMayang;
    private String mAlamatMayang;
    private float mSimpananMayang;
    //konstruktor percobaan 4
    Anggota1841720003Mayang(String mNamaMayang, String mAlamatMayang){
        this.mNamaMayang=mNamaMayang;
        this.mAlamatMayang=mAlamatMayang;
        this.mSimpananMayang=mSimpananMayang;
    }
    //setter, getter nama dan alamat
    public void setNamaMayang(String mNamaMayang){
        this.mNamaMayang=mNamaMayang;
    }
    public void setAlamatMayang(String mAlamatMayang){
        this.mAlamatMayang=mAlamatMayang;
    }
    public String getNamaMayang(){
        return mNamaMayang;
    }
    public String getAlamatMayang(){
        return mAlamatMayang;
    }
    //getter simpanan
    public float getSimpananMayang(){
        return mSimpananMayang;
    }
    public void setorMayang(float uangMayang){
        mSimpananMayang+=uangMayang;
    }
    public void pinjamMayang(float uangMayang){
        mSimpananMayang-=uangMayang;
    }
}
