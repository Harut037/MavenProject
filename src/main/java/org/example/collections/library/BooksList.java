package org.example.collections.library;

public class BooksList {
    private String name;

    private Book book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    public String getTitle() {
        return book.getTitle();
    }

    public String getAuthor() {
        return book.getAuthor();
    }



    public BooksList(String name, Book book) {
        this.name = name;
        this.book = book;
    }




    @Override
    public String toString() {
        System.out.println();
        return "Library` " +  name + ",  " + book;
    }



}
