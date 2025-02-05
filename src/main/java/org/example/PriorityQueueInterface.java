package org.example;

interface PriorityQueueInterface{
    void add(Object o);
    Player getHighScore();
    void clear();
    int getSize();
    boolean isEmpty();
}