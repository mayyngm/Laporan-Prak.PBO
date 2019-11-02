package polimorfisme1841720003mayang;
public class Tester41841720003Mayang {
    public static void main(String[] args) {
        Owner1841720003Mayang ow = new Owner1841720003Mayang();
        ElectricityBill1841720003Mayang eBill = new ElectricityBill1841720003Mayang(5, "R-2");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("-----------------------------------");
        
        PermanenEmployee1841720003Mayang pEmp = new PermanenEmployee1841720003Mayang("Dedik", 500);
        ow.pay(pEmp);//pay for permanent employee
        System.out.println("-----------------------------------");
        
        IntershipEmployee1841720003Mayang iEmp = new IntershipEmployee1841720003Mayang("Sunarto", 5);
        ow.showMyEmployeeMayang(pEmp);//show permanent employee info
        System.out.println("------------------------------------");
        ow.showMyEmployeeMayang(iEmp);//show intership employee info
    }  
}