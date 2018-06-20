package main;
import java.util.Scanner;
import java.util.Random;

public class Submarine {
    Scanner in = new Scanner(System.in);
    private int breathe [] = new int [23];
    static int waterWayDown [][] = new int [4][8];


    void gameWay(int s, int i)
    {
       int move=Participents[i].currentPosition + s;



    }

    static Player [] Participents;

    Submarine(int s){
        Random rand = new Random();
        Participents = new Player[s];
        System.out.println("Ok we have "+ s +" participants.");
        for(int i=0; i<s; i++)
        {
            System.out.println("Tell me who will be the "+ (i+1));
            Participents[i].name = in.nextLine();

        }
        for(int i=0 ; i<4; i++) {
            for (int j = 0; j < 8; j++) {
                switch (i) {
                    case 0:
                        waterWayDown[i][j] = rand.nextInt(6) + 2;
                        break;
                    case 1:
                        waterWayDown[i][j] = rand.nextInt(12) + 6;
                        break;
                    case 2:
                        waterWayDown[i][j] = rand.nextInt(16) + 10;
                        break;
                    case 3:
                        waterWayDown[i][j] = rand.nextInt(19) + 14;
                        break;
                }
            }
        }

    }

}


