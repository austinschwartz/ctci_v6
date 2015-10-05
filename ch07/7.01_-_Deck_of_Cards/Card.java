public abstract class Card {
  private boolean available = true;
  protected in faceValue;
  protected Suit suit;
  
  public Card(int c, Suit s) {
    faceValue = c;
    suit = s;
  }

  public abstract int value();
  public Suit suite() { return suit; }

  public boolean isAvailable() { return available; }
  public void mark(boolean a) { available = a; }
}
