package generics;

class Node<T> {

    // ATRIBUTOS NODE
    private T elem;
    private Node<T> next;

    // CONSTRUCTOR
    public Node (T elem) {
        this.elem=elem;
        this.next=null;
    }

    // GET
    public Node<T> getNext () { return next; }
    public T getElem () { return elem; }

    // SET
    public void setElem (T elem) { this.elem = elem; }
    public void setNext (Node<T> next) { this.next = next; }

    // MÉTODO TO STRING
    @Override
    public String toString () {
        return elem + ((next!=null)?", " + next : " }");
    }

    // MÉTODO EQUALS
    @Override
    public boolean equals (Object obj) {

        if (!(obj instanceof Node))
            return false;

        Node<T> node = (Node) obj;
        return (node.getElem() == elem);
    }
}