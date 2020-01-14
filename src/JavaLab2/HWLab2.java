package JavaLab2;

import java.util.jar.JarEntry;

public class HWLab2 {
    public static void main(String[] args) {
        System.out.println("Problema nr. 4");
        String J = "J";
        String A = "A";
        String V = "V";
        System.out.println("   J   A   V     V   A ");
        System.out.println("   J  A A   V   V   A A ");
        System.out.println(" J J AAAAA   V V   AAAAA");
        System.out.println(" JJ  A   A    V    A   A");

        System.out.println("Problema nr. 5");
        int x = average(2, 2, 2);
        System.out.println(x);

        System.out.println("Problema nr. 6");
        System.out.println("  + ''''''''''+");
        System.out.println("( │   O   O   │ )  ");
        System.out.println("  │     ^     │");
        System.out.println("  │   ' _ '   │");
        System.out.println("  │ _ _ _ _ _ │");

        System.out.println("Problema nr. 7");
        float y = div(9, 2);
        System.out.println(y);


    }

    public static int average(int first, int second, int third) {
        int average = (first + second + third) / 3;
        return average;
    }

    public static float div(float first, float second) {
        float div = first / second;
        return div;
    }



}
