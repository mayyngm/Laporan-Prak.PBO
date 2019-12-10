/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IQBAL
 */
public class AnggotaTest extends TestCase{
    
    Anggota1841720003Mayang instance;
    
    public AnggotaTest() {
    }
    
    @BeforeClass
    public static void setUpClassMayang() {
    }
    
    @AfterClass
    public static void tearDownClassMayang() {
    }
    
    @Before
    public void setUpMayang() {
        instance = new Anggota1841720003Mayang("fanani", "jomabang", "098092831");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void testDownMayang() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearchMayang() {
        System.out.println("search test");
        String keyword = "Bella";
        ArrayList<Anggota1841720003Mayang> result = instance.search(keyword);
        ArrayList<Anggota1841720003Mayang> expResult = instance.getByNamaAndAlamatMayang(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveMayang() {
       System.out.println("save test");
        this.instance.saveMayang();
        ArrayList<Anggota1841720003Mayang> expResult = instance.getByNamaAndAlamatMayang(instance.getmNamaMayang(), instance.getmAlamatMayang());
        assertTrue(expResult.size()>0);
    }
    
}
