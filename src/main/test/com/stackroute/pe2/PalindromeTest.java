package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() {

        palindrome = new Palindrome();
    }

    @After
    public void tearDown() {

        palindrome = null;
    }

    @Test
    public void givenPalindromeStringShouldReturnPalindrome() { //checks whether the result matches the expected value
        //arrange

        //act
        String result = palindrome.checkPalindrome("madam");
        //assert
        assertEquals("palindrome",result);
    }

    @Test
    public void givenPalindromeString1ShouldReturnPalindrome() { //checks whether the result matches the expected value
        //arrange

        //act
        String result = palindrome.checkPalindrome("maddam");
        //assert
        assertEquals("palindrome",result);
    }

    @Test
    public void givenNonPalindromeStringShouldReturnNonPalindrome() { //checks whether the result matches the expected value
        //arrange

        //act
        String result = palindrome.checkPalindrome("man");
        //assert
        assertEquals("not palindrome",result);
    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullReturnException() {
        String result = palindrome.checkPalindrome(null);
    }

}




