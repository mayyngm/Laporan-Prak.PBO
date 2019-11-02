package polimorfisme1841720003mayang;
public class Barrier1841720003Mayang implements Destroyable1841720003Mayang{
    private int mStrength;
    
    Barrier1841720003Mayang(int mStrength){
        this.mStrength = mStrength;
    }

    public int getStrengthMayang() {
        return mStrength;
    }

    public void setStrengthMayang(int mStrength) {
        this.mStrength = mStrength;
    }
    
    @Override
    public void destroyedMayang(){
        mStrength = (int) (mStrength - (mStrength * 0.1));
        if(mStrength <= 0){
            System.out.println("Barrier Hancur!!");
        }
    }
    
    public String getBarrierInfoMayang(){
        String info = "";
        info += "Barrier Strength = " + mStrength;
        return info;
    }

}
