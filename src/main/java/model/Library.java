package model;

import generics.GenericLinkedList;

public class Library {

    // LISTAS DE PUBLICACIONES Y CLIENTES
    GenericLinkedList<Publications> publications;
    GenericLinkedList<Subscribers> subscribers;

    // CONSTRUCTOR
    public Library () {
        publications = new GenericLinkedList<>();
        subscribers = new GenericLinkedList<>();
    }

    // MÉTODO PARA DAR DE ALTA CUALQUIER TIPO DE PUBLICACIÓN
    public void createPublication (Publications x) {
        publications.addHead(x);
    }

    // MÉTODO PARA DAR DE BAJA CUALQUIER TIPO DE PUBLICACIÓN
    public void deletePublication (int numberDeletePublication) {
        publications.remove(numberDeletePublication);
    }

    // MÉTODO PARA DAR DE ALTA CLIENTE
    public void createSubscriber (Subscribers x) { subscribers.addHead(x); }

    // MÉTODO PARA DAR DE BAJA CLIENTE
    public void deleteSubscriber (int numberDeleteSuscriber) {
        subscribers.remove(numberDeleteSuscriber);
    }
}
