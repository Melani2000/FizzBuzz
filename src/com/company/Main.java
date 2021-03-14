package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 for exit the program");
        while (number!=0) {
            System.out.print("Number : ");
            number = scanner.nextInt();
            if (number == 0)
                break;
            if (number % 5 == 0 && number % 3 == 0)
                System.out.println("FizzBuzz");
            else if (number % 3 == 0)
                System.out.println("Buzz");
            else if (number % 5 == 0)
                System.out.println("Fizz");
            else
                System.out.println(number);
        }

    }
}
