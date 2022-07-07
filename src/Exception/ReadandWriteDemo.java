package Exception;

import java.io.FileNotFoundException;

public class ReadandWriteDemo {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            rw.saveFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

}
