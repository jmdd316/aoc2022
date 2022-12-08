import java.util.*;
import java.io.*;


public class Day06 {

    public static void part1() throws IOException {
        Scanner in = new Scanner(new File("sample.txt"));
        int count = 0;
        String line = in.nextLine();
        
        outerLoop:
        for(int i = 0; i < line.length()-3; i++){
            String fourWeAreChecking = line.substring(i,i+4);
            char[] chars = fourWeAreChecking.toCharArray();
            for(int p = 0; p <chars.length; p++){
                for(int q = p+1; q < chars.length; q++){
                    if(chars[p] == chars[q]){
                        continue outerLoop;
                    }
                }
            }
            System.out.println(i+4);
            break;
         }
         
            
        }
     

    public static void part2() throws IOException {
        Scanner in = new Scanner(new File("sample.txt"));
        int count = 0;
        String line = in.nextLine();
        
        outerLoop:
        for(int i = 0; i < line.length()-3; i++){
            String fourWeAreChecking = line.substring(i,i+4);
            char[] chars = fourWeAreChecking.toCharArray();
            for(int p = 0; p <chars.length; p++){
                for(int q = p+1; q < chars.length; q++){
                    if(chars[p] == chars[q]){
                        continue outerLoop;
                    }
                }
            }
            System.out.println(i+4);
            break;
         }
         
            
        }

    

    public static void main(String...args) {
        try {
            part1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}