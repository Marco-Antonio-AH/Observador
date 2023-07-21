/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;
public class Observador {

    public static void main(String[] args) {
        Libro libro = new Libro("Harry Potter");

        Biblioteca vo = new Biblioteca();

        stock stock = new stock();
        compras compras = new compras();
        administración administración = new administración();

        vo.addObserver(stock);
        vo.addObserver(compras);
        vo.addObserver(administración);

        vo.devuelveLibro(libro);

    }
}
