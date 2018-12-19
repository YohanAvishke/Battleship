package Components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private String id;
    private int size;
    private boolean running;//to flag the time to make a winner
    private Map<String, Block> blocks = new HashMap<>();
    private Map<String, Block> ships = new HashMap<>();
    private List<Player> players = new ArrayList<>();

    private Board(String id, int size) {
        this.id = id;
        this.size = size;
    }

    public void start(boolean running) {
        this.running = running;
        System.out.println("Loading...");
        if (running) {
            int boardLength = (int) Math.sqrt(size);
            char letter = 'A';
            char[] letters = new char[boardLength];
            //insert letters
            for (int j = 0; j < letters.length; j++) {
                letters[j] = letter;
                letter++;
            }
            createBlocks(boardLength, letters);
        }
    }

    private void createBlocks(int boardLength, char[] letters) {
        int numShips;
        //generate blocks
        System.out.println("Discovering new lands...");
        for (int j = 0; j < letters.length; j++) {
            for (int i = 0; i < boardLength; i++) {
                Block block = new Block(letters[j] + String.valueOf((i + 1)), false);
                blocks.put(block.getId(), block);
            }
        }
        numShips = (size * 30) / 100;
        createShips(numShips, boardLength, letters);
    }

    private void createShips(int numShips, int boardLength, char[] letters) {
        //generate ships
        System.out.println("Alert enemy approaching...");
        for (int i = 0; i < numShips; i++) {
            char letter = letters[(int) (Math.ceil(Math.random() * boardLength) - 1)];
            String number = String.valueOf((int) Math.ceil(Math.random() * boardLength));
            String shipName = letter + number;
            blocks.get(shipName).setAShip(true);
        }
    }
}
