package interface1841720003mayang;
public class PascaSarjana1841720003Mayang11 extends Mahasiswa1841720003Mayang implements ICumlaude1841720003Mayang, IBerprestasi1841720003Mayang{
    public PascaSarjana1841720003Mayang11(String mNama){
        super(mNama);
    }
    @Override
    public void lulusMayang() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiMayang() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisiMayang() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");  
    }
}