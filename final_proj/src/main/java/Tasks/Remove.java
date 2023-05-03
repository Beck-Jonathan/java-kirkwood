package Tasks;

import data.ZeldaDAO;
import data.Zelda_Game;
import utilities.Helpers;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

import static utilities.Helpers.PressEnterToContinue;

public class Remove implements TaskHandler {
    ArrayList<Zelda_Game> games = ZeldaDAO.getAllGames();
    String gametodelete = " ";
    @Override
    public void handleTask(Scanner banana) {
        ArrayList<Zelda_Game> copy = Helpers.cloneList(games);
        while(!copy.isEmpty()&&copy.size()!=1) {
             copy = Helpers.cloneList(games);
            System.out.println("** find menu **");

            String search = UserInput.getString(banana, "Enter the game's title, or 00 to exit");
            if (search.equals("00")){break;}
            copy.removeIf((Zelda_Game -> !Zelda_Game.getName().toUpperCase().contains(search.toUpperCase())));
            if (copy.size() > 0) {
                Helpers.PrintTableHeaderRow();
                for (Zelda_Game game : copy) {
                    Helpers.PrintObjectAsTableRow(game);
                }
            } else {
                System.out.println("Your search has no results");
            }
            gametodelete = copy.get(0).getName();
        }

        boolean decision = UserInput.getBoolean(banana,"Are you sure you want to delete " + gametodelete);
        if (decision) {
            for (Zelda_Game game : games) {
                if (game.getName().equals(gametodelete)) {
                    games.remove(game);
                    break;
                }

            }
        }
        ZeldaDAO.deleteGame(games);
        System.out.println("Successful deletion of" + gametodelete);
        PressEnterToContinue(banana);

    }
}