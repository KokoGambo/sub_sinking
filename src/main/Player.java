package main;
import java.util.Random;

public class Player {
    static String name;
    static int bones;
    public static int currentPosition;

    int dropBones()
    {
        Random rand = new Random();
        int  i = rand.nextInt(6)+2;
        bones=i;
        return i;
    }

        int move (int currentPosition)
    {
        return currentPosition+dropBones();
    }

}
