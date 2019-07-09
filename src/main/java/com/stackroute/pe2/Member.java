package com.stackroute.javaexercise2;

public class Member {

        String name;
        int age;
        int salary;

        public void setName(String inputName) {
            name = inputName;
        } //setter function for name

        public void setAge(int inputAge) {
            age = inputAge;
        } //setter function for age

        public void setSalary(int inputSalary) {
            salary = inputSalary;
        } //setter function for salary

        public String getName() { //getter function for name
            return name;
        }

        public int getAge() {
            return age;
        } //getter function for age

        public int getSalary() {
            return salary;
        } //getter function for salary
    }



