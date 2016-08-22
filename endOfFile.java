import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
  input a string line and add number line beginning of the line.
*/
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNext()){
          String line = sc.nextLine();
          count++;
          System.out.println(Integer.toString(count)  + " " + line);
        }

    }
}
