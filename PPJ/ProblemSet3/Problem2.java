public class Problem2 {
    public static void main(String[] args) {
        int suit = (int)(Math.random() * 4) + 1;
        int rank = (int)(Math.random() * 13) + 2;

        String suitName = switch(suit) {
            case 1 -> "Clubs";
            case 2 -> "Hearts";
            case 3 -> "Diamonds";
            case 4 -> "Spades";
            default -> "Unknown";
        };

        String rankName = switch(rank) {
            case 11 -> "jack";
            case 12 -> "queen";
            case 13 -> "king";
            case 14 -> "Ace";
            default -> String.valueOf(rank);
        };

        System.out.println("Your card is " + rankName + " of " + suitName);
    }
}