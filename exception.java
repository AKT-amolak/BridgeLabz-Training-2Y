import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception {
    static void method1() {
        try{
            FileReader fileReader=new FileReader("C:\\Users\\Amolak\\Documents\\abc.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("not found ");
        }
    }
    public static void main(String[] args) {
        method1();
    }
}