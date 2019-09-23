package mayang.relasiclass.percobaan1;
public class Laptop1841720003Mayang {
    private String mMerk;
    private Processor1841720003Mayang proc;
    //cons default
    public Laptop1841720003Mayang() {
    }
    //cons parameter
    public Laptop1841720003Mayang(String mMerk, Processor1841720003Mayang proc) {
        this.mMerk = mMerk;
        this.proc = proc;
    }
    //setter
    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setProc(Processor1841720003Mayang proc) {
        this.proc = proc;
    }
    
    public void infoMayang(){
        System.out.println("Merk Laptop = "+mMerk);
        proc.infoMayang();
    }
}