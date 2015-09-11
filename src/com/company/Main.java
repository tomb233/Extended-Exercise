package com.company;
import java.util.Scanner;
//Written By Tom Buckle
//Week 1- Eulids Algorithm
//Version 1
public class Main {
    static int counter = 1;
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

    public static int replaceNumbers(){
        input1 = smallest;
        input2 = difference;
        return difference;
    }

    public static void foundAnswer(){
        System.out.println("Answer Found!");
        System.out.println(input1 + " is the largest common denominator");
        System.exit(0);
    }

    public static void counter(){

        if(counter > 999999){
            System.out.println("Fatal error!! Exiting before system crash");
            System.exit(-1);
        }
    }

    public static int gcd(int i1,int i2) {
        evaluate(i1,i2);
        findDifference(i1,i2);
        int x = replaceNumbers();
        return x;
    }
//Start of Main program
    public static void main(String[] args) {
	               int x = 1;

            getInput();

            while (x == 1){
                counter();
                System.out.println("Currently on pass "+ counter);
               int y = gcd(input1,input2);
                System.out.println("Largest common denominator currently is "+ y);
                counter++;

        }
    }
}
