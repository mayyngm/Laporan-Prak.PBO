package interface1841720003mayang;
public class Sarjana1847120003Mayang1 extends Mahasiswa1841720003Mayang implements ICumlaude1841720003Mayang{
    public Sarjana1847120003Mayang1(String mNama){
        super(mNama);
    }
    @Override
    public void lulusMayang(){
        super.kuliahDiKampusMayang();
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiMayang() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}