package basic;

public class Stack<T> {

    private Node top;

    private class Node
    {
        T data;
        Node link;
    }

    public void Insert(T t)
    {
        Node node = null;
        try {
            node = new Node();
        }
        catch (OutOfMemoryError error)
        {
            System.out.println("out of memory");
            System.exit(-1);
        }
        node.data = t;
        node.link = top;
        top = node;
    }

    public T remove()
    {
        if (top == null) {
            System.out.println("stack is empty");
            System.exit(-1);
        }
        Node temp  = top;
        top = top.link;
        return temp.data;
    }
}
