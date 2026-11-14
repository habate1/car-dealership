package com.pluralsight;

import java.util.Scanner;

public class Program {
    /*
    Create the Program class with a main() method.
    In main():
    Use your UI class to display the UserInterface.
    End of Phase Check: When you run Program, your app should start and display the menu loop
     */
    public static void main(String[] args) {
        new UserInterface().display();
        Scanner myscanner = new Scanner(System.in);
        int input = myscanner.nextInt();
    }
}
