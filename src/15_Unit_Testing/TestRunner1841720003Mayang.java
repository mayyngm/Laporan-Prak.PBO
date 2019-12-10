package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.KategoriTest1841720003Mayang;

public class TestRunner1841720003Mayang {
    
    public static void main(String[] args){
        //UNTUK PERCOBAAN 1
        Result mr = new JUnitCore().runClasses(MessageProcessorTest184172003Mayang.class);
        showMessageResultMayang(mr, MessageProcessorTest184172003Mayang.class.getSimpleName());
        
        //UNTUK PERCOBAAN 2
        mr = new JUnitCore().runClasses(KategoriTest1841720003Mayang.class);
        showMessageResultMayang(mr, KategoriTest1841720003Mayang.class.getSimpleName());
    }
    
    private static void showMessageResultMayang(Result mr, String className) {
        if (mr.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mr.wasSuccessful());
        } else {
            for (Failure failure : mr.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
