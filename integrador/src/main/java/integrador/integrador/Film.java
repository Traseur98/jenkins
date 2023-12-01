package integrador.integrador;

public class Film {

  private String title;
  private Integer spectators, rooms;
  private Double incomings, netIncomings;

  public Film(
    Integer spectators,
    Integer rooms,
    Double incomings,
    String title
  ) {
    super();
    this.title = title;
    this.spectators = spectators;
    this.rooms = rooms;
    this.incomings = incomings;
  }

  public Integer getSpectators() {
    return spectators;
  }

  public void setSpectators(Integer spectators) {
    this.spectators = spectators;
  }

  public Integer getRooms() {
    return rooms;
  }

  public void setRooms(Integer rooms) {
    this.rooms = rooms;
  }

  public Double getIncomings() {
    return incomings;
  }

  public void setIncomings(Double incomings) {
    this.incomings = incomings;
  }

  public Double getNetIncomings() {
    return 0.8 * incomings;
  }

  public void setNetIncomings(Double netIncomings) {
    this.netIncomings = netIncomings;
  }

  @Override
  public String toString() {
    return (
      "Film [spectators=" +
      spectators +
      ", rooms=" +
      rooms +
      ", incomings=" +
      incomings +
      ", netIncomings=" +
      getNetIncomings() +
      "]"
    );
  }
}
