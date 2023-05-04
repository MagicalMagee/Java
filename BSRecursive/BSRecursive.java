/********************************************************
 *
 *  Project :  BSRecursive
 *  File    :  BSRecursive.java
 *  Name    :  [Redacted]
 *  Date    :  21 March 2021
 *
 *  Description :
 *
 *    Purpose of this code/project is to demonstrate a recursive method by
 *    implementing it to an array. I used a standard array to implement a
 *    demonstrate a Binary Search. The code contains a main and BinSearch method
 *    which becomes the driver(main) and recursion(BinSearch) method. 
 *
 ********************************************************/

/****************************************************

* Method : Main
*
* Purpose : The main method serves as the driver to which places a fixed
* array that can be changed by editor/coder, and prints out the location
* of the searched element by doing a recursion.
*
* Parameters : String[] args, a string of arguments
*
* Returns : This method prints out the location of the searched element.
*
****************************************************/
public class BSRecursive 
{
    public static void main(String[] args) 
    {
        //Fixed array but can be changed by editor/coder
        int numbers[] = { 12, 14, 17, 110, 111, 132, 145, 187, 200, 230, 200 };
        
        //Prints out location via recursion(BinSearch) method
        System.out.println( BinSearch(numbers,230, 0, numbers.length-1));
    }
    
    /****************************************************
    *
    * Method : BinSearch
    *
    * Purpose : The purpose of the method is to demonstrate a recursive method
    * by implementing an array 
    *
    * Parameters : arr(an array with elements), in search(number that is 
    * marked to be looked for), int start(designate starting), 
    * int end(designate ending).
    *
    * Returns : This method returns the place of the element/search in the 
    * array. It returns how humans count not by the coding perspective.
    *
    * @param arr
    * @param search
    * @param start
    * @param end
    * @return 
    ****************************************************/
    
    public static int BinSearch(int[] arr, int search, int start, int end)
    {
        //Starts at the middle and searches if the 's' is to the left(less than)
        //or right(more than) of the entire array
        
        //First, created a mid section to make the searching process more effective
        //rather than going in the start one by one.
        int mid = (start + end)/2;
        
        //If the element is in the middle it will return the mid
        if(search == arr[mid]) {
            return mid;
        }
        //Does recursion if the element is to the left side of the array 
        //or less than the midsection
        if(search > arr[mid]) {
            return BinSearch(arr, search, mid, end);
        }
        //Does recursion if the element is to the right side of the array 
        //or more than the midsection
        if(search < arr[mid]) {
            return BinSearch(arr, search, start ,mid);
        }
        //Returns -1 if the searched element is not in the array.
        return -1;
    }
}
