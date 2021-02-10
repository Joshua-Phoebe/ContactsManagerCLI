package contactManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class Delete {
    public void removeContact(String lineContent) throws IOException
    {

        File file = new File("contacts.txt");
        File temp = new File("_temp_");
        PrintWriter out = new PrintWriter(new FileWriter(temp));
        Files.lines(file.toPath())
                .filter(line  -> !line.contains(lineContent))
                .forEach(out::println);
        out.flush();
        out.close();
        temp.renameTo(file);

        Print printFile = new Print();
        printFile.printUserFile();
    }
}
