package com.example.interview.priceline.chutesLadder;

public class Player {
    private String name;
    private int score;

    public Player(String name){
        this.name = name;
    }

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}