package Aca;

public class Integ {
    int k;

    Integ(int k) {
        this.k = k;
    }

   public static void swape(Integ A, Integ B) {
        int a = A.k;
        A.k = B.k;
        B.k = a;

    }

}
