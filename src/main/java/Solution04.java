/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/*  PSEUDOCODE
 *  Prompt for noun
 *  Read for noun
 *  Prompt for verb
 *  Read for verb
 *  Prompt for adjective
 *  Read for adjective
 *  Prompt for adverb
 *  Read for adverb
 *  Print mad lib string using the supplied strings
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args){
        String noun, verb, adjective, adverb;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective = scanner.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = scanner.nextLine();
        System.out.print("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!");
    }
}
