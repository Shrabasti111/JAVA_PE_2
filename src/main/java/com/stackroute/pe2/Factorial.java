package com.stackroute.javaexercise2;

public class Factorial {

     //this function calculates the factorial of numbers as long as factorial value is within integer range
       public int[] intFactorial() {

           int number  = 1;
           int factorial = 1;
           while (true)
           {

               if (Integer.MAX_VALUE / factorial < (number+1)) { //condition to check whether factorial value of a number has exceeded the maximum value supported by integer
                   System.out.printf("The factorial of %d is out of range.\n", (number+1));
                   break;
               }
               number++;
               factorial *= number; //calculates the factorial of the number
           }

           int factorialArray[] = new int[number]; //stores all the permitted numbers in an array which is returned by the function
           for(int j=0;j<number;++j){
               factorialArray[j] = j+1;
           }
           return factorialArray;
       }


    //this function calculates the factorial of numbers as long as factorial value is within long range
    public long[] longFactorial() {

        long number  = 1;
        long factorial = 1;
        while (true)
        {

            if (Long.MAX_VALUE / factorial < (number+1)) { //condition to check whether factorial value of a number has exceeded the maximum value supported by long
                System.out.printf("The factorial of %d is out of range.\n", (number+1));
                break;
            }
            number++;
            factorial *= number; //calculates the factorial of the number
        }

        long factorialArray[] = new long[20];
        for(int j=0;j<number;++j){  //stores all the permitted numbers in an array which is returned by the function
            factorialArray[j] = j+1;
        }
        return factorialArray;
    }



}
