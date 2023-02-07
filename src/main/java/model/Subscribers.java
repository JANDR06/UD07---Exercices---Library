package model;

public class Subscribers {

    // ATRIBUTOS SUSCRIBERS
    private String nombre;
    private String dni;

    // CONSTRUCTOR
    public Subscribers (String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // GET
    public String getNombre () { return nombre; }
    public String getDni () { return dni; }

    // SET
    public void setNombre () { this.nombre = nombre; }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return "Nombre: " + nombre +
                "DNI: " + dni;
    }
}
