package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ZeldaDAO {
    private static ArrayList<Zelda_Game> releases;


    public static void readData() {
        if (releases == null) {
            try {
                Scanner GameGetter = new Scanner(new File("C:\\Users\\jjbec\\Downloads\\CodeGymTasks\\" +
                        "final_proj\\src\\resources\\zelda_releases.csv"));
                System.out.println("file found!");
                releases = new ArrayList<>();
                GameGetter.nextLine(); // read in first line and don't do anything with it
                while (GameGetter.hasNextLine()) {
                    String line = GameGetter.nextLine();
                    String[] data = line.split(",");

                    Zelda_Game game = new Zelda_Game();
                    game.setName(data[0]);
                    System.out.println(game.getName());


                }

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }
        }
    }

    public static ArrayList<Zelda_Game> getAllGames(){

        return null;
    }

    public static ArrayList<Zelda_Game> getGame(String title) {

        return releases;
    }

    public static void  addGame(Zelda_Game game){


    }
    public static void updateGame (Zelda_Game game){


    }

    public static void deleteGame (Zelda_Game game){


    }

}
