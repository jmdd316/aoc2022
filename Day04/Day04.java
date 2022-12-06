import java.util.*;
import java.io.*;


public class Day04 {

    public static void part1() throws IOException {
        Scanner in = new Scanner(new File("sample.txt"));
        int count = 0;
        while(in.hasNext()){
            String line = in.nextLine();
            String[] sects = line.split(",");
            String[] sects1 = sects[0].split("-");
            String[] sects2 = sects1[0].split("-");

            int a = Integer.valueOf(sects1[0]); 
            int b = Integer.valueOf(sects1[1]);
            int c = Integer.valueOf(sects2[0]);
            int d = Integer.valueOf(sects2[1]);

            if(((a>= c) && (b <= d)) || ((c >= a) && (d <= b))){
                count++;
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