package AntonioBertuccio.entities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoBibliotecario implements Serializable {
  private List<ElementoCatalogo> catalogo = new ArrayList<>();

  public void aggiungiElemento(ElementoCatalogo elemento) {
    catalogo.add(elemento);
  }

  public void rimuoviElemento(String isbn) {
    catalogo.removeIf(e -> e.getIsbn().equals(isbn));
  }

  public ElementoCatalogo ricercaPerISBN(String isbn) {
    return catalogo.stream()
            .filter(e -> e.getIsbn().equals(isbn))
            .findFirst()
            .orElse(null);
  }

  public List<ElementoCatalogo> ricercaPerAnnoPubblicazione(int anno) {
    return catalogo.stream()
            .filter(e -> e.getAnnoPubblicazione() == anno)
            .collect(Collectors.toList());
  }

  public List<ElementoCatalogo> ricercaPerAutore(String autore) {
    return catalogo.stream()
            .filter(e -> e instanceof Libro && ((Libro) e).getAutore().equals(autore))
            .collect(Collectors.toList());
  }

  public void salvaCatalogoSuDisco(String nomeFile) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFile))) {
      oos.writeObject(catalogo);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @SuppressWarnings("unchecked")
  public void caricaCatalogoDaDisco(String nomeFile) {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeFile))) {
      catalogo = (List<ElementoCatalogo>) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
