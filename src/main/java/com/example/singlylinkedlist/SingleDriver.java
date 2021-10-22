package com.example.singlylinkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new SinglyLinkedList<String>();

        linkedlist.addFirst("first");
        linkedlist.addFirst("second");
        linkedlist.addFirst("third");
        linkedlist.addFirst("fourth");
        linkedlist.addFirst("fifth");

        linkedlist.addLast("sixth");
        linkedlist.addLast("seventh");
        linkedlist.addLast("eighth");

        System.out.println(linkedlist);

        System.out.println(linkedlist.contains("first"));
        System.out.println(linkedlist.contains("eighth"));
        System.out.println(linkedlist.contains("tenth"));

        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());

        linkedlist.pollFirst();

        System.out.println(linkedlist);

        linkedlist.pollLast();

        System.out.println(linkedlist);

        linkedlist.clear();

        System.out.println(linkedlist);


    }
}
