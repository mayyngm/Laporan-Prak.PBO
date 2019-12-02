package backend;
import java.util.ArrayList;
import java.sql.*;
public class Buku1841720003Mayang {
    private int mIdbuku;
    private Kategori1841720003Mayang mKategori = new Kategori1841720003Mayang();
    private String mJudul, mPenerbit, mPenulis;

    public int getmIdbukuMayang() {
        return mIdbuku;
    }

    public void setmIdbukuMayang(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Kategori1841720003Mayang getmKategoriMayang() {
        return mKategori;
    }

    public void setmKategoriMayang(Kategori1841720003Mayang mKategori) {
        this.mKategori = mKategori;
    }

    public String getmJudulMayang() {
        return mJudul;
    }

    public void setmJudulMayang(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmPenerbitMayang() {
        return mPenerbit;
    }

    public void setmPenerbitMayang(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulisMayang() {
        return mPenulis;
    }

    public void setmPenulisMayang(String mPenulis) {
        this.mPenulis = mPenulis;
    }

    public Buku1841720003Mayang() {
    }
    
    public Buku1841720003Mayang(Kategori1841720003Mayang mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }
    
    public Buku1841720003Mayang getByIdMayang(int id){
        Buku1841720003Mayang buku = new Buku1841720003Mayang();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("SELECT "
                        +" b.idbuku AS idbuku, "
                        +" b.judul AS judul, "
                        +" b.penerbit AS penerbit, "
                        +" b.penulis AS penulis, "
                        +" k.idkategori AS idkategori, "
                        +" k.nama AS nama, "
                        +" k.keterangan AS keterangan "
                        +" FROM buku b "
                        +" LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                        +" WHERE b.idbuku = '" + id + "'");
        
        try{
            while(rs.next()){
                buku = new Buku1841720003Mayang();
                buku.setmIdbukuMayang(rs.getInt("idbuku"));
                buku.getmKategoriMayang().setmIdkategoriMayang(rs.getInt("idkategori"));
                buku.getmKategoriMayang().setmNamaMayang(rs.getString("nama"));
                buku.getmKategoriMayang().setmKeteranganMayang(rs.getString("keterangan"));
                buku.setmJudulMayang(rs.getString("judul"));
                buku.setmPenerbitMayang(rs.getString("penerbit"));
                buku.setmPenulisMayang(rs.getString("penulis"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720003Mayang> getAllMayang(){
        Buku1841720003Mayang buku = new Buku1841720003Mayang();
        ArrayList<Buku1841720003Mayang> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("SELECT "
                        +" b.idbuku AS idbuku, "
                        +" b.judul AS judul, "
                        +" b.penerbit AS penerbit, "
                        +" b.penulis AS penulis, "
                        +" k.idkategori AS idkategori, "
                        +" k.nama AS nama, "
                        +" k.keterangan AS keterangan "
                        +" FROM buku b "
                        +" LEFT JOIN kategori k ON b.idkategori = k.idkategori ");        
        try{
            while(rs.next()){
                buku = new Buku1841720003Mayang();
                buku.setmIdbukuMayang(rs.getInt("idbuku"));
                buku.getmKategoriMayang().setmIdkategoriMayang(rs.getInt("idkategori"));
                buku.getmKategoriMayang().setmNamaMayang(rs.getString("nama"));
                buku.getmKategoriMayang().setmKeteranganMayang(rs.getString("keterangan"));
                buku.setmJudulMayang(rs.getString("judul"));
                buku.setmPenerbitMayang(rs.getString("penerbit"));
                buku.setmPenulisMayang(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720003Mayang> search(String keyword){
        Buku1841720003Mayang buku = new Buku1841720003Mayang();
        ArrayList<Buku1841720003Mayang> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("SELECT "
                        +" b.idbuku AS idbuku, "
                        +" b.judul AS judul, "
                        +" b.penerbit AS penerbit, "
                        +" b.penulis AS penulis, "
                        +" k.idkategori AS idkategori, "
                        +" k.nama AS nama, "
                        +" k.keterangan AS keterangan "
                        +" FROM buku b "
                        +" LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                        +" WHERE b.judul LIKE '%" +keyword + "%' "
                        +" OR b.penerbit LIKE '%" +keyword + "%' "
                        +" OR b.penulis LIKE '%" +keyword + "%' ");
        
        try{
           while(rs.next()){
                buku = new Buku1841720003Mayang();
                buku.setmIdbukuMayang(rs.getInt("idbuku"));
                buku.getmKategoriMayang().setmIdkategoriMayang(rs.getInt("idkategori"));
                buku.getmKategoriMayang().setmNamaMayang(rs.getString("nama"));
                buku.getmKategoriMayang().setmKeteranganMayang(rs.getString("keterangan"));
                buku.setmJudulMayang(rs.getString("judul"));
                buku.setmPenerbitMayang(rs.getString("penerbit"));
                buku.setmPenulisMayang(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void saveMayang(){
        if(getByIdMayang(mIdbuku).getmIdbukuMayang() == 0){
            String SQL = "insert into buku (judul, idkategori, penulis, penerbit) values("
                    +" '" + this.mJudul + "', "
                    +" '" + this.getmKategoriMayang().getmIdkategoriMayang() + "', "
                    +" '" + this.mPenulis + "', "
                    +" '" + this.mPenerbit+ "' "
                    +" )";
            this.mIdbuku = DBHelper1841720003Mayang.insertQueryGetIdMayang(SQL);
        }
        else{
            String SQL = "UPDATE buku SET "
                    +" judul = '" + this.mJudul + "', "
                    +" idkategori = '" + this.getmKategoriMayang().getmIdkategoriMayang() + "', "
                    +" penulis = '" + this.mPenulis + "', "
                    +" penerbit = '" + this.mPenerbit+ "' "
                    +" WHERE idbuku = '" +this.mIdbuku+ "'";
            DBHelper1841720003Mayang.executeQueryMayang(SQL);
        }
    }
    
    public void deleteMayang(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720003Mayang.executeQueryMayang(SQL);
    }
}
