package za.ac.cput.constructor;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/* ProgramTest.java
   Author: Nawaaz Amien (219099839)
   Date: 10 April 2022
 */

class ProgramTest {

    public Program test1;
    public Program test2;
    public Program test3;

    public ProgramTest(){
    }

    @BeforeAll
    public static void setUpClass(){
    }

    @AfterAll
    public static void tearDownClass(){
    }

    @BeforeEach
    public void setUp(){
        test1=new Program();
        test1.setA(23);
        test1.setB(2);

        test2=new Program();
        test2.setA(2);
        test2.setB(23);

        test3=test2;
    }

    @AfterEach
    public void tearDown(){
    }

    /**
     * Tests dealing with Object Equality, Object Identity, Test fails, Test Timeouts and Test Disabling
     */

    //Testing Object Equality
    @Test
    public void testEquality(){
        assertEquals(test1.getA(),test2.getB());
    }

    //Testing Object Identity
    @Test
    public void testIdentity(){
        assertSame(test2,test3);
    }

    //Testing Test fail
    @Test
    public void testFail(){
        fail("Test is going to fail on purpose");
        assertEquals(test1.getA(),test2.getB());
    }

    //Testing Test Timeout
    @Test
    @Timeout(10)
    public void testTimeOut()throws InterruptedException{
        while (true){
            Thread.sleep(300);
        }
    }

    //Testing Test disabling
    @Test
    @Disabled("This is going to disable purposefully")
    public void testDisable(){
    }

}