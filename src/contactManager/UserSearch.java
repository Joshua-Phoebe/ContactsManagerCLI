package contactManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class UserSearch {

    public void searchFile(String searchStr) throws IOException {
        Scanner scan = new Scanner(new File("contacts.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains(searchStr)){
                System.out.println(line);
            }else if(!scan.hasNext()){
                System.out.println("User does not exist, would you like to add user (y/n) ? ");
                 Scanner input = new Scanner(System.in);
                 String response = input.nextLine();
                 if(response.equalsIgnoreCase("y")){
                     AddUser addUser = new AddUser();
                     addUser.addingUser();
                 }

            }
        }
    }
}
