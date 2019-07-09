package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void setUp() {

        student = new Student();
    }

    @After
    public void tearDown() {

        student = null;
    }

    @Test
    public void inputNumberOfStudentsAndArrayOfMarksShouldReturnAverage() { //checks whether the result matches the expected value
        int number = 5;
        int marksArray[] = {78,89,87,98,79};
        double average = student.average(number, marksArray);
        assertEquals(86.2, average, 0.00001);
    }

    @Test
    public void inputNumberOfStudentsAndArrayOfMarksShouldReturnMaximumMarks() { //checks whether the result matches the expected value
        int number = 5;
        int marksArray[] = {78,89,87,98,79};
        int maximum = student.maximum(number, marksArray);
        assertEquals(98,maximum);
    }

    @Test
    public void inputNumberOfStudentsAndArrayOfMarksShouldReturnMinimumMarks() { //checks whether the result matches the expected value
        int number = 5;
        int marksArray[] = {78,89,87,98,79};
        int minimum = student.minimum(number, marksArray);
        assertEquals(78,minimum);
    }

    @Test
    public void inputZeroReturnsException() { //checks for exception
        int number = 0;
        int marksArray[] = {78,89,87,98,79};
        double result = student.average(number, marksArray);

    }


}