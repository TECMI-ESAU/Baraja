import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    // Atributo principal: mazo como LinkedList para acceso eficiente a head
    private LinkedList<Card> cards;

    // Atributo secundario: historial de cartas removidas
    private List<Card> discarded;

    public Deck() {
        cards = new LinkedList<>();
        discarded = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        for (Card.Suit suit : Card.Suit.values()) {
            Card.Color color = (suit == Card.Suit.CORAZONES || suit == Card.Suit.DIAMANTES)
                    ? Card.Color.ROJO
                    : Card.Color.NEGRO;

            for (Card.Value value : Card.Value.values()) {
                cards.add(new Card(suit, color, value));
            }
        }
    }

    // a. shuffle: mezcla el deck
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    // b. head: muestra y remueve la primera carta
    public Card head() {
        if (cards.isEmpty()) {
            System.out.println("El deck está vacío.");
            return null;
        }
        Card card = cards.removeFirst();
        discarded.add(card);
        System.out.println(card);
        System.out.println("Quedan " + cards.size());
        return card;
    }

    // c. pick: selecciona y remueve una carta al azar
    public Card pick() {
        if (cards.isEmpty()) {
            System.out.println("El deck está vacío.");
            return null;
        }
        int randomIndex = (int) (Math.random() * cards.size());
        Card card = cards.remove(randomIndex);
        discarded.add(card);
        System.out.println(card);
        System.out.println("Quedan " + cards.size());
        return card;
    }

    // d. hand: regresa y remueve 5 cartas del deck
    public Card[] hand() {
        int handSize = 5;
        if (cards.size() < handSize) {
            System.out.println("No hay suficientes cartas en el deck.");
            return new Card[0];
        }
        Card[] hand = new Card[handSize];
        for (int i = 0; i < handSize; i++) {
            hand[i] = cards.removeFirst();
            discarded.add(hand[i]);
            System.out.println(hand[i]);
        }
        System.out.println("Quedan " + cards.size());
        return hand;
    }

    public int size() {
        return cards.size();
    }
}
