package org.example.collections.library;
import java.util.ArrayList;

public class Library {

    ArrayList<BooksList> list = new ArrayList<BooksList>();

    /**
     * Method adds a new book to the library.
     */
    public void add(String nameofLib, String title, String author, String publisher, int yearOfPublishing){
        Book newBook = new Book(title,author,publisher, yearOfPublishing);
        BooksList booksList = new BooksList(nameofLib, newBook);
        list.add(booksList);

    }

    /**
     * Method print list`s information.
     */
    public void display() {
        for(int i = 0; i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * Method searching by title.
     */
    public void searchByTitle(String title) {
        for(int i = 0; i<list.size();i++) {
            if (list.get(i).getTitle().equals(title)){
                System.out.println(" \nWe have that book, it`s author : " + list.get(i).getAuthor());
                return;
            }
        }
        System.out.println(" \nSorry we have not that book : ");
    }

    /**
     * Method searching all books have written by that author.
     * @param author
     */
    public void searchByAuthor(String author) {
        int counter = 0;
        for(int i = 0; i<list.size();i++) {
            if (list.get(i).getAuthor().equals(author)){
                System.out.println(" \nWe have that author`s book it`s title : ( " + list.get(i).getTitle() + " )");
            counter++;
            }
        }
        if (counter == 0) {
            System.out.println(" \nSorry we have not that book : ");
        }
    }

    /**
     * Method deletes from the list all that author`s books.
     * @param author
     */
   public void deleteByAuthor(String author){
        if (list.size() == 0){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAuthor().equals(author)){
                    list.remove(i);
                    i--;
                }
            }
        }
        else {
            System.out.println("We have not books yet:  ");
        }
    }
}
