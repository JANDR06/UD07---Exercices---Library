package model;

public class Subscribers {

    // ATRIBUTOS SUSCRIBERS
    private String name;
    private String dni;
    private Books[] booksLoan;

    // CONSTRUCTOR
    public Subscribers (String name, String dni) {
        this.name = name;
        this.dni = dni;
        booksLoan = new Books[2];
    }

    // GET
    public String getName () { return name; }
    public String getDni () { return dni; }
    public Books[] getBooksLoan () { return booksLoan; }

    // SET
    public void setName (String name) { this.name = name; }
    public void setDni (String dni) { this.dni = dni; }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return "\n" +
                "Name: " + name +
                " | DNI: " + dni;
    }
}
