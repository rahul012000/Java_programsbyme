package in.rcCoding_Challenge;

import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        System.out.println ("Please enter your name: ");
        Scanner input = new Scanner (System.in);
        String name = input.nextLine ();
        System.out.println ("in.rcCoding_Challenge.Welcome" + name + "R java");
    }
}
