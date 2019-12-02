package backend;
import java.util.ArrayList;
import java.sql.*;
public class Anggota1841720003Mayang {
    private int mIdAnggota;
    private String mNama, mAlamat, mTelepon;

    public Anggota1841720003Mayang() {
    }

    public Anggota1841720003Mayang(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getmIdAnggotaMayang() {
        return mIdAnggota;
    }

    public void setmIdAnggotaMayang(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getmTeleponMayang() {
        return mTelepon;
    }

    public void setmTeleponMayang(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    public String getmNamaMayang() {
        return mNama;
    }

    public void setmNamaMayang(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatMayang() {
        return mAlamat;
    }

    public void setmAlamatMayang(String mAlamat) {
        this.mAlamat = mAlamat;
    }
    
    public Anggota1841720003Mayang getByIdMayang(int id){
        Anggota1841720003Mayang agt = new Anggota1841720003Mayang();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("SELECT * FROM anggota "+ "WHERE idanggota= '"+ id + "'");
        
        try{
            while(rs.next()){
                agt = new Anggota1841720003Mayang();
                agt.setmIdAnggotaMayang(rs.getInt("idanggota"));
                agt.setmNamaMayang(rs.getString("nama"));
                agt.setmAlamatMayang(rs.getString("alamat"));
                agt.setmTeleponMayang(rs.getString("telepon"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return agt;
    }
    
    public ArrayList<Anggota1841720003Mayang> getAllMayang(){
        ArrayList<Anggota1841720003Mayang> ListAnggota = new ArrayList();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("SELECT * FROM anggota");
        
        try{
            while(rs.next()){
                Anggota1841720003Mayang agt = new Anggota1841720003Mayang();
                agt.setmIdAnggotaMayang(rs.getInt("idanggota"));
                agt.setmNamaMayang(rs.getString("nama"));
                agt.setmAlamatMayang(rs.getString("alamat"));
                agt.setmTeleponMayang(rs.getString("telepon"));
                
                ListAnggota.add(agt);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Anggota1841720003Mayang> search(String keyword){
        ArrayList<Anggota1841720003Mayang> ListAnggota = new ArrayList();
        String sql = "SELECT * FROM anggota WHERE " + "nama LIKE '%" + keyword + "%' " + "OR alamat LIKE '%" + keyword + "%' "+ "OR telepon LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang(sql);
        
        try{
            while(rs.next()){
                Anggota1841720003Mayang agt = new Anggota1841720003Mayang();
                agt.setmIdAnggotaMayang(rs.getInt("idanggota"));
                agt.setmNamaMayang(rs.getString("nama"));
                agt.setmAlamatMayang(rs.getString("alamat"));
                agt.setmTeleponMayang(rs.getString("telepon"));
                
                ListAnggota.add(agt);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public void saveMayang(){
        if(getByIdMayang(mIdAnggota).getmIdAnggotaMayang() == 0){
            String SQL = "insert into anggota (nama, alamat, telepon) values("+" '" + this.mNama + "', "+" '" + this.mAlamat + "', "+" '" + this.mTelepon + "' "+" )";
            this.mIdAnggota = DBHelper1841720003Mayang.insertQueryGetIdMayang(SQL);
        }
        else{
            String SQL = "UPDATE anggota set"
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + " WHERE idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720003Mayang.executeQueryMayang(SQL);
        }
    }
    
    public void deleteMayang(){
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720003Mayang.executeQueryMayang(SQL);
    }
}