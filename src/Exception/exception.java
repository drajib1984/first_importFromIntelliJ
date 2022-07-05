package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;
import java.util.OptionalDouble;

import static jdk.internal.org.jline.utils.Colors.s;

public class exception {

    public static void test(Optional<String>s){
        System.out.println(s.orElse("empty").toLowerCase());
    }

    public static void main(String[] args) throws FileNotFoundException {
        int a = 10;
        int b = 0;
      //  System.out.println(a/b);
       try {
           System.out.println(a/b);
       }
       catch (Exception ex){
           System.out.println("Sorry, cannot be divided by zero");
           System.out.println(ex.getMessage());
           //ex.printStackTrace();
       }
       try {
           File file = new File("1.txt");
           FileReader reader = new FileReader(file);
           reader.read();
       }
       catch (Exception e){
           System.out.println("file not found");
           System.out.println(e);
       }


    }
}
