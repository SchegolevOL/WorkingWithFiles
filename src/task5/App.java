package task5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Corporation corporation = new Corporation();
        /*corporation = FakeDate.date();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/task5/corporation.dat")))
        {

            oos.writeObject(corporation);
            System.out.println("File has been written");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }*/

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/task5/corporation.dat")))
        {

            corporation=(Corporation) ois.readObject();

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        System.out.println(corporation.getEmployees());

    }
}
