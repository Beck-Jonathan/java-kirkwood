package Tasks;

import data.ZeldaDAO;
import data.Zelda_Game;
import utilities.UserInput;

import java.time.LocalDate;
import java.util.Scanner;


import static utilities.UserInput.getDouble;
import static utilities.UserInput.getString;

public class Add implements TaskHandler {
    @Override
    public void handleTask(Scanner banana) {
        Zelda_Game game = new Zelda_Game();
        String title = getString(banana, "Enter the games ' title");
        game.setName(title);

        LocalDate completionDate = UserInput.getDate(banana,"When did you beat this game?");
        game.setDateCompleted(completionDate);

        String platform = getString(banana,"What system is this for?");
        game.setPlatform(platform);



        Boolean isMultiplayer = UserInput.getBoolean(banana,"Is this game multiplayer?");
        game.setMultiplayer(isMultiplayer);

        int release_year = UserInput.getInt(banana,"What is the release year?",1980,2025);
        game.setRelease_date(release_year);

        Double secondhand_price = getDouble(banana, "What is the secondhand price",0d);
        game.setSecondhand_price(secondhand_price);
        ZeldaDAO.addGame(game);
    }
}
