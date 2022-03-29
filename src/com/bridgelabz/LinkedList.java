package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display() {
        Node temp = head;     //pointing to first node
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void push(int data) {
        Node newNode=new Node(data);
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    public void pop() {

        head=head.next;
    }

    public void insertAfter(int prevNode, int data) {
        Node newNode = new Node(data);
        Node searchNode= this.search(prevNode);
        if(searchNode!=null){
            Node tempNode = searchNode.next;
            searchNode.next =newNode;
            newNode.next=tempNode;
        }
}

    private Node search(int data) {
        Node temp= head;
        while (temp != null)
        {
            if(temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void remove(){
        Node temp=head;
        Node prevNode = null;
        while(temp.next!=null){
            prevNode=temp;
            temp=temp.next;
        }
        prevNode.next=null;
    }

    public Node findNode(int data) {
        Node currentNode = head;

        while(currentNode.next != null) {
            if(currentNode.data == data) {
                System.out.println("Element Found "+data);
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
 public void deleteNode(int data) {
        Node currentNode = head;
        Node previousNode = head;

        while(currentNode != null) {
            if(currentNode.data == data) {
                previousNode.next = currentNode.next;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }


    public void sortList()
    {

        // Node current will point to head
        Node current = head, index = null;
        int temp;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    }
