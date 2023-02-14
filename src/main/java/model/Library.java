package model;

import generics.GenericLinkedList;

public class Library {

    // LISTAS DE PUBLICACIONES Y CLIENTES
    GenericLinkedList<Publications> publications;
    GenericLinkedList<Subscribers> suscribers;

    // CONSTRUCTOR
    public Library () {
        publications = new GenericLinkedList<>();
        suscribers = new GenericLinkedList<>();
    }

    // MÉTODO PARA DAR DE ALTA CUALQUIER TIPO DE PUBLICACIÓN
    public void createPublication (Publications x) {
        publications.addHead(x);
    }

    // MÉTODO PARA DAR DE BAJA CUALQUIER TIPO DE PUBLICACIÓN
    public void deletePublication (int numberDeletePublication) {
        publications.remove(numberDeletePublication);
    }


    // MÉTODO PARA PRESTAR UN EJEMPLAR DE UN LIBRO



    // MÉTODO PARA DEVOLVER UN EJEMPLAR DE UN LIBRO




    // MÉTODO PARA DAR DE ALTA CLIENTE
    public void createSuscriber (Subscribers x) { suscribers.addHead(x); }

    // MÉTODO PARA DAR DE BAJA CLIENTE
    public void deleteSuscriber (int numberDeleteSuscriber) {
        suscribers.remove(numberDeleteSuscriber);
    }

    // MÉTODO PARA  MODIFICAR LOS DATOS DE UN CLIENTE
    public void setSuscribers (GenericLinkedList<Subscribers> suscribers) {
        this.suscribers = suscribers;
    }
}
