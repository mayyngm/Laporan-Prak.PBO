package polimorfisme1841720003mayang;
public class IntershipEmployee1841720003Mayang extends Employee1841720003Mayang{
    private int mLength;
    
    public IntershipEmployee1841720003Mayang(String mName, int mLength){
        this.mLength = mLength;
        this.mName = mName;
    }
    public int getmLengthMayang(){
        return mLength;
    }
    public void setmLengthMayang(){
        this.mLength = mLength;
    }
    @Override
    public String getEmployeeInfoMayang(){
        String info = super.getEmployeeInfoMayang()+"\n";
        info+="Registered as intership employee for "+mLength+" month/s\n";
        return info;
    }
}