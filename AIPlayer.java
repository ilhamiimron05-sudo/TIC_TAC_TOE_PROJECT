import java.util.Random;

public class AIPlayer extends Player {
    private Random rnd = new Random();

    public AIPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public void makeMove(Board board) {
        System.out.println(getName() + " (" + getSymbol() + ") is thinking...");
        int[] preferred = {5};
        for (int p : preferred) {
            if (board.isEmptyCell(p)) {
                board.placeMove(p, getSymbol());
                return;
            }
        }
        int pos;
        int attempts = 0;
        do {
            pos = rnd.nextInt(9) + 1;
            attempts++;
            if (attempts > 50) {
                for (int i=1;i<=9;i++) if (board.isEmptyCell(i)) { board.placeMove(i,getSymbol()); return; }
            }
        } while (!board.placeMove(pos, getSymbol()));
    }
}
