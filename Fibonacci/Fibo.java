
public class Fibo
{

    public static void main(String[] args)
    {
        for (int num = 0; num <= 100; num++)
        {
            System.out.println(num + " "+ fib(num));

        }
    }
    
    public static long fib(int num)
    {   
        if (num == 0 )
        {
            return 0;  //base case
        }
        if (num == 1 )
        {
            return 1;  //base case
        }
        
        //New long array (100)
        long arr[] = new long[101];
        
        //Stepping stones for the array to make it easier for me
        //Important for the array
        arr[0] = 0;
        arr[1] = 1;

        //For Loop based on recursive/original
        //I started with 2 since 0 and 1 was already established
        for (int i = 2; i <= 100; i++)
        {
            //Adds a previous number and recent number
            //Ex. arr[2] = arr[1]+arr[0]
            //    arr[3] = arr[2]+arr[1]
            arr[i] = arr [i-1]+ arr [i-2]; 
        }
        return arr[num];
    }

}