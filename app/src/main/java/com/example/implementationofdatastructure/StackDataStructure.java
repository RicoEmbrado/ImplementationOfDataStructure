package com.example.implementationofdatastructure;

public class StackDataStructure
{
    //instance variables

    private Node head;
    private Node tail;

    //constructors

    public StackDataStructure()
    {
        head = null;
        tail = null;
    }

    //method add to list

    public void push(String addData)
    {
        Node newNode = new Node(addData, null);
        if (isEmpty())
        {
            tail = newNode;
        }
        else
        {
            newNode.setLink(tail);
            tail = newNode;
        }
    }


    public String pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Cannot pop.");
            return "-1"; //returning -1 meaning failure
        }
        String data = tail.getData();
        tail = tail.getLink();
        return data;
    }

    public boolean isEmpty()
    {
        return tail == null;
    }

    public void display()
    {
        Node current = tail;
        while (current != null)
        {
            System.out.println(current.getData());
            current = current.getLink();
        }
    }

    public String peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty, cannot peek.");
            return "-1";
        }
        return tail.getData();
    }

    private class Node
    {
        private String data;
        private Node link;

        public Node(String data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        public String getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }

        public void setLink(Node link)
        {
            this.link = link;
        }
    }
}

