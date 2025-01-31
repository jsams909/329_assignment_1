package org.example;

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
}

    }
}