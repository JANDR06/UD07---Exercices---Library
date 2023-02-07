package model;

public abstract class Publications {

    // ATRIBUTOS COMMON FEATURES
    private String editorial;
    private int numPages;
    private Colour colour;

    // CONSTRUCTOR
    public Publications (String editorial, int numPages, Colour colour) {
        this.editorial = editorial;
        this.numPages = numPages;
        this.colour = colour;
    }

    // GET
    public String getEditorial () { return editorial; }
    public int getNumPages () { return numPages; }
    public Colour getColour () { return colour; }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return "Editorial: " + editorial +
                "\nNumber of pages: " + numPages +
                "\nColour: " + colour;
    }

    // ENUM COLOUR
    public enum Colour {

        BN ("Black and white"),
        C ("Colour");

        // ATRIBUTOS COLOUR
        private String colour;

        // CONSTRUCTOR
        Colour (String colour) {
            this.colour = colour;
        }

        // MÉTODO TO STRING
        @Override
        public String toString () {
            return colour;
        }
    }
}
