package com.withWahib;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.print(" Enter n number : ");
        int n = v.nextInt();

        double numbers[] = new double[n];
        for (int i=0; i<numbers.length; i++){
            numbers[i]= (int) (Math.random()*n);
        }
        double maximum=0 ;
        int g=1;
        for (int i=0; i<numbers.length; i++) {
            if(numbers[i]>maximum)
                maximum=numbers[i];
            g++;
        }

        for (int j=1; j<numbers.length; j++){
            numbers[j-1]=numbers[j];
        }

        System.out.println("This is the original  array ");
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("The Maximum number of the array's elements  : "+maximum);
        System.out.println("");

        double temp=numbers[0];

        numbers[numbers.length-1]=temp;
        System.out.println("This is the shifted array : ");
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}