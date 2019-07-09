package com.stackroute.javaexercise2;

public class Student {

      public double average(int n, int[] marksArray){ //returns the average mark of all the students
          int sum=0;
          for(int i=0; i<marksArray.length; ++i){
              sum+=marksArray[i];
          }

          return (sum/(double)n);
      }

      public int maximum(int n, int[] marksArray){ //returns the maximum mark among all the marks
          int max = marksArray[0];
          for(int i=0; i<n; ++i) {
              if(marksArray[i]>max){
                  max = marksArray[i];
              }
          }
          return max;
      }

        public int minimum(int n, int[] marksArray){  //returns the minimum mark among all the marks
            int min = marksArray[0];
            for(int i=0; i<n; ++i) {
                if(marksArray[i]<min){
                    min = marksArray[i];
                }
            }
            return min;
        }

}
