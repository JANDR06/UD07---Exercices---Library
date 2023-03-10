package model;

public class Copy extends Books {

    // ATRIBUTOS EJEMPLAR
    private String codeEjemplar;

    // CONSTRUCTOR
    public Copy(String editorial, int numPages, Publications.Colour colour, String author, String title, int isbn, int numberCopies, String codeEjemplar) {
        super(editorial, numPages, colour, author, title, isbn, numberCopies);
        this.codeEjemplar = codeEjemplar;
    }

    // GET
    public String getCodeEjemplar() {
        return codeEjemplar;
    }

    // MÉTODO TO STRING
    @Override
    public String toString() {
        return super.toString() +
                " | Code: " + codeEjemplar;
    }


}
