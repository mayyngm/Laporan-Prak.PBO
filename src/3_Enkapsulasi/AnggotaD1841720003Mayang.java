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
public class AnggotaD1841720003Mayang {
    private String mNamaMayang, mIdMayang;
    private int mLimitPinjamanMayang, mJumPinjamanMayang;
    
    AnggotaD1841720003Mayang(String mIdMayang, String mNamaMayang, int mLimitPinjamanMayang){
        this.mIdMayang=mIdMayang;
        this.mNamaMayang=mNamaMayang;
        this.mLimitPinjamanMayang=mLimitPinjamanMayang;
    }
    public String getmNamaMayang() {
        return mNamaMayang;
    }

    public void setmNamaMayang(String mNamaMayang) {
        this.mNamaMayang = mNamaMayang;
    }

    public String getmIdMayang() {
        return mIdMayang;
    }

    public void setmIdMayang(String mIdMayang) {
        this.mIdMayang = mIdMayang;
    }

    public int getmLimitPinjamanMayang() {
        return mLimitPinjamanMayang;
    }

    public void setmLimitPinjamanMayang(int mLimitPinjamanMayang) {
        this.mLimitPinjamanMayang = mLimitPinjamanMayang;
    }

    public int getmJumPinjamanMayang() {
        return mJumPinjamanMayang;
    }

    public void setmJumPinjamanMayang(int mJumPinjamanMayang) {
        this.mJumPinjamanMayang = mJumPinjamanMayang;
    }
    public int getJumPinjamanMayang(){
        return mJumPinjamanMayang;
    }
}