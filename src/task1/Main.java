package task1;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Character> s = new ArrayList<>();
    public static void main(String[] args) {
        try(InputStream in = new FileInputStream("test.txt")){
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
}
