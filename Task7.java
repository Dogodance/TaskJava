import java.io.PrintStream;
import java.util.Scanner;

public class Task7 {
        public static void main(String[] args)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            ps.print(ctoa(a));
        }
        public static int ctoa(int a) {
            int sum = 0;
            for (int i = a; i > 0; i--)
                sum += i;
            return sum;
        }
}
