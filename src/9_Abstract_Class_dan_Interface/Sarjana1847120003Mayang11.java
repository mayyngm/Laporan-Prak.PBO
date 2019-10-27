package interface1841720003mayang;
public class Sarjana1847120003Mayang11 extends Mahasiswa1841720003Mayang implements ICumlaude1841720003Mayang, IBerprestasi1841720003Mayang{
    public Sarjana1847120003Mayang11(String mNama){
        super(mNama);
    }
    @Override
    public void lulusMayang(){
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiMayang() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void menjuaraiKompetisiMayang() {
        System.out.println("Saya Telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}