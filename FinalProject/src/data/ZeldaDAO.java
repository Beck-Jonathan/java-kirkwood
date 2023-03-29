package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ZeldaDAO {
    private static ArrayList<Zelda_Game> releases;


    public static void readData()  {
        try {
            Scanner GameGetter = new Scanner(new File(""));

        } catch (FileNotFoundException e){
            System.out.println("file not found");
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Zelda_Game> getAllGames(){

        return null;
    }

    public static Zelda_Game getGame(String title) {

        return null;
    }

    public static void  addGame(Zelda_Game game){


    }
    public static void updateGame (Zelda_Game game){


    }

    public static void deleteGame (Zelda_Game game){


    }

}
