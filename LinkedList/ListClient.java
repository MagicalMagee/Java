/********************************************************
 *
 *  Project :  Project3 or Project Linked Lists Part 1
 *  File    :  ListClient.java and LinkedList.java
 *  Name    :  [Redacted]
 *  Date    :  March 7, 2021
 *
 *  Description : To simulate a board game
 *
 *    The purpose is to create a game within java with the use of Counter
 *    Techniques used in this code is take advantage of the Counter method
 *    and use incrementation to stack up tally value. I used the Counter.java
 *    file in order to use to the counter method.
 *
 ********************************************************/

/****************************************************

* Method : Main/Client/ListClient
*
* Purpose : To demonstrate learning linked lists and building a linked list
*
* Parameters : String[] args
*
* Returns : A LinkedList of grades that has been prepended and inserted by
*           different ints/grades
*
****************************************************/

public class ListClient
{
    public static void main(String[] args)
    {
        LinkedList grades = new LinkedList();
        grades.add(100);//prepend
        grades.add(98);////prepend
        grades.add(87);//prepend
        grades.add(76);//prepend
        grades.insertAfter(100,99);
        grades.insertAfter(76,32);
        grades.insertAfter(23,89);//23 is not in the list, so 89 will added to the begining of the code.
        
        grades.show();
        
        System.out.println("");
    }
    
}
