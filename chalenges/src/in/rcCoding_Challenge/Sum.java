package in.rcCoding_Challenge;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("in.rcCoding_Challenge.Welcome to our Calculator");
        System.out.println ("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.println ("Now, please enter the second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println ("in.rcCoding_Challenge.Sum of your numbers is: ");

    }
}
