package org.example.inheritance.composition.example_1;

public class Main {
//    6. Composition - child cannot exist independent of the parent.
//       Example: Human and heart, heart don’t exist separate to a Human.


    public static void main(String[] args) {
        Heart heart = new Heart();
        Human human = new Human(heart);
        human.getHeart().pounding();
    }
}
