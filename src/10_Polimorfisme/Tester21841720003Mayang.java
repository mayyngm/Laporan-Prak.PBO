package polimorfisme1841720003mayang;
public class Tester21841720003Mayang {
    public static void main(String[] args) {
        PermanenEmployee1841720003Mayang pEmp = new PermanenEmployee1841720003Mayang("Dedik", 500);
        Employee1841720003Mayang e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoMayang());
        System.out.println("--------------------------");
        System.out.println(""+pEmp.getEmployeeInfoMayang());
    }  
}