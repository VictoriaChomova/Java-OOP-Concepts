package StudentsAdapter;

import java.io.File;
import java.util.Scanner;

public class TXTOpener implements AdvancedFileOpener {

    @Override
    public String openTXT(String filename) {

        StringBuilder text = new StringBuilder ();

        try {
            File myObj = new File (filename);
            Scanner myReader = new Scanner (myObj);


            while (myReader.hasNextLine ()) {
                text.append (myReader.nextLine ());
            }

            myReader.close ();

        } catch (Exception e) {
            throw new RuntimeException ();
        }

        return text.toString ();

    }
}
