package model;

import generics.GenericLinkedList;

public class Main {
    public static void main(String[] args) {

        // CREAMOS UNA LISTA DE PUBLICACCIONES Y OTRA DE CLIENTES
        GenericLinkedList<Publications> benisanoLibrary = new GenericLinkedList<>();
        GenericLinkedList<Subscribers> subscribersList = new GenericLinkedList<>();

        // CREAMOS TRES PUBLICACIONES DISTINTAS
        Copy e1 = new Copy("Porrua", 345, Publications.Colour.C, "Rosa Maria Phillips", "Crimen y castigo", 8420657, 3, "154232");
        Journals j1 = new Journals("MIC", 112, Publications.Colour.C, "The magazin", "Sports", Journals.Periodicity.S);
        Newspapers n1 = new Newspapers("La tremenda corte", 21, Publications.Colour.BN, "El pais", "14/02/2023");

        // DAMOS DE ALTA A LAS TRES PUBLICACIONES
        benisanoLibrary.addHead(e1);
        benisanoLibrary.addHead(j1);
        benisanoLibrary.addHead(n1);
        System.out.println(benisanoLibrary);
        System.out.println();

        // DAMOS DE BAJA LA PUBLICACION EN LA POSICION 0. EN ESTE CASO n1
        benisanoLibrary.remove(0);
        System.out.println(benisanoLibrary);
        System.out.println();

        // CREAMOS DOS CLIENTES DISTINTOS
        Subscribers s1 = new Subscribers("Luis Perez Milla", "23861243M");
        Subscribers s2 = new Subscribers("Marcos Garcia Gomez", "12953412Y");

        // DAMOS DE ALTA LOS DOS CLIENTES
        subscribersList.addHead(s1);
        subscribersList.addHead(s2);
        System.out.println(subscribersList);
        System.out.println();

        // DAMOS DE BAJA EL CLIENTE EN LA POSICION 1. EN ESTE CASO s1
        subscribersList.remove(1);
        System.out.println(subscribersList);
        System.out.println();

        // MODIFICAMOS LOS DATOS DEL CLIENTE s2 Y LE CAMBIAMOS EL NOMBRE
        s2.setName("Carlos");
        System.out.println(subscribersList);
        System.out.println();

        // PRESTAR UN EJEMPLAR DE UN LIBRO A UN CLIENTE
        //e1.lendCopy(s1);

    }
}
