
public class Queue
{
    private Node first; //pointers
    private Node last;
    private int size;
    
    private class Node
    {
        int item;
        Node next;
    }
    
    public boolean isEmpty()
    {
        return first == null;
    }
    
    public void enqueue(int item)
    {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (!(isEmpty()))
            oldLast.next = last;
        else
            first = last;

        size++;
    }

    
    public int dequeue()
    {
        if(isEmpty())
        {
            throw new RuntimeException();
        }
        int temp = first.item;
        first = first.next;
        size--;
        if(isEmpty())
        {
            last = first;
        }
        return temp;
    }
    
    public int size()
    {
        return size;
    }
    
    public void push(int item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        size++;
    }
    
    public int pop()
    {
        int temp = first.item;
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
    
    public static void main(String[] args)
    {
        Queue myQueue = new Queue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.dequeue();
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.show();
        
    }
}

