import java.io.PrintStream;
import java.util.Scanner;

public class Task5 {
        public static void main(String[] args)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            operation(a, b, N);
        }
        public static void operation(int a, int b, int c)
                throws java.io.UnsupportedEncodingException
        {
            PrintStream ps = new PrintStream(System.out, true, "UTF-8");
            if (a+b == c)
                ps.println("Сложение");
            else if (a-b == c)
                ps.println("вычитание");
            else if (a*b == c)
                ps.println("умножение");
            else if (a/b == c)
                ps.println("Деление");
            else
                ps.println("NONE");
        }
}
