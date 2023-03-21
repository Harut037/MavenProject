package org.example.inheritance.composition.example_1;

public class Human {


  private Heart heart;

    public Human(Heart heart) {
        this.heart = heart;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }
}
