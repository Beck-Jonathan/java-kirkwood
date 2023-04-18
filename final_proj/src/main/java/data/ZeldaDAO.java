package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ZeldaDAO {
    private static ArrayList<Zelda_Game> releases;
    private static final String FILEPATH = "final_proj\\src\\main\\resources\\";
    private static final String FILENAME = "zelda_releases";
    private static String header;

    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");


    public static void readData() {
        if (releases == null) {

            try {
                Scanner GameGetter = new Scanner(new File(FILEPATH + FILENAME + ".csv"));
                System.out.println("file found!");
                releases = new ArrayList<>();
                header = GameGetter.nextLine(); // read in first line and don't do anything with it
                while (GameGetter.hasNextLine()) {
                    String line = GameGetter.nextLine();
                    String[] data = line.split(",");

                    Zelda_Game game = new Zelda_Game();


                    game.setName(data[0].toString());
                    game.setMultiplayer(parseBoolean(data[2].toString()));
                    game.setRelease_date(parseInt((data[1].toString())));
                    game.setPlatform(data[3]);
                    game.setDateCompleted(LocalDate.parse(data[5], dateFormat));
                    game.setSecondhand_price(parseDouble((data[4].toString().replace('$', ' '))));
                    releases.add(game);
                    //System.out.println(game.getName());


                }
                Collections.sort(releases);


            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException();
            }
        }
    }

    private static void writeData() {
        try (PrintWriter writer = new PrintWriter(new File(FILEPATH + FILENAME + ".csv"))) {
            writer.print(header + "\n");
            for (Zelda_Game game : releases) {
                writer.printf("%s,%s,%s,%s,%s,%s\n",
                        game.getName(),
                        game.getRelease_year(),
                        Boolean.toString(game.isMultiplayer()).toUpperCase(),
                        game.getPlatform(),
                        ("$" + game.getSecondhand_price()),
                        game.getDateCompleted().format(dateFormat));
            }

        } catch (FileNotFoundException e) {

        }
    }

    public static ArrayList<Zelda_Game> getAllGames() {

        return releases;
    }

    public static ArrayList<Zelda_Game> getGame(String title) {

        return releases;
    }

    public static void addGame(Zelda_Game game) {
        releases.add(game);
        writeData();


    }

    public static void updateGame(Zelda_Game game) {
        releases.remove(game);
        releases.add(game);
        writeData();

    }

    public static void deleteGame(Zelda_Game game) {
        releases.remove(game);
        writeData();


    }

}
