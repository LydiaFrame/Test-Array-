/*
 * Program: TestArray.java
 * Student: Lydia Frame 
 * Purpose: Create one integer array using an index and one string array using the array initializer, Print both arrays.
*/

import java.util.Scanner;

public class TestArray {

    public static void main(String[] args){

        //integer array
        int[] numbers = new int[5]; 

        //array values by index
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        //string array
        String[] names = {"Tim", "John", "Bill", "Kevin", "Max"}; 

        //For loop to print array numbers
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i]);

            System.out.print(", "); 
        }

        System.out.println("");

        //For loop to print array names
        for (int i = 0; i < names.length; i++) {

            System.out.print(names[i] + ", ");
        }
    }
}