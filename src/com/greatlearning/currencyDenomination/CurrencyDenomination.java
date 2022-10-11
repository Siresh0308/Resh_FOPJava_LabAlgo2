package com.greatlearning.currencyDenomination;

import java.util.Scanner;

public class CurrencyDenomination {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of currency denomination:");
        int size = s.nextInt();
        int count[]= new int[size];
        int array[] = new int[size];
        System.out.println("Enter the currency Denomination:");
        for(int i=0;i<size;i++){
            array[i] = s.nextInt();
        }
        System.out.println("Enter the amount you want to pay:");
        int amountPayable = s.nextInt();

        for(int i=0;i<size;i++){
            if(amountPayable >= array[i]){
                count[i] = amountPayable/array[i];
                amountPayable = amountPayable - count[i]*array[i];
            }
        }
        if(amountPayable>0){
            System.out.println("Amount can not be printed with the given Denomination");
        }

        else{
            System.out.println("Your payment approach in order to give min no of notes will be:");
            for(int j=0;j<size;j++){
                System.out.println(array[j] + " : " + count[j]);
            }
        }

    }
}
