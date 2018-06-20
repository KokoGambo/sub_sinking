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

        System.out.println("Let's the battle begin! ");
        for(int c=0; c<players;c++) {

            System.out.println(ESET.Participents[c].name + "'s move!");
            int bones= ESET.Participents[c].dropBones();
            ESET.gameWay(bones,c);

            for(int i=0 ; i<4; i++)
                for (int j=0; j<8; j++)
                {

                }



        }

    }
}
