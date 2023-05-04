/****************************************************

* Class : BinSort
*
* Purpose : This Class allows to receive the items from bins and create
*           multiple bins to accommodate the entire alphabet and be able
*           sort those bins until it reaches its maximum stage or final letter.
*           I used pop and push to be able to put in the items into the master
*           bin and be sorted again.
*
* Parameters : Array, Stack
*
* Returns : This class returns the sorted version of the unsorted stack
*
****************************************************/

public class BinSort {
    
    final int wordsize = 5;
    Stack Master = new Stack();
    
    public BinSort(Stack Kenobi)
    {
        Master = Kenobi;
    }
    
    /****************************************************
    * Method : Sort
    *
    * Purpose : This method creates an array of stack to create a systematic
    *           sorting method to slowly sort the five letter words one by one
    *           by creating multiple bins.
    *
    * Returns : A clean sorted stack and be put into the Master bin
    *
    ****************************************************/
    
    public void Sort()
    {
        int size = Master.size();
        Stack[] bins = new Stack[26];
        for (int b = 0; b < bins.length; b++)
        {
            bins[b] = new Stack();
        }
        
        for(int m = 0; m < wordsize; m++)
        {
            for(int b = 0; b < size; b++)
            {
                String str = Master.pop();
                
                int binIndex = str.charAt(wordsize - m -1) - "a".charAt(0);
                bins[binIndex].push(str);
            }
            
            for (int a = 25; a >= 0; a--)
            {
                while(!bins[a].isEmpty())
                {
                    Master.push(bins[a].pop());
                }
            }
        }
    }
}
