package contactManager;

import java.io.*;
import java.nio.file.Files;
import java.util.*;



    public static void main(String[] args) {


        Options presentOptions = new Options();
        presentOptions.userOptions();
        //Add User
//        AddUser addUser = new AddUser();
//        addUser.addingUser();
        //Searching for user
//        UserSearch userSearch = new UserSearch();
//        System.out.print("Enter search name : ");
//        Scanner input = new Scanner(System.in);
//        String searchName = input.nextLine();
//       userSearch.searchFile(searchName);
//        removeContact("Jack");


    }
//    public static void removeContact(String lineContent) throws IOException
//    {
//        File file = new File("contacts.txt");
//        File temp = new File("_temp_");
//        PrintWriter out = new PrintWriter(new FileWriter(temp));
//        Files.lines(file.toPath())
//                .filter(line -> !line.contains(lineContent))
//                .forEach(out::println);
//        out.flush();
//        out.close();
//        temp.renameTo(file);
//
//
//    }


}
