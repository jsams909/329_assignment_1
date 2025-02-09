package org.example;



class Node{
    int data;
    Node next;
    Node head = null;
    Node tail= null;
    public Node(int data) {
        this.data = (int) data;
        this.next = head.next;
        head.next = tail;

    }

public class PQList implements PriorityQueueInterface{
    @Override
    public void add(Object o) {
        Node backNode = new Node(data);
        tail.next = backNode;
        tail = backNode;


    }

    @Override
    public Player getHighScore() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


}}


