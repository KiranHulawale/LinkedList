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
    public void push(int data) {
        Node newNode=new Node(data);
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    
    void display(){
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
    }
