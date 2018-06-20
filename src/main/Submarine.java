package main;
import java.util.Scanner;


public class Submarine {
    Scanner in = new Scanner(System.in);
    private int breathe [] = new int [23];
    static int waterWayDown [][] = new int [3][7];
    static Player [] Participents;

    Submarine(int s){
        Participents = new Player[s];
        System.out.println("Ok we have "+ s +" participants.");
        for(int i=0; i<s; i++)
        {
            System.out.println("Tell me who will be the "+ (i+1));
            Participents[i].name = in.nextLine();

        }
    }

}


