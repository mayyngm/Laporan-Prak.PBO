package interface1841720003mayang;
public class ProgramB1841720003Mayang {
    public static void main(String[] args) {
        Rektor1841720003Mayang pakRektor = new Rektor1841720003Mayang();
        Mahasiswa1841720003Mayang mahasiswaBiasa = new Mahasiswa1841720003Mayang("Charlie");
        Sarjana1847120003Mayang sarjanaCumlaude = new Sarjana1847120003Mayang("Dini");
        PascaSarjana1841720003Mayang masterCumlaude = new PascaSarjana1841720003Mayang("Elok");
        
        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
    }
}