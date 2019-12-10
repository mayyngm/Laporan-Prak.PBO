/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.sql.ResultSet;
import java.util.ArrayList;

/
public class Kategori1841720003Mayang {

    private int idkategori;
    private String nama;
    private String keterangan;

    public Kategori1841720003Mayang() {

    }

    public Kategori1841720003Mayang(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public int getIdkategoriMayang() {
        return idkategori;
    }

    public void setIdkategoriMayang(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNamaMayang() {
        return nama;
    }

    public void setNamaMayang(String nama) {
        this.nama = nama;
    }

    public String getKeteranganMayang() {
        return keterangan;
    }

    public void setKeteranganMayang(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1841720003Mayang getByIdMayang(int id) {
        Kategori1841720003Mayang kat = new Kategori1841720003Mayang();
        ResultSet rs = DBHelper1841720003Mayang.selectQuery("Select * from kategori where idkategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori1841720003Mayang();
                kat.setIdkategoriMayang(rs.getInt("idkategori"));
                kat.setNamaMayang(rs.getString("nama"));
                kat.setKeteranganMayang(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720003Mayang> getAllMayang() {
        ArrayList<Kategori1841720003Mayang> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720003Mayang.selectQuery("Select * from kategori");
        try {
            while (rs.next()) {
                Kategori1841720003Mayang kat = new Kategori1841720003Mayang();
                kat.setIdkategoriMayang(rs.getInt("idkategori"));
                kat.setNamaMayang(rs.getString("nama"));
                kat.setKeteranganMayang(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720003Mayang> search(String keyword) {
        ArrayList<Kategori1841720003Mayang> ListKategori = new ArrayList();
        String sql = "Select * from kategori where nama like '%" + keyword + "%' or keterangan like '%" + keyword + "%'";
        ResultSet rs = DBHelper1841720003Mayang.selectQuery(sql);
        try {
            while (rs.next()) {
                Kategori1841720003Mayang kat = new Kategori1841720003Mayang();
                kat.setIdkategoriMayang(rs.getInt("idkategori"));
                kat.setNamaMayang(rs.getString("nama"));
                kat.setKeteranganMayang(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveMayang() {
        if (getByIdMayang(idkategori).getIdkategoriMayang()== 0) {
            String sql = "INSERT INTO kategori (nama, keterangan) values ('" + this.nama + "','" + this.keterangan + "')";
            this.idkategori = DBHelper1841720003Mayang.insertQueryGetId(sql);
        } else {
            String SQL = "Update kategori set nama = '" + this.nama + "', keterangan = '" + this.keterangan + "'"
                    + "where idkategori = '" + this.idkategori + "'";
            DBHelper1841720003Mayang.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "Delete from kategori where idkategori = '" + this.idkategori + "'";
        DBHelper1841720003Mayang.executeQuery(SQL);
    }

    public String toString() {
        return nama;
    }

    ArrayList<Kategori1841720003Mayang> getByNamaAndKeterangan(String nama, String keterangan) {
        ArrayList<Kategori1841720003Mayang> ListKategori = new ArrayList();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720003Mayang.selectQuery("SELECT * FROM kategori Where nama = '"
                    + nama + "' and keterangan = '" + keterangan + "'");
        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720003Mayang.selectQuery("SELECT * FROM kategori Where nama = '"
                    + nama + "'");
        } else {
            rs = DBHelper1841720003Mayang.selectQuery("SELECT * FROM kategori Where keterangan'" + keterangan + "'  ");
        }

        try {
            while (rs.next()) {
                Kategori1841720003Mayang kat = new Kategori1841720003Mayang();
                kat.setIdkategoriMayang(rs.getInt("idkategori"));
                kat.setNamaMayang(rs.getString("nama"));
                kat.setKeteranganMayang(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

}
