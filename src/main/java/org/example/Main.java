package org.example;
import java.util.*;

     class Node{
        int data;
        Node next;
        Node head;
        Node tail;
        public Node(int data) {
            this.data = (int) data;
            this.next = head.next;
            head.next = tail;

}
interface PriorityQueueInterface{
    void add(Object o);
    Player getHighScore();
    void clear();
    int getSize();
    boolean isEmpty();
}
class LinkedList implements PriorityQueueInterface{
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


    }

    }

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


}

    }
