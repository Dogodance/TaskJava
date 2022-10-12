import java.io.PrintStream;
import java.util.Scanner;

public class Task9 {
        public static void main(String[] args)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            int[] num = new int[3];
            ps.print(ctoa(num));
        }
        public static int ctoa(int[] a)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            Scanner s = new Scanner(System.in);
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                a[i] = s.nextInt();
                sum += Math.pow(a[i], 3);
            }
            return sum;
        }
}
