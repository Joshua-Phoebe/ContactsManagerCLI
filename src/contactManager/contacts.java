package contactManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class contacts extends Contact_Add {

    public static void main(String[] args) {
        Path contacts = Paths.get("contacts.txt");

        HashMap<String, String> contactInfo = new HashMap<String, String>();

        contactInfo.put("Phoebe N ", "234-5678");
        contactInfo.put("Joshua T ", "345-8976");
        contactInfo.put("Casey F ", "237-7897");


        File contactFile = new File(String.valueOf(contacts));

        BufferedWriter bf = null;


        try {
            //create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(contactFile));

            //iterate map entries
            for (Map.Entry<String, String> entry : contactInfo.entrySet()) {
                //put key and value separated by a colon
                bf.write(entry.getKey() + " : " + entry.getValue());

                //new line
                bf.newLine();
            }

            bf.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                //always close the writer
                bf.close();
            } catch (Exception e) {
            }
        }
    }
}
