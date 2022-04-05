package za.ac.cput.constructor;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    @BeforeEach
    public void setUp() {
    }

    @Test
    @AfterEach
    public void tearDown() {
    }


    @Test
    public void testSum (){

        assertEquals(10, (5+5));

    }

    @Test
    public void testFail () {

        assertEquals(9, (5-3));
    }

    @Test
    @Timeout(10)
    public void testTimeOut()throws InterruptedException {
        while (true) {
            Thread.sleep(300);
        }
    }

    @Test
    @Disabled("Disable current operations of test")
    public void testDisable() {
    }


}