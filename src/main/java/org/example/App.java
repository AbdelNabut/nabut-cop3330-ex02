package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String givenWord = "";
        while(givenWord.isEmpty()) {
            System.out.print( "What is the input string?");
            givenWord = input.next();
            if(givenWord.isEmpty()) // Couldn't get the challenge working.
                // For some reason newlines and spaces arent registering in the program.
                System.out.printf("You must enter something into the program.");
            else
                System.out.printf("%s has %d characters", givenWord, givenWord.length());
        }


    }
}
