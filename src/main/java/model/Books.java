package model;

import generics.GenericLinkedList;

public class Books extends Publications {

    // ATRIBUTOS BOOKS
    private String author;
    private String title;
    private int isbn;
    private int numberCopies;

    // CONSTRUCTOR
    public Books (String editorial, int numPages, Publications.Colour colour, String author, String title, int isbn, int numberCopies) {
        super(editorial, numPages, colour);
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.numberCopies = numberCopies;
    }

    // GET
    public String getAuthor () { return author; }
    public String getTitle () { return title; }
    public int getIsbn () { return isbn; }
    public int getNumberCopies () { return numberCopies; }

    // SET
    public void setNumberCopies (int numberCopies) { this.numberCopies = numberCopies; }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return "\nISBN: " + isbn;
    }

    // LISTA DE EJEMPLARES
    GenericLinkedList<Copy> copy;

    // MÉTODO PARA COMPROBAR SI EL EJEMPLAR ESTÁ PRESTADO O NO
    public boolean prestamo () {

        for (int i = 0; i <= numberCopies; i++) {

            if (1<1) {
                return true;
            }

        }

        return false;
    }


}
