package AntonioBertuccio.entities;

import java.io.Serializable;

public class ElementoCatalogo implements Serializable {
  private String isbn;
  private String titolo;
  private int annoPubblicazione;
  private int numeroPagine;

  public ElementoCatalogo(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
    this.isbn = isbn;
    this.titolo = titolo;
    this.annoPubblicazione = annoPubblicazione;
    this.numeroPagine = numeroPagine;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitolo() {
    return titolo;
  }

  public int getAnnoPubblicazione() {
    return annoPubblicazione;
  }

  public int getNumeroPagine() {
    return numeroPagine;
  }

  @Override
  public String toString() {
    return "ElementoCatalogo{" +
            "isbn='" + isbn + '\'' +
            ", titolo='" + titolo + '\'' +
            ", annoPubblicazione=" + annoPubblicazione +
            ", numeroPagine=" + numeroPagine +
            '}';
  }
}

