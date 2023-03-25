package org.example.collections.library;

public class Test {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add("National", "Alfa", "Nakov", "Anna", 2023);
        lib.add("National", "Omega", "Nakov", "Karen", 2022);
        lib.searchByAuthor("Nakov");
        lib.display();
        lib.deleteByAuthor("Nakov");

        System.out.println("--------------------------------------------------------------------------");
        lib.display();

    }
}
