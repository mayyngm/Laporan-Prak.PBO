package polimorfisme1841720003mayang;
public class Tester11841720003Mayang {
    public static void main(String[] args) {
        PermanenEmployee1841720003Mayang pEmp = new PermanenEmployee1841720003Mayang("Dedik", 500);
        IntershipEmployee1841720003Mayang iEmp = new IntershipEmployee1841720003Mayang("Sunarto", 5);
        ElectricityBill1841720003Mayang eBill = new ElectricityBill1841720003Mayang(5, "A-1");
        Employee1841720003Mayang e;
        IPayable1841720003Mayang p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }  
}