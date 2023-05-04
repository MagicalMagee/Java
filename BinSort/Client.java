
/******************************************************************************
 *
 *  Project :  BinSort | Project Stack
 *  File    :  Client.java, BinSort.java, Stack.java
 *  Name    :  [Redacted]
 *  Date    :  March 7, 2021
 *
 *  Description : The purpose of the code is to organize or sort
 *                a file filled with unsorted random 5 letter words into one
 *                sorted stack by using Stack, Arrays, Scanner, Lists. I used
 *                Scanner, PrintWriter, File, FileNotFoundException imports.
 *                to aid the goal of my code. I used input1000.txt file in 
 *                order to fulfill the goal but this also works with any amount 
 *                of words whether it may be thousands or millions. The client 
 *                will create the results via .csv or Microsoft Excel file.
 *
 *****************************************************************************/

/******************************************************************************
* Method : Main/Client Method
*
* Purpose : The Main/Client method serves as the Headquarters of the entire
*           code as it will create the necessary objects to be fulfilled in
*           other classes/methods.
*
* Parameters : String[] args with throws FileNotFoundException
*
* Returns : This method will return a file that is filled with unsorted
*           and sorted five letter words.
*
******************************************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Client {
    public static void main (String[] args) throws FileNotFoundException
    {
        File myFile = new File("input1000.txt");
        PrintWriter write = new PrintWriter("sort.csv");
        
        Scanner First = new Scanner(myFile);
        Scanner Second = new Scanner(myFile);
        
        Stack orig = new Stack();
        Stack sorted = new Stack();
        
        while(First.hasNextLine())
        {
            orig.push(First.nextLine());
            sorted.push(Second.nextLine());
        }
        
        /******************************************************************
        *  .close() helps to secure the entire stack/scanner as it causes
        *  an error within .csv file or fails (doesn't input anything
        *  in the file but compiler says otherwise).
        ******************************************************************/
        
        First.close();
        Second.close();
        
        BinSort bin = new BinSort(sorted);
        bin.Sort();
        
        write.println("Original, Sorted");
        while(!orig.isEmpty())
        {
            write.println(orig.pop() + ", " + sorted.pop());
        }
        write.close();  
    }
}
