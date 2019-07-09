package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FactorialTest {

    Factorial factorial;

    @Before
    public void setUp() {

        factorial = new Factorial();
    }

    @After
    public void tearDown() {

        factorial = null;
    }

    @Test
    public void returnArrayOfNumbers(){ //checks whether the result matches with the expected value or not
        int result[] = factorial.intFactorial();
        int expected[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        assertArrayEquals(expected,result);
    }

    @Test
    public void returnArrayOfLongNumbers(){ //checks whether the result matches with the expected value or not
        long result[] = factorial.longFactorial();
        long expected[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        assertArrayEquals(expected,result);
    }

}