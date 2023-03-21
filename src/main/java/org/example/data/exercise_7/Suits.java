package org.example.data.exercise_7;

public enum Suits {

    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs"),
    SPADES("Spades");


    private final String suitText;


    public String getName() {
        return suitText;
    }

    Suits(String suitText) {
        this.suitText = suitText;
    }
}
