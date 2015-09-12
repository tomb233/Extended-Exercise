package com.company;
import java.util.Scanner;
//Written By Tom Buckle
//Week 1- Eulids Algorithm
//Version 1
public class Main {
    static int counter = 1;
    static int input1;
    static int input2;


    public static void getInput() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        input1 = kboard.nextInt();
        System.out.println("Please enter another whole number: ");
        input2 = kboard.nextInt();
        System.out.println("You chose " + input1 + " and " + input2);
    }


    public static void foundAnswer(){
        System.out.println("Answer Found!");
        System.out.println(input1 + " is the largest common denominator");
        System.exit(0);
    }





    static int gcd(int x, int y)
    {
        while(x!=0 && y!=0)
        {
            int z = y;
            y = x%y;
            x = z;
        }
        return x+y;
    }

    public static void test(){

        int passRate = 0;
        int totalTests = 0;
        int percentageCorrect = 0;

        System.out.println("Argument --test found. Initiating test...");
        System.out.println("Test Begining...");

        int[] array1 = {12,49,252,24,462};
        int[] array2 = {8,21,105,60,1071};
        int[] array3 = {4,7,21,12,21};
        int answer = 0;
        for (int x = 0;x<5;x++){

            input1 = array1[x];
            input2 = array2[x];


            answer = gcd(input1,input2);


            System.out.println("Test "+(x+1)+": gcd("+array1[x]+", "+array2[x]+") = " + answer);
            if(answer == array3[x]){
                passRate = passRate + 1;
            }
        }

        System.out.println("Passed "+passRate+" out of "+totalTests+" tests. Score = "+percentageCorrect+"%.");

    }
//Start of Main program
    public static void main(String[] args) {



        if(args.length > 0){
            if("--test".equals(args[0])){
                test();

            }

        }else{
            int x = 1;

            getInput();
            input1 = gcd(input1,input2);
            foundAnswer();

            }
        }


    }

