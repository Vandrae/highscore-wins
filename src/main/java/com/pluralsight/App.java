package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ask user for a score in the format Home:Visitor|21:9
        System.out.print("Enter the score in this format 'Home:Visitor|21:9' : ");
        String userInput = input.nextLine();

        // Split the string into each part ex: home , visitor, 21, 9
        //how do i split a string?
        //what am i splitting on? a space,comma or semi colin etc.
        System.out.println("------------------First Split------------------");
        // Splits score at the | first part is  left side of pipe second part is right side
        // tested with
        //System.out.println( "the first part is " + teamScore[0] );
        //System.out.println( "the second part is " + teamScore[1] );
        String[] teamScore = userInput.split("\\|");
        System.out.println( "the first part is " + teamScore[0] );
        System.out.println( "the second part is " + teamScore[1] );

        System.out.println("------------------Team Split------------------");

        //splits the first part of the teamScore split at the ":"
        String[] team = teamScore[0].split(":");
        System.out.println( "the first part is " + team[0] );
        System.out.println( "the second part is " + team[1] );

        System.out.println("------------------Score Split------------------");

        //splits the second part of the teamScore split at the ":"
        String[] score = teamScore[1].split(":");
        System.out.println( "the first part is " + score[0] );
        System.out.println( "the second part is " + score[1] );




    }
}
