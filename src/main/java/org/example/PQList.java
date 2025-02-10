package org.example;



class Node{
    int data;
    Node next;
    Node head = null;
    Node tail= null;
    int size=0;
     Node(int data) {
        this.data = (int) data;
        this.next = head.next;
        head.next = tail;

    }

public class PQList implements PriorityQueueInterface{
    @Override
    public void add(Object player) {
        Node backNode = new Node(data);
        tail.next = backNode;
        tail = backNode;
        size++;


    }

    @Override
    public void add(Player player) {

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
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


}}


