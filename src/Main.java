public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("=== Deck creado con " + deck.size() + " cartas ===\n");

        // shuffle
        deck.shuffle();
        System.out.println();

        // head
        System.out.println("--- head() ---");
        deck.head();
        System.out.println();

        // pick
        System.out.println("--- pick() ---");
        deck.pick();
        System.out.println();

        // hand
        System.out.println("--- hand() ---");
        deck.hand();
    }
}
