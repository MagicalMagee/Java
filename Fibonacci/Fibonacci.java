
public class Fibonacci
{

    public static void main(String[] args)
    {
        for (int num = 0; num < 100; num++)
        {
            System.out.println(num + " " + fib(num));
        }
    }

    public static long fib(int num)
    {
        if (num == 0 )
        {
            return 0;  //base case
        }
        if (num == 1)
        {
            return 1;   //base case
        }     

        //Recursive
        return fib(num - 1) + fib(num - 2);

    }

}