package Tasks;

import data.ZeldaDAO;
import data.Zelda_Game;
import utilities.Helpers;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Find implements TaskHandler {

    @Override
    public void handleTask(Scanner scanner) {
        ArrayList<Zelda_Game> games = ZeldaDAO.getAllGames();
        ArrayList <Zelda_Game> copy = Helpers.cloneList(games);
        System.out.println("** find menu **");

        String search = UserInput.getString(scanner, "Enter the game's title");
        copy.removeIf((Zelda_Game -> !Zelda_Game.getName().contains(search)));
        if (copy.size()>0) {
            Helpers.PrintTableHeaderRow();
            for (Zelda_Game game : copy) {
                Helpers.PrintObjectAsTableRow(game);
            }
        } else {
            System.out.println("Your search has no results");
        }

    }

}
