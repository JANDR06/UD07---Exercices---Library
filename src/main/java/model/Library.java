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
    public void deletePublication (int numberDelete) {
        publications.remove(numberDelete);
    }

    // MÉTODO PARA PRESTAR Y DEVOLVER UN EJEMPLAR DE UN LIBRO.

    // MÉTODO PARA DAR DE ALTA, BAJA Y MODIFICAR LOS DATOS DE UN CLIENTE

}
