package model;

public class Loan {

    // ATRIBUTOS LOAN
    private String namePersonLoan;
    private Borrowed borrowed;
    private String loanDate;
    private String returnDate;

    // CONSTRUCTOR
    public Loan (String namePersonLoan, Borrowed borrowed, String loanDate, String returnDate) {
        this.namePersonLoan = namePersonLoan;
        this.borrowed = borrowed;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    // GET
    public String getNamePersonLoan () { return namePersonLoan; }
    public Borrowed getBorrowed () { return borrowed; }
    public String getLoanDate () { return loanDate; }
    public String getReturnDate () { return returnDate; }

    // TO STRING
    public String toString () {
        return "Person to whom the item has been lent: " + namePersonLoan +
                "\nActual state: " + borrowed +
                "\nLoan date: " + loanDate +
                "\nReturn date: " + returnDate;
    }

    // ENUM BORROWED
    public enum Borrowed {

        Y ("It is currently on loan"),
        N ("At this time it is not on loan");

        // ATRIBUTOS BORROWED
        private String borrowed;

        // CONSTRUCTOR
        Borrowed (String borrowed) { this.borrowed = borrowed; }

        // GET
        public String getBorrowed () { return borrowed; }

        // SET
        public void setBorrowed(String borrowed) { this.borrowed = borrowed; }

        // MÉTODO TO STRING
        @Override
        public String toString () {
            return borrowed;
        }
    }
}
