package polimorfisme1841720003mayang;
public class Owner1841720003Mayang {
    public void pay(IPayable1841720003Mayang p){
        System.out.println("Total payment = "+p.getIPaymentAmount());
        if(p instanceof ElectricityBill1841720003Mayang){
            ElectricityBill1841720003Mayang eb = (ElectricityBill1841720003Mayang) p;
            System.out.println(""+eb.getBillInfoMayang());
        }else if(p instanceof PermanenEmployee1841720003Mayang){
            PermanenEmployee1841720003Mayang pe = (PermanenEmployee1841720003Mayang) p;
            pe.getEmployeeInfoMayang();
            System.out.println(""+pe.getEmployeeInfoMayang());
        }
    }
    public void showMyEmployeeMayang(Employee1841720003Mayang e){
        System.out.println(""+e.getEmployeeInfoMayang());
        if(e instanceof PermanenEmployee1841720003Mayang)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No neet to pay her/him :)");
    }
}