package Tasks;

import data.ZeldaDAO;
import data.Zelda_Game;
import utilities.Helpers;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static utilities.Helpers.PressEnterToContinue;
import static utilities.UserInput.getDouble;
import static utilities.UserInput.getString;

public class Update implements TaskHandler {
    ArrayList<Zelda_Game> games = ZeldaDAO.getAllGames();
    String gametoupdate = " ";

    @Override
    public void handleTask(Scanner banana) {
        ArrayList<Zelda_Game> copy = Helpers.cloneList(games);
        while (!copy.isEmpty() && copy.size() != 1) {
            copy = Helpers.cloneList(games);
            System.out.println("** update menu **");

            String search = UserInput.getString(banana, "Enter the game's title, or 00 to exit");
            if (search.equals("00")) {
                break;
            }
            copy.removeIf((Zelda_Game -> !Zelda_Game.getName().toUpperCase().contains(search.toUpperCase())));
            if (copy.size() > 0) {
                Helpers.PrintTableHeaderRow();
                for (Zelda_Game game : copy) {
                    Helpers.PrintObjectAsTableRow(game);
                }
            } else {
                System.out.println("Your search has no results");
            }
            gametoupdate = copy.get(0).getName();
        }
        boolean decision = UserInput.getBoolean(banana, "Do you want to update " + gametoupdate);
        if (decision) {

            String title = getString(banana, "Enter the games ' title, currently it is " + copy.get(0).getName());
            copy.get(0).setName(title);

            LocalDate completionDate = UserInput.getDate(banana, "When did you beat this game?" +
                    "This is currently stored as " + copy.get(0).getDateCompleted());
            copy.get(0).setDateCompleted(completionDate);

            String platform = getString(banana, "What system is this for?" +
                    "This is currently stored as" + copy.get(0).getPlatform());
            copy.get(0).setPlatform(platform);

            Double secondhandPrice = getDouble(banana, "what ist he secondhand price" +
                    "This is currently stored as " + copy.get(0).getSecondhand_price());
            copy.get(0).setSecondhand_price(secondhandPrice);

            Boolean isMultiplayer = UserInput.getBoolean(banana, "Is this game multiplayer?" +
                    "currently this is stored as " + copy.get(0).getSecondhand_price());
            copy.get(0).setMultiplayer(isMultiplayer);

            int release_year = UserInput.getInt(banana, "What is the release year" +
                    "? Currently this is stored as" + copy.get(0).getRelease_year(), 1980, 2025);
            copy.get(0).setRelease_date(release_year);

            for (Zelda_Game game : games) {
                if (game.getName().equals(gametoupdate)) {
                    games.remove(game);
                    break;
                }

            }

            ZeldaDAO.addGame(copy.get(0));


        }
        System.out.println("update successful");

        PressEnterToContinue(banana);
    }
}
