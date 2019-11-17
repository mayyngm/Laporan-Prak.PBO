package javaapi;
import java.util.ArrayList;
public class InputData1841720003Mayang {
    ArrayList<Mahasiswa1841720003Mayang> ListMahasiswa;
    
    public InputData1841720003Mayang() {
        ListMahasiswa = new ArrayList();
    }

    public void isiData (String mNim, String mNama, String mAlamat) {
        Mahasiswa1841720003Mayang mhs = new Mahasiswa1841720003Mayang(mNim, mNama, mAlamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa1841720003Mayang> getData() {
        return ListMahasiswa;
    }
}