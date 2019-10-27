package abstrak1841720003mayang;
public abstract class Hewan1841720003Mayang {
    private int mUmur;
    
    protected Hewan1841720003Mayang(){
        this.mUmur = 0;
    }
    public void bertambahUmurMayang(){
        this.mUmur += 1;
    }
    public abstract void bergerakMayang();
}