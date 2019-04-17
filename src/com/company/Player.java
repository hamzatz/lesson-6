package com.company;

public class Player {
    private int health;
    private int hits;
    private int hitDefenceType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHitDefenceType() {
        return hitDefenceType;
    }

    public void setHitDefenceType(int hitDefenceType) {
        this.hitDefenceType = hitDefenceType;
    }

     Player(int health, int hits, int hitDefenceType) {
        this.health = health;
        this.hits = hits;
        this.hitDefenceType = hitDefenceType;
    }

     Player() {
    }
}
