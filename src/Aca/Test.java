package Aca;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game first = new Game();
        while (first.A != Compare.EQUALLY) {
            int number = in.nextInt();
            first.game(number);

        }
        System.out.println("Step = " + first.step);


    }
}