package generics;

import java.lang.reflect.Array;

public class ListLibrary<T> {

    // ATRIBUTOS LIST PUBLICATIONS
    private Node<T> head;
    private Node<T> tail;
    private int size;

    // CONSTRUCTOR
    public ListLibrary () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // GET
    public int size () { return size; }
    public Node<T> getHead () { return head; }
    public Node<T> getTail () { return tail; }

    // MÉTODO PARA COMPROBAR SI ESTÁ VACÍO
    public boolean isEmpty () { return size==0; }

    // MÉTODO PARA AGREGAR UNA CABEZA
    public void addHead (T elem) {
        Node<T> node = new Node<>(elem);

        if (isEmpty()) {
            head = node;
            tail = node;

        } else {
            node.setNext(head);
            head = node;
        }

        size++;
    }

    // MÉTODO PARA AGREGAR UNA COLA
    public void addTail (T elem) {
        Node<T> node = new Node<>(elem);
        if (isEmpty()) {
            head=node;
            tail=node;

        } else {
            tail.setNext(node);
            tail = node;
        }

        size++;
    }

    // MÉTODO PARA BUSCAR UN NODO
    public int search (T elem) {
        int result = -1;

        if (isEmpty())
            return result;

        Node<T> node = head;

        for (int i = 0; i < size; i++) {
            if (node.getElem().equals(elem))
                return i;

            node = node.getNext();
        }

        return result;
    }

    // MÉTODO PARA ALMACENAR LA LISTA EN UN ARRAY
    public T[] toArray (Class c) {
        T[] vector = (T[]) Array.newInstance(c,size);
        Node node = head;

        for (int i = 0; i < size; i++) {
            vector[i] =(T) node.getElem();
            node = node.getNext();
        }

        return vector;
    }

    // MÉTODO PARA ELIMINAR UN NODO
    public T remove (int index) {
        T result = null;

        if (isEmpty() || index < 0 || index>=size)
            return result;

        boolean tailChange = (index == size-1);

        if (index == 0) {
            result = head.getElem();
            head = head.getNext();

        } else {
            Node<T> aux1 = head;
            Node<T> aux2 = head.getNext();

            while (index > 1) {
                aux1 = aux2;
                aux2 = aux2.getNext();
                index--;
            }

            result = aux2.getElem();
            aux1.setNext(aux2.getNext());

            if (tailChange)
                tail = aux1;

        }

        size--;
        return result;
    }

    // MÉTODO PARA OBTENER UN NODO
    public T get (int index) {
        T result = null;

        if (isEmpty() || index <0 || index>=size)
            return result;

        Node<T> node = head;

        while (index>0) {
            node = node.getNext();
            index--;
        }

        result = node.getElem();
        return result;
    }

    // MÉTODO PARA LIMPIAR UNA LISTA
    public void clear () {
        head = null;
        tail = null;
        size = 0;
    }

    // MÉTODO PARA AÑADIR A TU LISTA UNA NUEVA
    public boolean addAll (ListLibrary<T> list) {
        boolean updated = false;
        Node<T> node = list.getHead();

        for (int i = 0; i < list.size(); i++) {
            addTail(node.getElem());
            node = node.getNext();
            updated = true;
        }

        return updated;
    }

    // MÉTODO EQUALS
    @Override
    public boolean equals (Object obj) {

        if (!(obj instanceof ListLibrary))
            return false;

        ListLibrary<T> list = (ListLibrary) obj;

        if (list.size() != this.size)
            return false;

        Node<T> aux1 = this.head;
        Node<T> aux2 = list.getHead();

        while (aux1 != null) {

            if (!aux1.equals(aux2))
                return false;

            aux1 = aux1.getNext();
            aux2 = aux2.getNext();
        }

        return true;
    }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return "{ size: " + size + ", Element: " + ((head==null) ? "}" : head.toString());
    }

    // MÉTODO CONTAINS
    public boolean contains(T elem){
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if(elem.equals(node.getElem()))
                return true;
            node = node.getNext();
        }
        return false;
    }
}
