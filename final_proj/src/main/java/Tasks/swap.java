package Tasks;

import data.ZeldaDAO;
import data.Zelda_Game;
import utilities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;


import static javax.swing.UIManager.getInt;


public class swap implements TaskHandler{


    @Override
    public void handleTask(Scanner scanner) {
        ArrayList<Zelda_Game> games = ZeldaDAO.getAllGames();
        System.out.println("What is the index of the first game to swap?");
        int x = getInt(scanner);
        System.out.println("What is the index of the second game to swap?");
        int y = getInt(scanner);
        Zelda_Game placeholder = games.get(x);
        games.set(x, games.get(y));
        games.set(y,placeholder);


    }
}
