import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player player1 = new Player("Player 1", "❌");
        Player player2 = new Player("Player 2", "⭕");

        Player currentPlayer = player1;
        boolean gameOn = true;

        while (gameOn) {
            board.display();
            int[] move = currentPlayer.getMove(scanner);

            if (board.makeMove(move[0], move[1], currentPlayer.getSymbol())) {
                if (board.checkWinner(currentPlayer.getSymbol())) {
                    board.display();
                    System.out.println(currentPlayer.getName() + " wins! 🎉");
                    gameOn = false;
                } else if (board.isFull()) {
                    board.display();
                    System.out.println("It's a draw! 🤝");
                    gameOn = false;
                } else {
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }
            } else {
                System.out.println("Invalid move, try again!");
            }
        }
        scanner.close();
    }
}