package main;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Player {
    String name = new String();
     int bones;
    public int currentPosition;
    boolean decision;
    ArrayList<Integer> myTreasure= new ArrayList<>();
     int dropBones()
    {
        Random rand = new Random();
        int  i = rand.nextInt(5)+2;
        bones=i;
        return i;
    }



}
