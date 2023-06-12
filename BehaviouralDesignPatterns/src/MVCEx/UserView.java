package MVCEx;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class UserView {

   public void printUserInfo(String name, int age, String email, String address) {
       try {
           File topFile = new File ("top.html");

           Scanner myReader = new Scanner (topFile);

           File completeFile = new File ("view.html");

           FileWriter myWriter = new FileWriter (completeFile);

           while (myReader.hasNextLine ()) {
               myWriter.append (myReader.next ());
           }

           myReader.close ();
           myWriter.close ();

       } catch (Exception e) {
           throw new RuntimeException ("File not found");
       }

       try {
           File bottomFile = new File ("bottom.html");
           Scanner myReader = new Scanner (bottomFile);

           File completeFile = new File ("view.html");

           FileWriter myWriter = new FileWriter (completeFile);

           while (myReader.hasNextLine ()) {
               String nextLine = myReader.nextLine ();

               if (nextLine.contains ("name")) {
                   myReader.nextLine ().replace ("name", name);
               } else if (nextLine.contains ("age")) {

//                   myReader.nextLine ().replace ("age", age);
               }
           }
       } catch (Exception e){
           throw new RuntimeException ("File not found");
       }
   }
}
