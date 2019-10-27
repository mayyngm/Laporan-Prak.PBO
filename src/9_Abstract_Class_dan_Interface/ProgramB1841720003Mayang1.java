package interface1841720003mayang;
public class ProgramB1841720003Mayang1 {
    public static void main(String[] args) {
        Rektor1841720003Mayang pakRektor = new Rektor1841720003Mayang();
        Mahasiswa1841720003Mayang mahasiswaBiasa = new Mahasiswa1841720003Mayang("Charlie");
        Sarjana1847120003Mayang1 sarjanaCumlaude = new Sarjana1847120003Mayang1("Dini");
        PascaSarjana1841720003Mayang1 masterCumlaude = new PascaSarjana1841720003Mayang1("Elok");
        
        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
    }
}