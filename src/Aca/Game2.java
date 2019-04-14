package Aca;

import java.util.Random;
import java.util.Scanner;
public class Game2 {
    int a;

    public Game2(int number) {
        a = number;
    }

    int step = 0;

    void game2() {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt();
        System.out.println(number);
        String S = in.nextLine();
        switch (S) {
            case "less":
                number
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
