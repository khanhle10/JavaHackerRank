import java.io.*;
import java.util.*;
/*
  a + 2^n b
  0 <= t <= 500
  0 <= a,b <= 50
  1 <= n <= 15
*/
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int pow = 1;
            int sum = a;
            // a + 1^0 * b , a + 1^1 * b ... a+ 1^n * b
            for(int j = 0; j < n; j++){
                sum = sum + (pow << j)*b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
