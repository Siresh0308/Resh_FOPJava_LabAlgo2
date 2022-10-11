package com.greatlearning.driver;

import java.util.Scanner;

public class Transaction {
    public  static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int noOfTrans;
        System.out.println("Enter the number of transaction in an array");
        noOfTrans = sc.nextInt();
        int [] transArray = new int [noOfTrans];
        System.out.println("Enter the transaction");
        for(int i=0 ; i<noOfTrans;i++){
            transArray[i]=sc.nextInt();

        }
        System.out.println("What is the target needed to be achieved");
        int target = sc.nextInt();
        int checkVar=0;
        int idx =1;
        boolean checkCond = false;

            for (int i =0;i< noOfTrans;){
                checkVar += transArray[i];
                 idx += i;
                if(checkVar < target) {
                    checkCond = true;
                    break;
                }
            }
            if(checkCond == true){
              System.out .println("Target is achieved after " +idx  +" transaction");
            }
            else{System.out.println("Target is not achieved");
            }

    }

}
