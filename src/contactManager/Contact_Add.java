package contactManager;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Contact_Add {

    public static void main(String[] args) {
        //Update Contact Hashmap using user Input
        String userInput;
        String name;
        String phone;
        int contactsAdded = 0;
        boolean valid = true;

        try (Scanner scnr = new Scanner(System.in)) {
            do {
                System.out.println("Enter a name: ");
                name = scnr.nextLine();

                System.out.println("Enter the number for " + (name));
                phone = scnr.nextLine();

                // change made here
                contactInfo.put(name, phone);

                System.out.println("Would you like to enter another? (y/n) ");

                contactsAdded++;

                // here as well coz scanner was skipping the input
            } while (scnr.nextLine().equalsIgnoreCase("y"));

        }
    }
}
