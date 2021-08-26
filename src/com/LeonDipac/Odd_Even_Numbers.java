package com.LeonDipac;

public class Odd_Even_Numbers {
    private int given_number;
    private int modulo_result = 0;

    public void setGiven_number(int number){
        this.given_number = number;
    }

    public int getGiven_number(){
        return given_number;
    }

    public int getModulo_result(){
        return modulo_result;
    }

    // Let's add a parameterized constructor:
    public void odd_even_numbers(int given_number){
        modulo_result = given_number % 2;
        if (modulo_result == 0){
            System.out.println("The given number ( " + given_number + " ) is an even number.");

        }else{
            System.out.println("The given number ( " + given_number + " ) is an odd number.");
        }
    }
}
