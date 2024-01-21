package AntonioBertuccio;

import AntonioBertuccio.entities.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        CatalogoBibliotecario catalogo = new CatalogoBibliotecario();

        Libro libro1 = new Libro("123456789", "Il Libro", 2020, 300, "Autore Libro");
        Rivista rivista1 = new Rivista("987654321", "La Rivista", 2021, 50, Periodicita.MENSILE);

        catalogo.aggiungiElemento(libro1);
        catalogo.aggiungiElemento(rivista1);

        ElementoCatalogo elementoTrovato = catalogo.ricercaPerISBN("123456789");
        System.out.println("Elemento trovato per ISBN: " + elementoTrovato);

        List<ElementoCatalogo> libriDel2020 = catalogo.ricercaPerAnnoPubblicazione(2020);
        System.out.println("Libri del 2020: " + libriDel2020);

        List<ElementoCatalogo> libriDiAutore = catalogo.ricercaPerAutore("Autore Libro");
        System.out.println("Libri dell'autore: " + libriDiAutore);

        catalogo.salvaCatalogoSuDisco("catalogo.ser");

        catalogo.caricaCatalogoDaDisco("catalogo.ser");
    }
}
