package backend;
import java.util.*;
import java.sql.*;

public class Peminjaman1841720003Mayang {
    private int mIdPeminjaman, mIdAnggota, mIdBuku;
    private Anggota1841720003Mayang agt = new Anggota1841720003Mayang();
    private Buku1841720003Mayang buku = new Buku1841720003Mayang();
    private String mTanggalPinjam;
    private String mTanggalKembali;

    public Peminjaman1841720003Mayang(){
        
    }
    
    public Peminjaman1841720003Mayang(Anggota1841720003Mayang agt, Buku1841720003Mayang buku, String mTanggalPinjam, String mTanggalKembali){
        this.agt = agt;
        this.buku = buku;
        this.mTanggalPinjam = mTanggalPinjam;
        this.mTanggalKembali = mTanggalKembali;
    }

    public int getmIdanggotaMayang() {
        return mIdAnggota;
    }

    public void setmIdanggotaMayang(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public int getmIdbukuMayang() {
        return mIdBuku;
    }

    public void setmIdbukuMayang(int mIdBuku) {
        this.mIdBuku = mIdBuku;
    }
          
    public int getmIdpeminjamanMayang() {
        return mIdPeminjaman;
    }

    public void setmIdpeminjamanMayang(int mIdPeminjaman) {
        this.mIdPeminjaman = mIdPeminjaman;
    }

    public Anggota1841720003Mayang getAnggotaMayang() {
        return agt;
    }

    public void setAnggotaMayang(Anggota1841720003Mayang agt) {
        this.agt = agt;
    }

    public Buku1841720003Mayang getBukuMayang() {
        return buku;
    }

    public void setBukuMayang(Buku1841720003Mayang buku) {
        this.buku = buku;
    }

    public String getmTanggalPinjamMayang() {
        return mTanggalPinjam;
    }

    public void setmTanggalPinjamMayang(String mTanggalPinjam) {
        this.mTanggalPinjam = mTanggalPinjam;
    }

    public String getmTanggalKembaliMayang() {
        return mTanggalKembali;
    }

    public void setmTanggalKembaliMayang(String mTanggalKembali) {
        this.mTanggalKembali = mTanggalKembali;
    }
    
    public Peminjaman1841720003Mayang getByIdMayang(int id){
        Peminjaman1841720003Mayang pem = new Peminjaman1841720003Mayang();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("Select "
                + "p.idpeminjaman as idpeminjaman, "
                + "p.tanggalpinjam as tanggalpinjam, "
                + "p.tanggalkembali as tanggalkembali, "
                + "a.idanggota as idanggota, "
                + "b.idbuku as idbuku "
                + "from peminjaman p left join anggota a on p.idanggota = a.idanggota "
                + "left join buku b on p.idbuku = b.idbuku where p.idpeminjaman = '" + id + "'");
        try{
            while(rs.next()){
                pem = new Peminjaman1841720003Mayang();
                pem.setmIdpeminjamanMayang(rs.getInt("idpeminjaman"));
                pem.setmIdanggotaMayang(rs.getInt("idanggota"));
                pem.setmIdbukuMayang(rs.getInt("idbuku"));
                pem.setmTanggalPinjamMayang(rs.getString("tanggalpinjam"));
                pem.setmTanggalKembaliMayang(rs.getString("tanggalkembali"));
                pem.setAnggotaMayang(new Anggota1841720003Mayang().getByIdMayang(pem.getmIdanggotaMayang()));
                pem.setBukuMayang(new Buku1841720003Mayang().getByIdMayang(pem.getmIdbukuMayang()));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pem;
    }
    
    public ArrayList<Peminjaman1841720003Mayang> getAllMayang(){
        Peminjaman1841720003Mayang pem = new Peminjaman1841720003Mayang();
        ArrayList<Peminjaman1841720003Mayang> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("Select "
                + "p.idpeminjaman as idpeminjaman, "
                + "p.tanggalpinjam as tanggalpinjam, "
                + "p.tanggalkembali as tanggalkembali, "
                + "a.idanggota as idanggota, "
                + "b.idbuku as idbuku "
                + "from peminjaman p left join anggota a on p.idanggota = a.idanggota "
                + "left join buku b on p.idbuku = b.idbuku");
        try{
            while(rs.next()){
                pem = new Peminjaman1841720003Mayang();
                pem.setmIdpeminjamanMayang(rs.getInt("idpeminjaman"));
                pem.setmIdanggotaMayang(rs.getInt("idanggota"));
                pem.setmIdbukuMayang(rs.getInt("idbuku"));
                pem.setmTanggalPinjamMayang(rs.getString("tanggalpinjam"));
                pem.setmTanggalKembaliMayang(rs.getString("tanggalkembali"));
                pem.setAnggotaMayang(new Anggota1841720003Mayang().getByIdMayang(pem.getmIdanggotaMayang()));
                pem.setBukuMayang(new Buku1841720003Mayang().getByIdMayang(pem.getmIdbukuMayang()));
                
                ListPinjam.add(pem);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListPinjam;
    }
    
    public void saveMayang(){
        if(getByIdMayang(mIdPeminjaman).getmIdpeminjamanMayang()== 0){
            String sql = "Insert into peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggotaMayang().getmIdAnggotaMayang() + "', "
                    + "'" + this.getBukuMayang().getmIdbukuMayang()+ "',"
                    + "'" + this.mTanggalPinjam + "', "
                    + "'" +this.mTanggalKembali + "' "
                    + ")";
            this.mIdPeminjaman = DBHelper1841720003Mayang.insertQueryGetIdMayang(sql);
        }else{
            String sql = "Update buku set "
                    + "idanggota = '" + this.getAnggotaMayang().getmIdAnggotaMayang()+ "', "
                    + "idbuku = '" + this.getBukuMayang().getmIdbukuMayang() + "', "
                    + "tanggalpinjam = '" + this.mTanggalPinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalKembali + "'";
            DBHelper1841720003Mayang.executeQueryMayang(sql);
        }
    }
    
    public void cariAnggotaMayang(int id){
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("Select * from anggota where idanggota = '" + id + "'");
        try{
            while(rs.next()){
                getAnggotaMayang().setmIdAnggotaMayang(rs.getInt("idanggota"));
                getAnggotaMayang().setmNamaMayang(rs.getString("nama"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void cariBukuMayang(int id){
        ResultSet rs = DBHelper1841720003Mayang.selectQueryMayang("Select * from buku where idbuku = '" + id + "'");
        try{
            while(rs.next()){
                getBukuMayang().setmIdbukuMayang(rs.getInt("idbuku"));
                getBukuMayang().setmJudulMayang(rs.getString("judul"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteMayang(){
        String sql = "Delete from peminjaman where idpeminjaman = '" + this.mIdPeminjaman + "'";
        DBHelper1841720003Mayang.executeQueryMayang(sql);
    }
}
