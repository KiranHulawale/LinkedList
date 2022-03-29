package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;

    public  void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head=  newNode;
            tail=  newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void display(){
        Node temp = head;     //pointing to first node
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
