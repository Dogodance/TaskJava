import java.io.PrintStream;
import java.util.Scanner;

public class Task6 {
        public static void main(String[] args)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            Scanner s = new Scanner(System.in);
            char a = s.next().charAt(0);
            ps.print(ctoa(a));
        }
        public static int ctoa(char a)
        {
            int r_a = (int) a;
            return r_a;
        }
}
