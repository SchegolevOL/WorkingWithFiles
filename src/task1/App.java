package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        String path1 = in.nextLine();
        String path2 = in.nextLine();


        try (FileWriter writer = new FileWriter(path1, false)) {
            String text = "Hello Gold!\nhello world";
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter writer1 = new FileWriter(path2, false)) {
            String text = "Hello Gold2!";
            writer1.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("src/task1/text1.txt"))) {
            String s;

            while ((s = br.readLine()) != null) {

                str1.add(s);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println(str1);
        try (BufferedReader br = new BufferedReader(new FileReader("src/task1/text2.txt"))) {
            String s;

            while ((s = br.readLine()) != null) {

                str2.add(s);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println(str2);

        int lenght = str1.size() > str2.size() ? str1.size() : str2.size();
        for (int i = 0; i < lenght; i++) {
            if (str1.size() > i && str2.size() > i) {
                if (!str1.get(i).equalsIgnoreCase(str2.get(i))) {
                    System.out.println("String 1 : " + (i + 1) + " - " + str1.get(i));
                    System.out.println("String 2 : " + (i + 1) + " - " + str2.get(i));
                }
            } else if (str1.size() > i) {
                System.out.println("String 1 : " + (i + 1) + " - " + str1.get(i));
            } else if (str2.size() > i) {
                System.out.println("String 2 : " + (i + 1) + " - " + str2.get(i));
            }
        }


    }


}
