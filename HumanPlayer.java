import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name, char symbol, Scanner scanner) {
        super(name, symbol);
        this.scanner = scanner;
    }

    @Override
    public void makeMove(Board board) {
        int pos = -1;
        while (true) {
            System.out.print(getName() + " (" + getSymbol() + "), enter position (1-9): ");
            String line = scanner.nextLine();
            try {
                pos = Integer.parseInt(line.trim());
                if (pos < 1 || pos > 9) {
                    System.out.println("Position must be 1..9. Try again.");
                    continue;
                }
                if (board.placeMove(pos, getSymbol())) {
                    break;
                } else {
                    System.out.println("Cell already taken. Choose another.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Enter a number 1..9.");
            }
        }
    }
}
