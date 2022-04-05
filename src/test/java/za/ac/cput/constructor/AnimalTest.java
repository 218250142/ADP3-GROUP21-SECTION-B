package za.ac.cput.constructor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal1;
    private Animal animal2; //Levi Williams Student Number 218250142
    private Animal animal3;

    public AnimalTest() {
    }

    @BeforeEach
    public void setUp() {
        animal1 = new Animal();//Levi Williams Student Number 218250142
        animal2 = new Animal();
        animal3 = animal1;
    }

    @Test
    public void testEquality() {
        assertEquals(animal1, animal3);//Levi Williams Student Number 218250142
    }

    @Test
    public void testIdentity() {
        assertSame(animal1, animal3);//Levi Williams Student Number 218250142
    }

    @Test
    @Disabled
    public void testSetAnimal() {
        System.out.println("Ignore Test");//Levi Williams Student Number 218250142
    }

    @Test
    public void testGetAnimal() {
        fail("This will fail");//Levi Williams Student Number 218250142
        assertEquals(animal1, animal3);
    }


    @AfterEach
    public void tearDown() {
    }
}