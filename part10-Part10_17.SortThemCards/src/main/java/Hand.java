
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class Hand implements Comparable<Hand> {
    private final List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    public void add(Card card) {
        if(card != null) {
            this.cards.add(card);
        }
    }
    
    public void print() {
        this.cards.forEach(c -> System.out.println(c));
    }
    
    public void sort() {
        this.cards.sort(Comparator
                .comparing(Card::getValue)
                .thenComparing(c -> c.getSuit().ordinal()));
    }
    
    public void sortBySuit() {
        this.cards.sort(new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        return this.sum() - hand.sum();
    }
    
    private int sum() {
        return this.cards
                .stream()
                .mapToInt(Card::getValue)
                .sum();
    }
}
