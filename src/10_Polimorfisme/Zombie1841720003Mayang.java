package polimorfisme1841720003mayang;
public abstract class Zombie1841720003Mayang implements Destroyable1841720003Mayang{
    protected int mHealth;
    protected int mLevel;

    abstract public void healMayang();
    abstract public void destroyedMayang();
    
    public String getZombieInfoMayang(){
        String info = "";
        info += "Health = " + mHealth;
        info += "Level = " + mLevel;
        return info;
    }
}
