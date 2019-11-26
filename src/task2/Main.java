package task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class Main {

    public static ArrayList<Character> s = new ArrayList<>();

    public static void readFromFile(String fileName){
        try(InputStream in = new FileInputStream(fileName)){
            int x = 0;
            while((x = in.read()) != -1){
                s.add((char)x);
            }

            int i = 0;
            for (int j = 0; j < s.size(); j++){
                System.out.print(s.get(j));
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void writeIntoFile(String fileName){
        try()
    }

    public static void main(String[] args) {
        readFromFile("test.txt");
        readFromFile("test2.txt");
        readFromFile("test3.txt");
    }

}
