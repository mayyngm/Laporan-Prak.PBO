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
public class AnggotaK1841720003Mayang {
    private String mNoKTP, mNama;
    private int mLimPinjam, mJumPinjam;

    public AnggotaK1841720003Mayang(String mNoKTP, String mNama, int mLimPinjam) {
        this.mNoKTP = mNoKTP;
        this.mNama = mNama;
        this.mLimPinjam = mLimPinjam;
    }

    public AnggotaK1841720003Mayang() {
    }

    public String getmNoKTPMayang() {
        return mNoKTP;
    }

    public void setmNoKTPMayang(String mNoKTP) {
        this.mNoKTP = mNoKTP;
    }

    public String getmNamaMayang() {
        return mNama;
    }

    public void setmNamaMayang(String mNama) {
        this.mNama = mNama;
    }

    public int getmLimPinjamMayang() {
        return mLimPinjam;
    }

    public void setmLimPinjamMayang(int mLimPinjam) {
        this.mLimPinjam = mLimPinjam;
    }

    public int getmJumPinjamMayang() {
        return mJumPinjam;
    }

    public void setmJumPinjamMayang(int mJumPinjam) {
        this.mJumPinjam = mJumPinjam;
    }
    
    public void pinjamMayang(int pinjam){
        if (pinjam > mLimPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!!");
        }
        else{
            mJumPinjam =pinjam;
        }
    }
    public void angsurMayang(int angsur){
        if(angsur > (mJumPinjam*10/100)){
            mJumPinjam-=angsur;
        }
        else{
            System.out.println("maaf angsuran minimal angsuran harus 10%");
        }
    }
}
