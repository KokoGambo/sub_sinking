package main;
import java.util.Scanner;
import java.io.IOException;

public class Game {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        System.out.print("Let's the game begin. How many players do we have?: ");

        int players = in.nextInt();

        System.out.println(players);
        Submarine ESET = new Submarine(players);

    }
}
