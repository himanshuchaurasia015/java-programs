import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class FileExampe {
    public static void main(String[] args) {
        try {
            File d = new File("ab.txt");
            FileWriter write = new FileWriter("ab.text", true);
            Scanner sc = new Scanner(d);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
