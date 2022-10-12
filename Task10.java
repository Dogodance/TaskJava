import java.io.PrintStream;
import java.util.Scanner;

public class Task10 {
        public static void main(String[] args)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            ps.print(abcmath(a, b, c));
        }
        public static boolean abcmath(int a, int b, int c)
        {
            for (int i = 0; i < b; i++)
                a += a;
            if (a%c == 0)
                return true;
            return false;
        }
}
