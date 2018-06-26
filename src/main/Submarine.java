package main;
import java.util.Scanner;
import java.util.Random;


public class Submarine {
    Scanner in = new Scanner(System.in);
    int waterWayDown [][] = new int [4][8];

    int breathe=24;

    void gameWayDown(int s, int i, int p)
    {
       int move,count,length;

       if (Participents[i].myTreasure.contains(true))
       {
          count=Participents[i].myTreasure.size();
          breathe-=count;
       }

       Participents[i].currentPosition+=s;

       for(int q=0; q<p;q++) {
           if (q==i) continue;
           if (Participents[i].currentPosition ==Participents[q].currentPosition)
               Participents[i].currentPosition++;
       }

       move=Participents[i].currentPosition;
       int treasure=waterWayDown [move/8][move%8];

       System.out.println("What is your decision, Skip, Pick or Return your treasure?");

       String temp=in.next();
       switch (temp) {
           case "Skip":
               waterWayDown[move / 8][move % 8] = 1;
               break;
           case "Pick":
               if (waterWayDown[move / 8][move % 8] != 100) {
                   Participents[i].decision = true;
                   waterWayDown[move / 8][move % 8] = 100;
                   Participents[i].myTreasure.add(treasure);
                   break;
               } else {
                   System.out.println("Sorry, someone already picked this for you :(");
                   break;
               }
           case "Return":
               if (waterWayDown[move / 8][move % 8] == 100 && Participents[i].myTreasure.contains(true))
               {   length = Participents[i].myTreasure.size();
                   Participents[i].myTreasure.remove(length);
                   break;}
               else System.out.println("You can't return anything :("); break;
       }



    }

    void gameWayUp(int s,int i,int p)
    {
        int move,count,length;
        if (Participents[i].myTreasure.contains(true))
        {
            count=Participents[i].myTreasure.size();
            breathe-=count;
        }

        Participents[i].currentPosition-=s;

        if (Participents[i].currentPosition>0)
        for(int q=0; q<p;q++)
        {
            if (q==i) continue;
            if (Participents[i].currentPosition==Participents[q].currentPosition)
                Participents[i].currentPosition--;
        }
        else System.out.println("Congratulations! You are on a accord.");

        move=Participents[i].currentPosition;
        int treasure=waterWayDown [move/8][move%8];

        String temp=in.nextLine();
        switch (temp) {
            case "Skip":
                waterWayDown[move / 8][move % 8] = 1;
                break;
            case "Pick":
                if (waterWayDown[move / 8][move % 8] != 100) {
                    Participents[i].decision = true;
                    waterWayDown[move / 8][move % 8] = 100;
                    Participents[i].myTreasure.add(treasure);
                    break;
                } else {
                    System.out.println("Sorry, someone already picked this for you :(");
                    break;
                }
            case "Return":
                if (waterWayDown[move / 8][move % 8] == 100 && Participents[i].myTreasure.contains(true))
                {   length = Participents[i].myTreasure.size();
                    Participents[i].myTreasure.remove(length);
                    break;}
                else {System.out.println("You can't return anything :("); break;}
        }
    }
    Player [] Participents;

    Submarine(int s){
        Random rand = new Random();
        Participents = new Player[s];

        System.out.println("Ok we have "+ s +" participants.");

        for(int i=0; i<s; i++)
        {
            Participents[i]= new Player();
            System.out.println("Tell me who will be the "+ (i+1));
            Participents[i].name = in.next();
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


