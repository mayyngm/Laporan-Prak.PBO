package polimorfisme1841720003mayang;
public class ElectricityBill1841720003Mayang implements IPayable1841720003Mayang{
    private int mKwh;
    private String mCategory;
    
    public ElectricityBill1841720003Mayang(int mKwh, String mCategory){
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }
    public int getmKwhMayang(){
        return mKwh;
    }
    public void setmKwh(int mKwh){
        this.mKwh = mKwh;
    }
    public String getmCategory(){
        return mCategory;
    }
    public void setmCategory(String mCategory){
        this.mCategory = mCategory;
    }
    @Override
    public int getIPaymentAmount() {
        return mKwh*getBasePriceMayang();
    }
    public int getBasePriceMayang(){
        int bPrice = 0;
        switch(mCategory){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    public String getBillInfoMayang(){
        return "kWH = "+mKwh+"\n"+"Category = "+mCategory+"("+getBasePriceMayang()+" per kWH)\n";
    }
}