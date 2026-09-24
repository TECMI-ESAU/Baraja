public class Card {

    public enum Suit {
        TREBOLES, CORAZONES, PICAS, DIAMANTES
    }

    public enum Color {
        ROJO, NEGRO
    }

    public enum Value {
        DOS("2"), TRES("3"), CUATRO("4"), CINCO("5"), SEIS("6"),
        SIETE("7"), OCHO("8"), NUEVE("9"), DIEZ("10"),
        A("A"), J("J"), Q("Q"), K("K");

        private final String label;

        Value(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    private final Suit suit;
    private final Color color;
    private final Value value;

    public Card(Suit suit, Color color, Value value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return suit + "," + color + "," + value.getLabel();
    }
}
