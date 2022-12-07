import java.util.*;
import java.io.*;


public class Day06 {

    public static void part1() throws IOException {
        Scanner in = new Scanner(new File("sample.txt"));
        int count = 0;
        String line = in.nextLine();
        
        for(int i = 0; i < line.length(); i++){
           
            for(int j=i+1; j< line.length();j++){
               
               
                if (line.charAt(i) == line.charAt(j)){
                    count = 0;
                }
            }

            }
            System.out.println(count);
        }
     

    public static void part2() throws IOException {

    }

    public static void main(String...args) {
        try {
            part1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}