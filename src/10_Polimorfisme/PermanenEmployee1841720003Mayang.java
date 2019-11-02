package polimorfisme1841720003mayang;
public class PermanenEmployee1841720003Mayang extends Employee1841720003Mayang implements IPayable1841720003Mayang{
    private int mSalary;
    
    public PermanenEmployee1841720003Mayang(String mName, int mSalary){
        this.mName = mName;
        this.mSalary = mSalary;
    }
    public int getmSalary(){
        return mSalary;
    }
    public void setmSalary(int mSalary){
        this.mSalary = mSalary;
    }

    @Override
    public int getIPaymentAmount() {
        return (int) (mSalary+0.05*mSalary);
    }

    @Override
    public String getEmployeeInfoMayang() {
        String info = super.getEmployeeInfoMayang()+"\n";
        info+="Registered as permanent employee with salary "+mSalary+"\n";
        return info;
    }
    
}