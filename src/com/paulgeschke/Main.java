package com.paulgeschke;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Menu");
            System.out.println("1. Coca-Cola");
            System.out.println("2. Pepsi");
            System.out.println("3. RC Cola");
            System.out.println("4. Lemonade");
            System.out.println("5. Water");
            System.out.println("6. Exit");
            number = input.nextInt();
            if (number < 1 || number > 6) {
                System.out.println("Please enter a valid number:");
            }
        }while(number != 1 && number != 2 && number != 3 && number != 4 && number != 5 && number != 6);
        switch (number) {
            case 1:
                System.out.println("1. Coca-Cola");
                break;
            case 2:
                System.out.println("2. Pepsi");
                break;
            case 3:
                System.out.println("3. RC Cola");
                break;
            case 4:
                System.out.println("4. Lemonade");
                break;
            case 5:
                System.out.println("5. Water");
                break;
            case 6:
                System.out.println("Exiting...");
        }
        System.out.println("Please come again!");
    }
}
