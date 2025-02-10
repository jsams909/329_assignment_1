package org.example;

class Player{
   private  String name;
    private int score;

    Player() {
    }

    Player(String name, int score, Player p) {
        this.name=name;
        this.score=score;
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

    Player createClone(String name, int score) {
        return new Player(this);
    }
        @Override
        public boolean equals(Object play) {
            if (this == play) return true;
            if (play == null || getClass() != play.getClass()) return false;
            Player player = (Player) play;
            return name.equals(player.name);
        }
    }
