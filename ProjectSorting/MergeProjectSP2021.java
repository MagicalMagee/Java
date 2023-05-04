
/********************************************************
 *
 *  Project :  Project Merge Sort using Queues
 *  File    :  MergeProjectSP2021
 *  Name    :  [Redacted]
 *  Date    :  27 April 2021
 *
 *  Description :
 *
 *    Purpose of the code is to apply merge sort in a queues. The helper
 *    methods were already implemented such as show, less. I put continued
 *    on merge method that creates the essential "merged" Queues from different
 *    list/queues. I used the Queue.java file in order to work as it plays part
 *    with the entire project
 * 
 * 
 ********************************************************/

public class MergeProjectSP2021
{
    private static Queue merge(Queue<Integer> a, Queue<Integer> b)
    {
        //Placeholder/Aux for the merged Queues/numList3
        Queue<Integer> merged = new Queue<Integer>();
        
        //While both still have something, it will enqueue values to the
        //placeholder/auxilary queue (Hint c,d)
        while(!a.isEmpty() && !b.isEmpty()) {
            //sees if the first element of a queue is less than the first
            //element of b queue then slaps it in the aux/placeholder
            if (a.peek() < b.peek()) {
                merged.enqueue(a.dequeue());
            } else {
                merged.enqueue(b.dequeue());
            }
        }
        
        //Struggle#1
        //(Hint a,b) it was a struggle for me to combine it up with the code
        //above so I decided to separate it.
        
        //In case of uneven queues, the remainders get slapped in
        while(!a.isEmpty()) {
            merged.enqueue(a.dequeue());
        }
        while(!b.isEmpty()) {
            merged.enqueue(b.dequeue());
        }
        
        //Returns "hopefully" a sorted queue
        return merged;
    }

    /**
     * *************************************************************************
     * Helper sorting function.
    **************************************************************************
     */
    // is v < w ?
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    // print array to standard output
    private static void show(Queue a)
    {
        System.out.println(a);
    }

    // Main method
    // Provides Queues with values and prints/shows it
    public static void main(String[] args)
    {
        Queue<Integer> num1List = new Queue<>();
        Queue<Integer> num2List = new Queue<>();
        Queue<Integer> num3List = new Queue<>();
        num1List.enqueue(12);
        num1List.enqueue(26);
        num1List.enqueue(35);
        num1List.enqueue(42);
        System.out.println("NumList 1");
        System.out.println(num1List.toString());

        num2List.enqueue(10);
        num2List.enqueue(27);
        num2List.enqueue(55);
        num2List.enqueue(57);
        System.out.println("NumList 2");
        System.out.println(num2List.toString());

        num3List = merge(num1List, num2List);
        System.out.println("NumList 3 aka 'MergedList'");
        show(num3List);
    }
}

