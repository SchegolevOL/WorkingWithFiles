package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();


        Scanner in = new Scanner(System.in);
        System.out.print("Enter path : ");
        String path = in.nextLine();

        try (FileWriter writer = new FileWriter(path, false)) {
            String text = "Hello Gold!\nhello world";
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;

            while ((s = br.readLine()) != null) {

                str.add(s);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println(str);


        int lenght = 0;
        String strMaxLenght="";
        for (String s:
             str) {
            if (s.length()>lenght){
                lenght=s.length();
                strMaxLenght=s;
            }
        }
        System.out.println("String max :"+ strMaxLenght +"\n Lenght : "+lenght);
    }
}
