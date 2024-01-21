package AntonioBertuccio.entities;

import java.io.Serializable;

public class Libro extends ElementoCatalogo implements Serializable {
  private String autore;

  public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore) {
    super(isbn, titolo, annoPubblicazione, numeroPagine);
    this.autore = autore;
  }

  public String getAutore() {
    return autore;
  }

  @Override
  public String toString() {
    return "Libro{" +
            "autore='" + autore + '\'' +
            ", ISBN='" + getIsbn() + '\'' +
            ", titolo='" + getTitolo() + '\'' +
            ", annoPubblicazione=" + getAnnoPubblicazione() +
            ", numeroPagine=" + getNumeroPagine() +
            '}';
  }
}

