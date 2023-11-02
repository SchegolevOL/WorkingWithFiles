package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/task3/arrays.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                str.add(s);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println(str);

        for (String s:
             str) {
            String[] tmp = s.split(" ");
            ArrayList<Integer>row = new ArrayList<>();
            for (String item:
                 tmp) {
                row.add(Integer.parseInt(item));

            }
            matrix.add(row);
        }
        System.out.println(matrix);
        ArrayList<Integer>maxElements=new ArrayList<>();
        ArrayList<Integer>minElements=new ArrayList<>();
        ArrayList<Integer>sumElements=new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            int max = matrix.get(i).get(0);
            int min = matrix.get(i).get(0);
            int sum = matrix.get(i).get(0);
            for (int j = 1; j < matrix.get(i).size(); j++) {
                sum+=matrix.get(i).get(j);
                if (max<matrix.get(i).get(j)){
                    max=matrix.get(i).get(j);
                }
                if (min>matrix.get(i).get(j)){
                    min=matrix.get(i).get(j);
                }
            }
            maxElements.add(max);
            minElements.add(min);
            sumElements.add(sum);
        }
        System.out.println(maxElements);
        System.out.println(minElements);
        System.out.println(sumElements);
    }
}
