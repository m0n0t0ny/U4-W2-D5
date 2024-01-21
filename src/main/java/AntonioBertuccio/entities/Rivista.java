package AntonioBertuccio.entities;

import java.io.Serializable;

public class Rivista extends ElementoCatalogo implements Serializable {
  private Periodicita periodicita;

  public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
    super(isbn, titolo, annoPubblicazione, numeroPagine);
    this.periodicita = periodicita;
  }

  public Periodicita getPeriodicita() {
    return periodicita;
  }

  @Override
  public String toString() {
    return "Rivista{" +
            "periodicita=" + periodicita +
            ", ISBN='" + getIsbn() + '\'' +
            ", titolo='" + getTitolo() + '\'' +
            ", annoPubblicazione=" + getAnnoPubblicazione() +
            ", numeroPagine=" + getNumeroPagine() +
            '}';
  }
}
