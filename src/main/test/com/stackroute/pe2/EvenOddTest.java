package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd evenOdd;

    @Before
    public void setUp() {
        evenOdd = new EvenOdd();
    }

    @After
    public void tearDown() {

        evenOdd = null;
    }

    @Test
    public void inputEvenReturnTrue(){ //checks if the function returns true or not
        boolean result = evenOdd.isEven(6);
        assertTrue(result);
    }

    @Test
    public void inputAnotherEvenReturnTrue(){ //checks if the function returns true or not
        boolean result = evenOdd.isEven(28);
        assertTrue(result);
    }

    @Test
    public void inputOddReturnFalse(){ //checks if the function returns false or not
        boolean result = evenOdd.isEven(13);
        assertFalse(result);
    }

    @Test
    public void inputNegativeEvenReturnEven() {  //checks if the function returns false or not
        boolean result = evenOdd.isEven(-23);
        assertFalse(result);
    }



}