import java.io.PrintStream;
import java.util.Scanner;

public class Task3 {
        public static void main(String[] args)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            Scanner s = new Scanner(System.in);
            int chiken = s.nextInt();
            int cows = s.nextInt();
            int pigs = s.nextInt();
            ps.print("колличество ног = " + animals(chiken, cows, pigs));
        }
        public static int animals(int a, int b, int c) {
            int kol = (a*2) + (b*4) + (c*4);
            return kol;
        }
}
