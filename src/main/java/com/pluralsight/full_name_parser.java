package com.pluralsight;

import java.util.Scanner;

public class full_name_parser {
    public static void main(String[] args) {
        Scanner dataCatcher = new Scanner(System.in);

        System.out.println("what is your full name? \nprovide first middle and last name \nif no middle name write none: ");
        String fullName = dataCatcher.nextLine();

        String[] nameSplit = fullName.trim().split(" ");
        int number_of_items = nameSplit.length;

        if(number_of_items < 3) {
            System.out.println("First name: " + nameSplit[0]);
            System.out.println("Middle name: (none) ");
            System.out.println("Last name: " + nameSplit[1]);
        } else{
            System.out.println("First name: " + nameSplit[0]);
            System.out.println("Middle name: " + nameSplit[1]);
            System.out.println("Last name: " + nameSplit[2]);
        }

    }
}
