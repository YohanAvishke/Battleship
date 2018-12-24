package Components;

import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    char c;

    public void start(){
        System.out.print("-==BATTLESHIP==-\n" +
                "Start New Game(y/n): ");
        c = input.next().toLowerCase().charAt(0);
        if (c == 'y'){
            Board board = Board.getInstance("001",25);
            board.start(true);
        }else {
           System.out.print("Game Over");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
