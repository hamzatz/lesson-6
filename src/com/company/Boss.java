package com.company;

import java.util.Random;

public class Boss {
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

    public Boss(int health, int hits, int hitDefenceType) {
        this.health = health;
        this.hits = hits;
        this.hitDefenceType = hitDefenceType;
    }

    public int changeDefenceType (){
        Random random = new Random();
        int randomInt;
        randomInt = random.nextInt(3)+1;
        return randomInt;
    }
}
