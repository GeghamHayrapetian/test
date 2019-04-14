package Aca;

import java.util.Random;

public class Game {
    Compare A;
    int a;

    public Game() {
        Random rand = new Random();
        a = rand.nextInt(20);
    }

    int step = 0;

    void game(int number) {
        if (a > number)
            A = Compare.MORE;
        if (a < number)
            A = Compare.LESS;
        if (a == number)
            A = Compare.EQUALLY;
        switch (A) {
            case LESS:
                System.out.println("LESS");
                ++step;
                break;
            case MORE:
                System.out.println("MORE");
                ++step;
                break;
            case EQUALLY:
                System.out.println("EQUALLY");
                ++step;
                break;
            default:
                break;

        }
    }

}
