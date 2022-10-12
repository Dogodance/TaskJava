import java.io.PrintStream;
import java.util.Scanner;

public class Task8 {
        public static void main(String[] args)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            Scanner s = new Scanner(System.in);
            int first_side = s.nextInt();
            int second_side = s.nextInt();
            ps.print("Максимальное значение третьего ребра = " + nextEdge(first_side, second_side));
        }
        public static int nextEdge(int a, int b) {
            int c = a+b-1;
            return c;
        }
}
