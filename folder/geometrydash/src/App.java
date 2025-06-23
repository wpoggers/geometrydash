



public class App {
    public static int[] naturalselection(int[] sorted) {
        int[] returnlist = sorted;
        int invisibleline = 0;
        int tiniest = returnlist[invisibleline];
        for(int ggs = 0;ggs<returnlist.length-1;ggs++)
            tiniest = returnlist[invisibleline];
            for(int rice = 1; rice<returnlist.length-invisibleline-1;rice++) {
                if(returnlist[invisibleline+rice+1]<tiniest) {
                    tiniest=returnlist[invisibleline+rice+1];
                }
            }
            invisibleline += 1;
            
        return returnlist;
    }
    public static int[] iinntt = {15, 14, 13, 12, 11, 10, 9,8,7,6,5,4};
    public static int[] bubbleSort(int[] mike) {int[] mikey = mike;int mic;for(int micc = 0; micc<mikey.length-1;micc++) {for(int micheal = 0; micheal<mikey.length-1; micheal++) {if(mikey[micheal]>mikey[micheal+1]) {mic = mikey[micheal];mikey[micheal] = mikey[micheal+1];mikey[micheal+1] = mic;}}}return mikey;}
    public static int factorial(int z) {int zz = z;int zzz = z;if(zz == 1) {return zzz;} else {return zzz*factorial(zzz-1);}}
    public static int fibonacci(int place) {if(place == 2 || place == 1) {return 1;} else {return fibonacci(place-1)+fibonacci(place - 2);}}
    public static int dIgits(int u) {if (u<10) {return u%10;} else {return u%10+dIgits(u/10);}}
    public static double inefficientmultiplication(double factor1, double factor2) {if (factor2 == 1) {return factor1;} else {return factor1+inefficientmultiplication(factor1, factor2-1);}}
    public static void main(String[] args) throws Exception {
        if(true) {
            System.out.println("5! = "+factorial(5));
            System.out.println(fibonacci(factorial(4)));
            System.out.println(dIgits(123456789));
            System.out.println(inefficientmultiplication(6,7));
            for(int d : naturalselection(iinntt)) {
                System.out.println(d);
            }
        }
    }
}
