package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
//TODO почему-то пишется 3 раза

public class Main {

    public static LinkedList<Character> s = new LinkedList<>();
    private static String strong;

    public static void readFromFile(String fileName){
        strong = "";

        try(InputStream in = new FileInputStream(fileName)){
            int x = 0;
            while((x = in.read()) != -1){
                s.add((char)x);
            }

            int i = 0;
            for (int j = 0; j < s.size(); j++){
                writeIntoFile("all.txt", s.get(j));
                System.out.print(s.get(j));
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void writeIntoFile(String fileNameToRecord, Character s){
        try(OutputStream out = new FileOutputStream(fileNameToRecord, true)) {
            int i = 0;
            out.write(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFromFile("test.txt");
        readFromFile("test2.txt");
        readFromFile("test3.txt");
        readFromFile("test4.txt");
        readFromFile("test5.txt");
/*        writeIntoFile("all.txt", "test.txt");
        writeIntoFile("all.txt", "test2.txt");
        writeIntoFile("all.txt", "test3.txt");
        writeIntoFile("all.txt", "test4.txt");
        writeIntoFile("all.txt", "test5.txt");*/
    }

}
