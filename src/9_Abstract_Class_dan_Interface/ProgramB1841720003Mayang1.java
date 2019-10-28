package interface1841720003mayang;
public class ProgramB1841720003Mayang1 {
    public static void main(String[] args) {
        Rektor1841720003Mayang11 pakRektor = new Rektor1841720003Mayang11();
        Mahasiswa1841720003Mayang mahasiswaBiasa = new Mahasiswa1841720003Mayang("Charlie");
        Sarjana1847120003Mayang sarjanaCumlaude = new Sarjana1847120003Mayang("Dini");
        PascaSarjana1841720003Mayang masterCumlaude = new PascaSarjana1841720003Mayang("Elok");
        
        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude, sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude, masterCumlaude);
    }
}