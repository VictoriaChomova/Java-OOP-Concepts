package StudentsAdapter;


public class FileAdapter implements FileOpener {


    public FileAdapter(String fileType) {
        if (fileType.endsWith ("txt")) {

        }
    }

    public String open(String filename, String fileType) {
        StringBuilder text = new StringBuilder ();

        String txt = AdvancedFileOpener
    }
}
