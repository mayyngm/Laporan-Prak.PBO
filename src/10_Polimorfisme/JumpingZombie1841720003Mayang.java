package polimorfisme1841720003mayang;

public class JumpingZombie1841720003Mayang extends Zombie1841720003Mayang{
    
    JumpingZombie1841720003Mayang(int mHealth, int mLevel){
        super.mHealth = mHealth;
        super.mLevel = mLevel;
    }
    
    @Override
    public void healMayang(){
        switch (super.mLevel) {
            case 1:
                super.mHealth = (super.mHealth + (super.mHealth * 30/100));
                break;
            case 2:
                super.mHealth = (super.mHealth + (super.mHealth * 40/100));
                break;
            case 3:
                super.mHealth = (super.mHealth + (super.mHealth * 50/100));
                break;
            default:
                break;
        }
    }
    
    @Override
    public void destroyedMayang(){
        super.mHealth = (super.mHealth - (super.mHealth * 10/100));
        if(super.mHealth <= 0){
            super.mHealth = 0;
            System.out.println("Jumping Zombie Telah Mati");
        }
    }
    
    @Override
    public String getZombieInfoMayang(){
        String info = "";
        System.out.println("Jumping Zombie Data");
        info += "Health = " + super.mHealth+"\n";
        info += "Level = " + super.mLevel+"\n";
        return info;
    }
}
