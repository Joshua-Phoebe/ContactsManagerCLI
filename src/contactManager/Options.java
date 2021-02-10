package contactManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Options {
    static void  userOptions() throws IOException {
        System.out.println("What would you like to do?");
        System.out.println("1. View Contacts \n2. Add a new contact?\n3. Search Contact by Name?" );
        System.out.println("4. Delete an existing contact? \n5. Exit the application? ");
        System.out.print("Enter an option (1, 2, 3, 4 or 5): ");

        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        if(response.equalsIgnoreCase("1")){
            //Display
            Print printFile = new Print();
            printFile.printUserFile();
        }else if(response.equalsIgnoreCase("2")){
            //AddUser
            AddUser addUser = new AddUser();
            addUser.addingUser();
        }else if(response.equalsIgnoreCase("3")){
            //Search USer
            UserSearch userSearch = new UserSearch();
            System.out.print("Enter search name : ");
            String searchName = input.nextLine();
            userSearch.searchFile(searchName);
        }else if(response.equalsIgnoreCase("4")) {
            //Delete User
            Delete deleteContactLine = new Delete();
            System.out.print("Enter contact to delete : ");
            String deleteContact = input.nextLine();
            deleteContactLine.removeContact(deleteContact);
        }else if(response.equalsIgnoreCase("5")){
            //Exit
            System.exit(0);
        }else{
            System.out.println("Please enter a valid response");
            userOptions();
        }


    }
}
