package org.example;

import java.lang.classfile.Interfaces;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

}
interface PriorityQueueInterface{
     void add(Object o);
    Player gethighscore();
    }

}

    }
