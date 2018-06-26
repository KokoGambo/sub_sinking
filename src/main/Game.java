package main;
import java.util.Scanner;
import java.io.IOException;
import java.lang.String;

public class Game {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        System.out.print("Let's the game begin. How many players do we have?: ");

        int players = in.nextInt();

        Submarine ESET = new Submarine(players);

        System.out.println("Let's the battle begin! ");

        for(int c=0; c<players;c++) {

            System.out.println(ESET.Participents[c].name + "'s move!");
            int bones= ESET.Participents[c].dropBones();
            System.out.println("TEST: BONES of "+ ESET.Participents[c].name + "   " + bones);

            System.out.println(ESET.Participents[c].name+", where are you going to?");

            String choice = in.next();

            if (choice=="Up")
            ESET.gameWayUp(bones,c,players);
            else
            ESET.gameWayDown(bones,c,players);

        }
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(ESET.waterWayDown[i][j] + "\t");
                //if (j==0) System.out.println();
            }
            System.out.println();
        }


    }
}
