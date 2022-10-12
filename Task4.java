import java.io.PrintStream;
import java.util.Scanner;
public class Task4 {
        public static void main(String[] args)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            Scanner s = new Scanner(System.in);
            double prob = s.nextDouble();
            double prize = s.nextDouble();
            double pay = s.nextDouble();
            if (profitable(prob, prize, pay) == true)
                ps.print("Правда");
            else
                ps.print("Лож");
        }
        public static boolean profitable(double a, double b, double c) {
            if (a*b > c)
                return true;
            return false;
        }
}
