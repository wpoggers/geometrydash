
import java.util.Scanner;



public class App {
    public static class sort {
        public static int[] naturalselection(int[] sorted) {
            int[] returnlist = sorted;
            int swap;
            int invisibleline = 0;
            int tiniest;
            for(int ggs = 0;ggs<returnlist.length-1;ggs++) {
                tiniest = returnlist[invisibleline];
                for(int rice = invisibleline; rice < returnlist.length-1; rice++) {
                    if(returnlist[rice+1]<tiniest) {
                        swap = tiniest;
                        tiniest=returnlist[rice+1];
                        returnlist[rice+1] = swap;
                    }
                }
                returnlist[invisibleline] = tiniest;
                invisibleline += 1;
            }            
            return returnlist;
        }
        public static int[] iinntt = {15, 14, 13, 12, 11, 10, 9,8,7,6,5,4};
        public static int[] bubbleSort(int[] mike) {
            int[] mikey = mike;
            int mic;
            for(int micc = 0; micc<mikey.length-1;micc++) {
                for(int micheal = 0; micheal<mikey.length-1; micheal++) {
                    if(mikey[micheal]>mikey[micheal+1]) {
                        mic = mikey[micheal];mikey[micheal] = mikey[micheal+1];mikey[micheal+1] = mic;
                    }
                }
            }
            return mikey;
        }
    }
    public static class recursion {
        public static int factorial(int z) {int zz = z;int zzz = z;if(zz == 1) {return zzz;} else {return zzz*factorial(zzz-1);}}
        public static int fibonacci(int place) {if(place == 2 || place == 1) {return 1;} else {return fibonacci(place-1)+fibonacci(place - 2);}}
        public static int dIgits(int u) {if (u<10) {return u%10;} else {return u%10+dIgits(u/10);}}
        public static double inefficientmultiplication(double factor1, double factor2) {if (factor2 == 1) {return factor1;} else {return factor1+inefficientmultiplication(factor1, factor2-1);}}
    }
    public static Cards card = new Cards("Spades", 1);
    public static Deck letsplaypoker = new Deck();
    public static void playCrazy8(Cards[] deck) {
        int skibidi;
        int playerchoice;
        Cards[] playerdeck = new Cards[7];
        Cards[] botsdeck = new Cards[7];
        Cards firstcard = deck[15];
        Scanner scanscan = new Scanner(System.in);
        boolean gamestillon = true;
        while(gamestillon) {
            skibidi = 1;
            System.out.println("Players turn. your cards are:");
            for(Cards hack : playerdeck) {
                System.out.println(skibidi + ". " + hack);
                skibidi++;
            }
            System.out.println("the first card is:"+firstcard);
            System.out.print("Select ur card(choose an number larger than 7 if u cant use any of ur cards): ");
            playerchoice = Integer.parseInt(scanscan.nextLine());
            if(playerchoice > 7) {
                playerchoice = 7;
            }
            if(playerdeck[playerchoice].getPower()==firstcard.getPower() ||playerdeck[playerchoice].getSuite()==firstcard.getSuite());
        }
    }
    public static void main(String[] args) throws Exception {
        if(true) {
            System.out.println("5! = "+recursion.factorial(5));
            System.out.println(recursion.fibonacci(recursion.factorial(4)));
            System.out.println(recursion.dIgits(123456789));
            System.out.println(recursion.inefficientmultiplication(6,7));
            for(int d : sort.naturalselection(sort.iinntt)) {System.out.println(d);}
            System.out.println(card);
            letsplaypoker.shuffle();
            System.out.println(letsplaypoker);
        }
    }
}
