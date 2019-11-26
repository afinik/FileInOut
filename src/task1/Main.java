package task1;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class Main {
    
    public static void main(String[] args) {

        try(InputStream in = new FileInputStream("test.txt")){
            int x = 0;

            while ((x = in.read()) != -1) {
                System.out.println((byte) (x));
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
