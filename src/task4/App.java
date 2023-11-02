package task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter path : ");
        String path = in.nextLine();
        System.out.print("Enter array (1 2 8 9): ");
        String str = in.nextLine();
        String[] arr = str.split(" ");
        ArrayList<Integer> arrInt=new ArrayList<>();
        for (String item:
                arr) {
            arrInt.add(Integer.parseInt(item));
        }
        arr=null;
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();

        for (int item:
             arrInt) {
            if(item%2==0){
                even.add(item);
            }else {
                odd.add(item);
            }
        }
        ArrayList<Integer>inverted = (ArrayList<Integer>) arrInt.clone();

        Collections.reverse(inverted);
        System.out.println(arrInt);
        System.out.println(even);
        System.out.println(odd);
        System.out.println(inverted);
        System.out.println(arrayToString(arrInt));

        try (FileWriter writer = new FileWriter("src/task4/arrays.txt", false)) {
            writer.write(arrayToString(arrInt));
            writer.write(arrayToString(even));
            writer.write(arrayToString(odd));
            writer.write(arrayToString(inverted));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    public static String arrayToString(List<Integer> arr){
        StringBuilder str = new StringBuilder();
        for (int item:
             arr) {
            str.append(item+" ");
        }
        str.deleteCharAt(str.length() - 1);
        str.append("\n");
        return str.toString();
    }
}
