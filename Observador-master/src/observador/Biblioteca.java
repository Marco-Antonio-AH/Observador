package observador;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class Biblioteca extends Observable {

    // Libro Libro = new Libro("Harry Potter");

    private Libro libro = null;

    public Biblioteca() {
        //this.libro = libro;
    }

    public void devuelveLibro(Libro libro) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Está dañado? 1) Si     2) No");
        int respuesta = sc.nextInt();
        
        

        if (respuesta == 1) {

            setChanged();
            notifyObservers();

        } else if (respuesta == 2) {

            System.out.println("Todo bien");

        }

    }

}
