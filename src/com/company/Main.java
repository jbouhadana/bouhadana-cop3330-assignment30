/*
 *  UCF COP3330 Summer 2021 Assignment 30 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;

public class Main {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 12; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}

