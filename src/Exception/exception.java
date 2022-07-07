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

    public static void test1(int a,int b, int[]arr){
        try {
            System.out.println(a/b);
            System.out.println(arr[1]);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound");
        }
        catch (Exception e){
            System.out.println("Rest all other exceptions");
        }
        finally {
            try{
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

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
           ex.printStackTrace(); // most commonly used to find out the details of exception
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
