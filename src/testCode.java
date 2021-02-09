//
//
//import java.io.*;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class testCode {
//    public static void main(String[] args) throws IOException {
//        Path contacts = Paths.get("contacts.txt");
//
//        HashMap<String, String> contactInfo = new HashMap<String, String>();
//
////   Update Contact Hashmap using user Input
////        String userInput;
////        String name;
////        String phone;
////        int contactsAdded = 0;
////        boolean valid = true;
////
////        try (Scanner scnr = new Scanner(System.in)) {
////            do {
////                System.out.println("Enter a name: ");
////                name = scnr.nextLine();
////
////                System.out.println("Enter the number for " + (name));
////                phone = scnr.nextLine();
////
////                // change made here
////                contactInfo.put(name, phone);
////
////                System.out.println("Would you like to enter another? (y/n) ");
////
////                contactsAdded++;
////
////
////            } while (scnr.nextLine().equalsIgnoreCase("y"));
////
////        }
//
////  Files.write(contactPath, (Iterable<? extends CharSequence>) contactNames);
//        File contactFile = new File(String.valueOf(contacts));
//
//        FileWriter fw = null;
//        BufferedWriter bf = null;
//        PrintWriter pw =null;
//
//        try {
//
//            //create new BufferedWriter for the output file
//            fw = new FileWriter(contactFile, true);
//            bf = new BufferedWriter(fw);
//            pw  = new PrintWriter(bf);
//
//            //iterate map entries
//            for (Map.Entry<String, String> entry : contactInfo.entrySet()) {
//                //put key and value separated by a colon
//                pw.write(entry.getKey() + " : " + entry.getValue());
//
//                //new line
//                bf.newLine();
//            }
//
//            bf.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//
//            try {
//                //always close the writer
//                pw.close();
//                bf.close();
//                fw.close();
//            } catch (Exception e) {
//            }
//        }
//
//        //Add User
//        AddUser addUser = new AddUser();
//        //Searching for user
//        UserSearch userSearch = new UserSearch();
//        System.out.print("Enter search name : ");
//        Scanner input = new Scanner(System.in);
//        String searchName = input.nextLine();
//        userSearch.searchFile(searchName);
//    }
//
//}
//
