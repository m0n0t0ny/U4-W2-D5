package AntonioBertuccio.entities;

public enum Periodicita {
  SETTIMANALE("Settimanale"),
  MENSILE("Mensile"),
  SEMESTRALE("Semestrale");

  private final String value;

  Periodicita(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }
}
