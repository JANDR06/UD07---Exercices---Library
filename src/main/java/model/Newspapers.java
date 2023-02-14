package model;

public class Newspapers extends Publications {

    // ATRIBUTOS NEWSPAPERS
    private String name;
    private String publicationDay;

    // CONSTRUCTOR
    public Newspapers(String editorial, int numPages, Publications.Colour colour, String name, String publicationDay) {
        super(editorial, numPages, colour);
        this.name = name;
        this.publicationDay = publicationDay;
    }

    // GET
    public String getName() { return name; }
    public String getPublicationDay() { return publicationDay; }

    // MÉTODO TO STRING
    @Override
    public String toString() {
        return "\nName: " + name +
                " | Publication day: " + publicationDay;
    }
}
