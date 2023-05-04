/****************************************************

* Method/Class : Linked List
*
* Purpose : To create a system of Linked-List that will have options of adding,
*           showing, searching, inserting items in nodes. It can also check if
*           its empty, have constructors in the nodes to serve as template for
*           the comeplte list.
*
* Parameters : Item, ints, 
* Also provided private Node and ints.
*
* Returns : Returns any designated method that has been called in the main/client
*
****************************************************/

public class LinkedList
{
 
    private Node first;
    private int size;
   
    public void add(int item)
    {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++; 
    }

    public boolean isEmpty()
    {
        return size == 0;
        //first == null
    }

    public int size()
    {
       return size;
    }
    
    public void show()
    {
        for(Node current = first;  current != null   ;   current = current.next   )
            System.out.print(current.item + " ");
    }
    
    public boolean search(int key)
    {
        boolean found = false;
        for(Node current = first; current !=null && !found ; current = current.next)
        {
            if(current.item == key)
                found = true;
        }
        return found;
    }
    
    public void insertAfter(int key, int newItem)
    {
        boolean flag = false;
        Node newNode = new Node();
        newNode.item = newItem;
        for(Node current = first; current != null && !flag ; current = current.next)
        {
            if(current.item == key)
            {
                newNode.next = current.next;
                current.next =  newNode;
                flag = true;
            }
        }
        
        if (!search(key))
        {
            add(newItem);
        }
    }
    
    private class Node
    {
        int item;
        Node next;
    }
    
}
