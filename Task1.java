import java.io.PrintStream;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
            throws java.io.UnsupportedEncodingException
    {
        PrintStream ps = new PrintStream(System.out, true, "UTF-8");
        Scanner s = new Scanner(System.in);
        int first_number = s.nextInt();
        int second_number = s.nextInt();
        ps.print("Остаток от числа= " + remainder(first_number, second_number));
    }
    public static int remainder(int a, int b) {
        int c = a%b;
        return c;
    }
}
