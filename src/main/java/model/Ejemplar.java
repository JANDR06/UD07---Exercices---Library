package model;

public class Ejemplar extends Books {

    // ATRIBUTOS EJEMPLAR
    private String codigoEjemplar;
    private String fechaPrestamo;
    private String fechaDevolucion;

    // CONSTRUCTOR
    public Ejemplar (String editorial, int numPages, Publications.Colour colour,String author, String title, int isbn, int numberCopies, String codigoEjemplar, String fechaPrestamo, String fechaDevolucion) {
        super (editorial, numPages, colour ,author, title, isbn, numberCopies);
        this.codigoEjemplar = codigoEjemplar;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return super.toString() +
                "Code of ejemplar: " + codigoEjemplar;
    }


}
