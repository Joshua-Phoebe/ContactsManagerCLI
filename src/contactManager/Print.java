package contactManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Print {
    public void printUserFile() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("contacts.txt"));
        while(scan.hasNext()) {
            String line = scan.nextLine().toString();
                System.out.println(line);
        }
    }
}
