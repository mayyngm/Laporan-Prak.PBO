package backend;
import java.util.ArrayList;
import java.sql.*;
public class Kategori1841720003Mayang {
    private int mIdkategori;
    private String mNama, mKeterangan;
    
    @Override
    public String toString(){
        return mNama;
    }

    public Kategori1841720003Mayang() {
    }

    public Kategori1841720003Mayang(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getmIdkategoriMayang() {
        return mIdkategori;
    }

    public void setmIdkategoriMayang(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getmNamaMayang() {
        return mNama;
    }

    public void setmNamaMayang(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeteranganMayang() {
        return mKeterangan;
    }

    public void setmKeteranganMayang(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }
    
    public Kategori1841720003Mayang getByIdMayang(int id){
        Kategori1841720003Mayang kat = new Kategori1841720003Mayang();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("SELECT * FROM kategori "+ "WHERE idkategori= '"+ id + "'");
        
        try{
            while(rs.next()){
                kat = new Kategori1841720003Mayang();
                kat.setmIdkategoriMayang(rs.getInt("idkategori"));
                kat.setmNamaMayang(rs.getString("nama"));
                kat.setmKeteranganMayang(rs.getString("keterangan"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return kat;
    }
    
    public ArrayList<Kategori1841720003Mayang> getAllMayang(){
        ArrayList<Kategori1841720003Mayang> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("SELECT * FROM kategori");
        
        try{
            while(rs.next()){
                Kategori1841720003Mayang kat = new Kategori1841720003Mayang();
                kat.setmIdkategoriMayang(rs.getInt("idkategori"));
                kat.setmNamaMayang(rs.getString("nama"));
                kat.setmKeteranganMayang(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public ArrayList<Kategori1841720003Mayang> search(String keyword){
        ArrayList<Kategori1841720003Mayang> ListKategori = new ArrayList();
        String sql = "SELECT * FROM kategori WHERE " + "nama LIKE '%" + keyword + "%' " + "OR keterangan LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang(sql);
        
        try{
            while(rs.next()){
                Kategori1841720003Mayang kat = new Kategori1841720003Mayang();
                kat.setmIdkategoriMayang(rs.getInt("idkategori"));
                kat.setmNamaMayang(rs.getString("nama"));
                kat.setmKeteranganMayang(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public void saveMayang(){
        if(getByIdMayang(mIdkategori).getmIdkategoriMayang() == 0){
            String SQL = "insert into kategori (nama, keterangan) values("+" '" + this.mNama + "', "+" '" + this.mKeterangan + "' "+" )";
            this.mIdkategori = DBHelper1841720003Mayang.insertQueryGetIdMayang(SQL);
        }
        else{
            String SQL = "UPDATE kategori set"
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720003Mayang.executeQueryMayang(SQL);
        }
    }
    
    public void deleteMayang(){
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720003Mayang.executeQueryMayang(SQL);
    }
}