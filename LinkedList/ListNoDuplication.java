/********************************************************
 *
 *  Project :  Project 3.2 (Project Linked List)
 *  File    :  LinkedList.java
 *  Name    :  [Redacted]
 *  Date    :  February 28, 2021
 *
 *  Description : To create a "Linked List"
 *
 *    The purpose is to create a LinkedList in java 
 *    Techniques used in this code is take advantage of the Nodes, Arrays
 *    toString, for loops, boolean statements.
 *    I used the LinkedList.java and ListNoDuplicaiton.java
 *    file in order to abstract and fully utilize Nodes/LinkedList
 *
 ********************************************************/

/****************************************************
 * 
 * Method : Main/ListNoDuplication
 *
 * Purpose : To create a LinkedList/LinkedNodes in order to have a
 * list to have objects added in it and remove any duplications.
 *
 * Parameters : String[] args
 * 
 *
 * Returns : Prints out objects/ints inside a
 *
 ****************************************************/

public class ListNoDuplication {
    public static void main(String[] args)
    {
        LinkedList a = new LinkedList();
        a.removeDuplicate(12);
        a.removeDuplicate(13);
        a.removeDuplicate(14);
        a.removeDuplicate(12);
        a.removeDuplicate(12);
        a.removeDuplicate(14);
        System.out.println(a);
    }
}
