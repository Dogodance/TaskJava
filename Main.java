public class Main {
    public static void main(String[] args) {
        testTask();
    }

    public static void testTask()
    {
        System.out.println(remainder(1,3) == 1 ? "remainder(1,3) "  + 1 : "Error remainder");
        System.out.println(remainder(3,4) == 3 ? "remainder(3,4) " + 3 : "Error remainder");

        System.out.println(triArea(3,2) == 3 ? "triArea(3,2) "  + 3 : "Error triArea");
        System.out.println(triArea(7,4) == 14 ? "triArea(7,4) "  + 14 : "Error triArea");

        System.out.println(animals(2,3,5) == 36 ? "animals(2,3,5) "  + 36 : "Error animals");
        System.out.println(animals(1,2,3) == 22 ? "animals(1,2,3) "  + 22 : "Error animals");

        System.out.println(profitableGamble(0.2, 50, 9) == true ? "profitableGamble(0.2, 50, 9) "  + true : "Error profitableGamble");
        System.out.println(profitableGamble(0.9, 1,2) == false ? "profitableGamble(0.2, 50, 9) "  + false : "Error profitableGamble");

        System.out.println(operation(24, 15, 9) == "added" ? "operation(24, 15, 9) "  + "added" : "Error operation");
        System.out.println(operation(24,26,2) == "substracted" ? "operation(24,26,2) "  + "substracted" : "Error operation");

        System.out.println(ctoa('A') == 65 ? "ctoa('A') "  + 65 : "Error ctoa");
        System.out.println(ctoa('m') == 109? "ctoa('m') "  + 109 : "Error ctoa");

        System.out.println(addUpTo(3) == 6 ? "addUpTo(3) "  + 6 : "Error addUpTo");
        System.out.println(addUpTo(10) == 55 ? "addUpTo(10) "  + 55 : "Error addUpTo");

        System.out.println(nextEdge(8, 10) == 17 ? "nextEdge(8, 10) "  + 17 : "Error nextEdge");
        System.out.println(nextEdge(5, 7) == 11 ? "nextEdge(5, 7) "  + 11 : "Error nextEdge");

        System.out.println(sumOfCubes(new int[]{1, 5, 9}) == 855 ? "sumOfCubes([1,5,9] "  + 855 : "Error sumOfCubes");
        System.out.println(sumOfCubes(new int[]{3,4,5}) == 216 ? "sumOfCubes([3,4,5]) "  +216 : "Error sumOfCubes");

        System.out.println(abcmath(42, 5, 10) == false ? "abcmath(42, 5, 10) "  + false : "Error abcmath");
        System.out.println(abcmath(5,2,1) == true ? "abcmath(5,2,1) "  + true : "Error abcmath");
}
    public static int remainder(int a, int b)
    {return  a % b;}

    public static double triArea(float a, float b)
    {
        return a * b / 2.0;
    }

    public static int animals(int chicken, int cows, int pigs)
    {
        return chicken * 2 + cows * 4 + pigs * 4;
    }

    public static boolean profitableGamble(double prob, int prize, int pay)
    {
        return prob * prize > pay;
    }

    public static String operation(int N, int a, int b)
    {
            if(a+b == N)
                return "added";
            else if (a-b == N)
                return "substracted";
            else if (a/b == N)
                return "division";
            else if (a*b == N)
                return "multiply";
            else
                return "none";
    }

    public static int ctoa(char a)
    { return a;}

    public static int addUpTo(int a)
    {
        if (a == 0) return 0;
        else return addUpTo(a - 1) + a;
    }

    public static int nextEdge(int a, int b)
    {
        return a + b - 1; // по тореме о сумме двух сторон треугольника против третьей.
    }

    public static int sumOfCubes(int[] mass)
    {
        int s = 0;
        for (int i = 0; i < mass.length; i++)
            s = s + mass[i] * mass[i] * mass[i];
        return s;
    }

    public static boolean abcmath(int a, int b, int c)
    {
        int s = 0;
        for (int i = 0; i < b; i++)
            s += b;
        if (s % c == 0)
            return true;
        else return false;
    }
}
