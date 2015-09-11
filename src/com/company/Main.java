package com.company;
import java.util.Scanner;
//Written By Tom Buckle
//Week 1- Eulids Algorithm
//Version 1.0
public class Main {

    static int input1;
    static int input2;
    static int difference;
    static int smallest;
    static int largest;

    public static void getInput() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        input1 = kboard.nextInt();
        System.out.println("Please enter another whole number: ");
        input2 = kboard.nextInt();
        System.out.println("You chose " + input1 + " and " + input2);
    }
    public static void evaluate(int x,int y){

        if(x > y){ // x is greater than y
            largest = x;
            smallest = y;

        }else if (x < y){ // x is less than y
            largest = y;
            smallest = x;


        }else { // x must be equal to y

            foundAnswer();
        }
        
    } //Evaluates the two numbers and decides which is the smallest or if they are equal to eachother

    public static void findDifference (int x, int y){
        difference = Math.abs(x-y);
    }//Finds the difference between both numbers submitted by the user.

    public static void replaceNumbers(){
        input1 = smallest;
        input2 = difference;

    }

    public static void foundAnswer(){
        System.out.println("Answer Found!");
        System.out.println(input1 + " is the largest common denominator");
        System.exit(0);
    }
//Start of Main program
    public static void main(String[] args) {
	    int x = 1;
        int counter = 1;
        getInput();
        System.out.println("input received");
        while (x == 1){
            if(counter > 999999){
                System.out.println("Fatal error!! Exiting before system crash");
                System.exit(-1);
            }
            System.out.println("Currently on pass "+ counter);
            evaluate(input1,input2);
            findDifference(input1,input2);
            replaceNumbers();
            counter++;

        }
    }
}
