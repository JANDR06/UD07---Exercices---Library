package model;

public class Journals extends Publications {

    // ATRIBUTOS JOURNALS
    private String name;
    private String theme;
    public Periodicity periodicity;

    // CONSTRUCTOR
    public Journals (String editorial, int numPages, Publications.Colour colour, String name, String theme, Periodicity periodicity) {
        super(editorial, numPages, colour);
        this.name = name;
        this.theme = theme;
        this.periodicity = periodicity;
    }

    // GET
    public String getName () { return name; }
    public String getTheme () { return theme; }
    public Periodicity getPeriodicity () { return periodicity; }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return super.toString() +
                "\nName: " + name +
                "\nTheme: " + theme +
                "\nPeriodicity: " + periodicity;
    }

    // ENUM PERIODICITY
    public enum Periodicity {

        S ("Weekly"),
        M ("Monthly"),
        T ("Quarterly");

        // ATRIBUTOS PERIODICITY
        private String periodicity;

        // CONSTRUCTOR
        Periodicity (String periodicity) {
            this.periodicity = periodicity;
        }

        // MÉTODO TO STRING
        @Override
        public String toString () {
            return periodicity;
        }
    }
}
