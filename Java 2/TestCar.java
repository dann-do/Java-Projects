import org.junit.Test;

import jdk.jfr.Timestamp;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import java.io.*; //IO Library for testing System.out messages

public class TestCar {
    private Car car1;
    private Car car2;
    private Car car3;

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream systemOut = System.out;
    
    @Before
	public void setUp()
	{
        car1 = new Car("Car1", 10.5, 60);
        car2 = new Car("Car2", 30.0, 15.33, 60);
        car3 = new Car("Car1", 10.5, 60);

		//Output Streams for testing
		System.setOut(new PrintStream(output));
    }
    
    @Test
    public void testAccelerate(){
        double acceptableDifference = 0.00001;

        double newSpeed1 = 50.0;
        double newSpeed2 = -10.0;
        double newSpeed3 = 100.0;

        car1.accelerate(newSpeed1);
        assertEquals(car1.getVelocity(), 50.0, acceptableDifference);

        car3.accelerate(newSpeed2);
        assertEquals(car3.getVelocity(), -10.0, acceptableDifference);

        car2.accelerate(newSpeed3);
        assertEquals(car2.getVelocity(), 60.0, acceptableDifference);
    }

    @Test
    public void testGetMomentum(){
        double acceptableDifference = 0.00001;
        assertEquals(car1.getMomentum(), 0.0, acceptableDifference);
        assertEquals(car2.getMomentum(), 459.9, acceptableDifference);
    }

    @Test
    public void testEquals(){
        double acceptableDifference = 0.00001;
        assertTrue(car1.equals(car3));
        assertFalse(car1.equals(car2));
    }
}