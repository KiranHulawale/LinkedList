package com.bridgelabz;

public class MainClass {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        //list.add(30);
        list.add(70);
        list.insertAfter(56, 30);
        //list.pop();
        //list.remove();
        //list.findNode(30);
        list.insertAfter(30, 40);
       // list.deleteNode(40);
        list.sortList();
        System.out.println("Sorted list");
        list.display();
    }
}
