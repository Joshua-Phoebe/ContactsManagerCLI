
package contactManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class UserSearch {

    public void searchFile(String searchStr) throws IOException {

        Scanner input = new Scanner(new File("contacts.txt"));
        String search = input.nextLine().toLowerCase();

        if(input.hasNext()){
            while (input.hasNext()) {
                 search = input.nextLine().toLowerCase();
                if (search.contains(searchStr.toLowerCase())) {
                    System.out.println(search);}
//            }else{
//                System.out.println("User does not exist, would you like to add user (y/n)? ");
//            }
            }
        }


//        while (input.hasNext()) {
//            String search = input.nextLine().toLowerCase();
////            System.out.println(search);
//            if (search.contains(searchStr)) {
//                System.out.println(search);}
////            }else{
////                System.out.println("User does not exist, would you like to add user (y/n)? ");
////            }
//        }
//        Scanner scan = new Scanner(new File("contacts.txt"));
//
//        while(scan.hasNext()){
//            String line = scan.nextLine().toLowerCase().toString();
//            System.out.println(line);
//            if(line.contains(searchStr)){
//                System.out.println(line);
//            }else if(!line.contains(searchStr)){
//                System.out.println("User does not exist, would you like to add user (y/n)? ");
////                Scanner input = new Scanner(System.in);
//                String response = input.nextLine();
//                if(response.equalsIgnoreCase("y")){
//                    AddUser addUser = new AddUser();
//                    addUser.addingUser();
//                }
//
//            }
//        }
        }
}