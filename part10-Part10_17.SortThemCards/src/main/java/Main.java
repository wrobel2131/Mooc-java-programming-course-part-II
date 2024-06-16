

public class Main {

    public static void main(String[] args) {
        // test your code here

        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);
        Card fourth = new Card(12, Suit.CLUB);


        System.out.println(first.getSuit().ordinal());
        System.out.println(second.getSuit().ordinal());
        System.out.println(third.getSuit().ordinal());
        System.out.println(fourth.getSuit().ordinal());
        System.out.println(third.compareTo(fourth));
    }
}
