import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Tic Tac Toe (Console) ===");
        System.out.print("Enter player 1 name (human): ");
        String p1 = scanner.nextLine().trim();
        if (p1.isEmpty()) p1 = "Player1";
        System.out.print("Enter player 2 name (or 'AI' for computer): ");
        String p2 = scanner.nextLine().trim();
        if (p2.isEmpty()) p2 = "Player2";

        Board board = new Board();
        Player player1 = new HumanPlayer(p1, 'X', scanner);
        Player player2;
        if (p2.equalsIgnoreCase("AI")) player2 = new AIPlayer("Computer", 'O');
        else player2 = new HumanPlayer(p2, 'O', scanner);

        Player current = player1;
        board.display();
        while (true) {
            current.makeMove(board);
            board.display();
            char winner = board.checkWin();
            if (winner != 0) {
                System.out.println("Game over! Winner: " + (winner == player1.getSymbol() ? player1.getName() : player2.getName()) + " (" + winner + ")");
                break;
            } else if (board.isFull()) {
                System.out.println("Game over! It's a draw.");
                break;
            }
            current = (current == player1) ? player2 : player1;
        }

        System.out.println("Thank you for playing.");
        scanner.close();
    }
}
