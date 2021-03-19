package com.company;
public class Adder {
    int num1,num2,sum;
    public Adder(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }
    public void add(){
         sum = num1+num2;
    }
    public void printer(){
        System.out.println("Result is:" +sum);

    }
}
