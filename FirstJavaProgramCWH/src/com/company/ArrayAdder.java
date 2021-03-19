package com.company;

public class ArrayAdder {
    public Integer AddArray(Integer[] input) {
        int sum=0;
        for(int i=0;i<input.length;i++){
           sum=sum+input[i];

        }
     return sum;
    }

    public void sortArray(Integer[] input) {
        int temp;
        for(int i=1;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if (input[j]<input[j-1]) {
                    temp = input[j-1];
                    input[j-1] = input[j];
                    input[j]= temp;
                }
            }
        }
    }

    public void printSum(Integer input) {
        System.out.println("sum is:" +input);
    }
    public void printSort(Integer[] input){
        for(int i=0;i<input.length;i++){
            System.out.println(input[i]+" ");
        }

    }
}
