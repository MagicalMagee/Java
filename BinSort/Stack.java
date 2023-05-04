/****************************************************

* Class : Stack
*
* Purpose : The Sort class is to create a Stack and be able to fill and show
*           all the items in the Nodes/Stack
*
* Parameters : String
* Private class : Node first, int size
*
****************************************************/

public class Stack
{
    private Node first;
    private int size;
    
    private class Node
    {
        String item;
        Node next;
    }
    
    public boolean isEmpty()
    {
        return first == null;
    }
    
    public int size()
    {
        return size;
    }
    
    public void push(String item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        size++;
    }
    
    public String pop()
    {
        String temp = first.item;
        first = first.next;
        size--;
        return temp;
    }
    
    public void show()
    {
        for(Node current = first;current != null;current = current.next)
        {
            System.out.print(current.item + " ");
        }
    }
}
