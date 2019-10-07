package inharitance1841720003mayang;
public class Tabung1841720003Mayang extends Bangun1841720003Mayang{
    protected int t;
    public void setSuperPhiMayang(double phi){
        super.phi = phi;
    }
    public void setSuperRMayang(int r){
        super.r=r;
    }
    public void setTMayang(int t){
        this.t=t;
    }
    public void volumeMayang(){
        System.out.println("Volume Tabung adalah: "+(super.phi*super.r*super.r*this.t));
    }
}