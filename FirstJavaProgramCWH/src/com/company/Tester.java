/**1.Array Adder
     a. take n numbers from user and store it in a array.
     b. ArrayAdder : add(Integer[] input) = > add the numbers in array
     c. Sort the array and print the result
*/
package com.company;
import java.util.Scanner;
public class Tester {
    public static final String INPUT = "ENTER %s %d :";

    public static void main(String[] args) {
//        Tester.TestAdder();
        Tester.TestArrayAdder();
    }

    public static void TestAdder(){
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format(INPUT, "number" ,1));
        int a = sc.nextInt();
        System.out.println(String.format(INPUT,"number", 2));
        int b = sc.nextInt();
        Adder Ad = new Adder(a,b);
        Ad.add();
        Ad.printer();
    }

    public static void TestArrayAdder(){
        Integer[] arrayInput = new Integer[]{ 6, 88, 3,34};
        ArrayAdder arrayTester = new ArrayAdder();
        int sum = arrayTester.AddArray(arrayInput);
        arrayTester.printSum(sum);
        arrayTester.sortArray(arrayInput);
        arrayTester.printSort(arrayInput);
    }
}


//1. Take input from user , init TakingInput class with the user input
//2. add the two numbers, print it