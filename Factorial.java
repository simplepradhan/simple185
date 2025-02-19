public class Factorial{
    public static void main(String[]args)
    {
        int num = 10 ,i= 1;
        long Factorial= 1;
        while(i<=num)
        {
            Factorial *= i;
            i++;

        }
    System.out.println("Factorial of %d =%%d", num , Factorial);
    }
}