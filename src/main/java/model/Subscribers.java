package model;

public class Subscribers {

    // ATRIBUTOS SUSCRIBERS
    private String name;
    private String dni;
    private Books[] books;

    // CONSTRUCTOR
    public Subscribers (String name, String dni) {
        this.name = name;
        this.dni = dni;
        books = new Books[2];
    }

    // GET
    public String getName () { return name; }
    public String getDni () { return dni; }
    public Books[] getBooks () { return books; }

    // SET
    public void setName (String name) { this.name = name; }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return "\n" +
                "Name: " + name +
                " | DNI: " + dni +
                " | List of borrowed books: " + books;
    }
}
