public class Deck <T extends Card> {
  private ArrayList<T> cards;
  private int dealtIndex = 0;
  
  public int remainingCards() { 
    return cards.size() - dealtIndex;
  }
  
  public void shuffle() {
  }

  public int remainingCards() {
    return cards.size() - dealtIndex;
  }

  public T[] dealHand(int number) {
    // Check Gayle's git repo, or the book for most of these methods
    // I can't see myself getting much out of rote copying these
  }

  public T dealCard() {}

  public void print() {
    for (T card : cards) {
      card.print();
    }
  }
}
