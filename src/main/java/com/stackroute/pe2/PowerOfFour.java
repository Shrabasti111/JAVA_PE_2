package com.stackroute.javaexercise2;

public class PowerOfFour {

    //this function checks whether a number is a power of 4 or not
    public int isPowerOfFour(int number)
    {
        if(number == 0)
            return 0;
        while(number != 1)
        {
            if(number % 4 != 0) //if number is not divisible by 4, then the function returns 0
                return 0;
            number = number / 4;
        }
        return 1;
    }

}
