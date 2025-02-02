package org.example;
import java.util.*;

class Player{
    String name;
    int score;
    Player() {
    }

    public Player(String name, int score) {

    }
    Player(Player other){
        this.name=other.name;
        this.score=other.score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    Player createClone(){
        return new Player(this);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }
    private class Node<T>{
        int data;
        Node next;
        Node head;
        Node tail;
        public Node(T data) {
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
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


}

    }
