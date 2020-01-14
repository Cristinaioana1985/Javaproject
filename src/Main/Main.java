package Main;

public class Main {
    public static void main(String[] args) {
        int x = sum(2, 3);
        int y = dif(2, 3);
        float z = div(8, 4);
        int w = (5*5);
        int v = (1+2);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println(v);

    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static int dif(int first, int second) {
        int dif = first - second;
        return dif;
    }

    public static float div(float first, float second) {
        float div = first / second;
        return div;
    }

    public static int inmultire (int first, int second) {
        int inmultire = first * second;
        return inmultire;

    }

    public static int test (int first, int second){
        int test = first+second;
        return test;
    }

}


