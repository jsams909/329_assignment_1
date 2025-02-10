package org.example;

interface PriorityQueueInterface{

    void add(Object player);

    void add(Player player);

    Player getHighScore();

    void clear();

    int getSize();

    boolean isEmpty();
}