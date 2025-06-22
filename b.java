import java.util.Scanner;
public class b {
    public static double QuadraticFormula(int a, int b, int c, int answer) {
        float aa=(b*-1);
            float discriminant=(b*b-4*a*c);
            float twoA = 2*a;
            double answer1 = (aa+Math.sqrt(discriminant))/twoA;
            double answer2 = (aa-Math.sqrt(discriminant))/twoA;
        double returnn = 0;
        if(answer == 1) {
            returnn = answer1;
        }
        if(answer == 2) {
            returnn = answer2;
        }
        return returnn;
    }
    public static void main(String[] args) {
        int max_questions = 5;
        int tracker = 0;
        while(tracker<max_questions) {
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            int c = new Scanner(System.in).nextInt();
            System.out.println("x="+QuadraticFormula(a, b, c, 1));
            System.out.println("x="+QuadraticFormula(a, b, c, 2));
            tracker += 1;
        }
        // for(int d = 4; d>0; d--) {
        //     for(int e = 4; e>0; e--) {
        //         System.out.print("0");
        //     }
        //     System.out.println("");
        // }
        // for(int f = 1; f<6; f++) {
        //     for(int g = 0; g<f; g++) {
        //         System.out.print("0");
        //     }
        //     System.out.println("");
        // }
        // int listlength = new Scanner(System.in).nextInt();
        // String[] shop_list = new String[listlength];
        // Scanner scann = new Scanner(System.in);
        // for(int h = 0; h<listlength; h++) {
        //     String item = scann.nextLine();
        //     shop_list[h] = item;
        // }
    }
}