package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour powerOfFour;

    @Before
    public void setUp() {

        powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() {

        powerOfFour = null;
    }

    @Test
    public void givenPowerOfFourShouldReturn1() { //checks whether the result matches the expected value

        int result = powerOfFour.isPowerOfFour(16);

        assertEquals(1,result);

    }

    @Test
    public void givenAnotherPowerOfFourShouldReturn1() { //checks whether the result matches the expected value

        int result = powerOfFour.isPowerOfFour(64);

        assertEquals(1,result);

    }

    @Test
    public void givenNotAPowerOfFourShouldReturn0() { //checks whether the result matches the expected value

        int result = powerOfFour.isPowerOfFour(25);

        assertNotEquals(1,result);

    }



}