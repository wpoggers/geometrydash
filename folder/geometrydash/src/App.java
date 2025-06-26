
import java.util.ArrayList;
import java.util.Scanner;
public final class App {
    public static class sort {
        public static double[] naturalselection(double[] sorted) {
            double[] returnlist = sorted;
            double swap;
            int invisibleline = 0;
            double tiniest;
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

    public static void playCrazy8(Deck deck) {
        int hiue = 0;
        int vsause;
        boolean doCrazy8Turn = false;
        boolean doNormalTurn = true;
        double[] numsuite = {0, 0, 0, 0};
        String response;
        Cards llllava;
        int cardsleftPlayer = 7;
        int cardsleftBot = 7;
        Cards[] deckReshuffle = new Cards[52];
        int usedcards = 0;
        int skibidi;
        int playerchoice;
        ArrayList<Cards> playerdeck = new ArrayList<Cards>();
        ArrayList<Cards> botsdeck = new ArrayList<Cards>();
        Cards firstcard = deck.draw();
        deckReshuffle[usedcards] = firstcard;
        usedcards++;
        Scanner scanscan = new Scanner(System.in);
        boolean gamestillon = true;
        for(int f5 = 0; f5<7; f5++) {
            playerdeck.add(deck.draw());
            botsdeck.add(deck.draw());
        }
        while(gamestillon) {
            //player turn
            int iteration = 0;
            skibidi = 1;
            System.out.println("Players turn. your cards are:");
            for(int aa = 0; aa<playerdeck.size(); aa++) {
                System.out.println(skibidi + ". " + playerdeck.get(aa));
                skibidi++;
            }
            System.out.println("the card is:"+firstcard);
            System.out.print("Select ur card(Say \"draw\" if u cant use any of ur cards): ");
            response = scanscan.nextLine();
            if(response.length()>3) {
                playerdeck.add(deck.draw());
                cardsleftPlayer++;
            } else {
                playerchoice = Integer.parseInt(response) - 1;

                if(Integer.parseInt((playerdeck.get(playerchoice).getPowerAsInt())+"")==8) {
                    doNormalTurn = 0==1;
                    playerdeck.remove(playerchoice);
                    cardsleftPlayer--;
                    System.out.println("Select a suit(1 = Spades, 2 = Hearts, 3 = Cloves, 4 = Diamonds)");
                    int choosesuit = Integer.parseInt(scanscan.nextLine());
                    if(choosesuit%4 == 1) {
                        firstcard.setSuite("Spades");
                    } else if(choosesuit%4 == 2) {
                        firstcard.setSuite("Hearts");
                    } else if(choosesuit%4 == 3) {
                        firstcard.setSuite("Cloves");
                    } else if(choosesuit%4 == 0) {
                        firstcard.setSuite("Diamonds");
                    }
                }
                if(doNormalTurn) {
                    if(playerdeck.get(playerchoice).getPower().equals(firstcard.getPower()) || playerdeck.get(playerchoice).getSuite().equals(firstcard.getSuite())) {
                    firstcard = playerdeck.get(playerchoice);
                    deckReshuffle[usedcards] = firstcard;
                    llllava = playerdeck.get(playerchoice);
                    playerdeck.remove(playerchoice);
                    firstcard = llllava;
                    cardsleftPlayer--;
                    usedcards++;
                    } else {
                        System.out.println("u cant do that");
                    }
                }
            }
            doNormalTurn = true;
            /*bot turn*/
            iteration = 0;
            boolean botcanmove = false;
            /*Crazy 8 check*/
            for(Cards jpop : botsdeck) {
                if(jpop.getPower().equals("8")) {
                    doCrazy8Turn = true;
                    numsuite[0] = 0; numsuite[1] = 0.1; numsuite[2] = 0.2; numsuite[3] = 0.3;
                    botcanmove=true;
                    for(Cards g : botsdeck) {
                        if(g.getSuite().equals("Spades")) {
                            numsuite[0]++;
                        } else if(g.getSuite().equals("Hearts")) {
                            numsuite[1]++;
                        } else if(g.getSuite().equals("Cloves")) {
                            numsuite[2]++;
                        } else if(g.getSuite().equals("Diamonds")) {
                            numsuite[3]++;
                        }
                    }
                    botsdeck.remove(hiue);
                    break;
                }
                hiue++;
            }
            int h = 0;
            if(doCrazy8Turn) {
                numsuite = sort.naturalselection(numsuite);
                vsause = (int) numsuite[3];
                h = (int) ((int) 10*(numsuite[3]-vsause));
                if(h == 0) {firstcard.setSuite("Spades");
                } else if(h==1) {firstcard.setSuite("Hearts");
                } else if(h==2) {firstcard.setSuite("Cloves");
                } else if(h==3) {firstcard.setSuite("Diamonds");}
                
            }
            if(!botcanmove) {
                for(Cards kpop : botsdeck){
                    if(kpop.getSuite().equals(firstcard.getSuite())||kpop.getPower().equals(firstcard.getPower())) {
                        firstcard = kpop;
                        botsdeck.remove(iteration);
                        botcanmove=10!=11;
                        cardsleftBot--;
                        iteration++;
                        break;
                    }
                }
            }
            if(!botcanmove) {
                cardsleftBot++;
                botsdeck.add(deck.draw());
            }
            if(cardsleftBot==0) {
                gamestillon = 10==11;
                System.out.println("Game Over, Bot wins");
            }
            if(cardsleftPlayer==0) {
                gamestillon = 9+10==21;
                System.out.println("Game Over, you win!!!");
            }
            System.out.println("bot has "+cardsleftBot+ " cards left");
        }
    }
    public static void main(String[] args) throws Exception {
        if(true) {
            // System.out.println("5! = "+recursion.factorial(5));
            // System.out.println(recursion.fibonacci(recursion.factorial(4)));
            // System.out.println(recursion.dIgits(123456789));
            // System.out.println(recursion.inefficientmultiplication(6,7));
            // for(int d : sort.naturalselection(sort.iinntt)) {System.out.println(d);}
            // System.out.println(card);
            // letsplaypoker.shuffle();
            // System.out.println(letsplaypoker);
            letsplaypoker.shuffle();
            playCrazy8(letsplaypoker);
        }
    }
}
