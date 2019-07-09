package com.stackroute.javaexercise2;
import java.util.*;

public class Palindrome {

        //this function checks whether the input string is a palindrome or not

        public String checkPalindrome(String inputString) {


            StringBuffer stringBuffer = new StringBuffer(inputString);
            if(inputString.equals(stringBuffer.reverse().toString())) { //this condition checks whether the input string and it's reverse are same or not
                return "palindrome";
            } else {
                return "not palindrome";
            }

        }

    }


