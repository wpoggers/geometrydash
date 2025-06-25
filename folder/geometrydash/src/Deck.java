import java.util.Random;

public class Deck {
    
    private Cards[] deck;
    private String c = "";
    private int kard = 0;
    private String[] suites = {"Spades", "Hearts", "Cloves", "Diamonds"};
    public Deck(){
        deck = new Cards[52];
        for(String a : suites) {
            for(int b = 1; b<14; b++) {
                deck[kard] = new Cards(a, b);
                kard++;
            }
        }
    }
    public String toString() {
        for(Cards d : deck) {
            c += d+"\n";
        }
        return c;
    }
    public Cards draw() {
        Cards[] revisedList = new Cards[deck.length];
        for(int f = 1; f<52; f++) {
            revisedList[f-1] = deck[f];
        }
        deck = revisedList;
        Cards e = deck[0];
        
        return e;
    }
    public void shuffle() {
        Cards placeholder;
        int grandom;
        Random modnar = new Random();
        for(int ii = 51; ii>0; ii--) {
            grandom = modnar.nextInt(ii);
            placeholder = deck[grandom];
            deck[grandom] = deck[ii];
            deck[ii] = placeholder;
        } 
    }
    public void convertdeck(Cards[] newdeck) {
        this.deck = newdeck;
    }
}
