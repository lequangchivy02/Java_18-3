package com.company;

import java.util.Scanner;

public class Main {
    //1
    public static void addEven(int n){
        double S=0;
        for(int i = 0;i < n; i=i+2){
            S+=i;
        }
        System.out.println("Tổng 1: "+S);
    }

    //2
    public static void addOdd(int n){
        double S=0;
        for(int i = 1;i < n+1; i=i+2){
            S+=i;
        }
        System.out.println("Tổng 2: "+S);
    }

    //3
    public static void addFraction(double n){
        double S=1;
        for (int i = 1; i <= n; i++){
            S+=1/i;
        }
        System.out.println("Tổng 3: "+S);
    }

    //4
    public static void MultiplicationEvenNumber(int n){
        double S=1;
        for (int i = 2; i <= n; i+=2){
            S*=i;
        }
        System.out.println("Tổng 4: "+S);
    }

    //5
    public static void MultiplicationOddNumber(int n){
        double S=1;
        for (int i = 1; i < n+1; i+=2){
            S*=i;
        }
        System.out.println("Tổng 5: "+S);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n ;
        System.out.println("Nhập N: ");
        n = sc.nextInt();
        addEven(n);
        addOdd(n);
        addFraction(n);
        MultiplicationEvenNumber(n);
        MultiplicationOddNumber(n);
    }
}
