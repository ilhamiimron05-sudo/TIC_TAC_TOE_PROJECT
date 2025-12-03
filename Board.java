public class Board {
    private char[] cells; 
    public Board() {
        cells = new char[10];
        for (int i = 1; i <= 9; i++) cells[i] = (char) ('0' + i); 
    }

    public boolean placeMove(int position, char symbol) {
        if (position < 1 || position > 9) return false;
        if (cells[position] == 'X' || cells[position] == 'O') return false;
        cells[position] = symbol;
        return true;
    }

    public boolean placeMove(int row, int col, char symbol) {
        int pos = (row - 1) * 3 + col;
        return placeMove(pos, symbol);
    }

    public boolean isEmptyCell(int position) {
        char c = cells[position];
        return c != 'X' && c != 'O';
    }

    public boolean isFull() {
        for (int i = 1; i <= 9; i++) if (isEmptyCell(i)) return false;
        return true;
    }

    public void display() {
        System.out.println();
        for (int r = 0; r < 3; r++) {
            System.out.print(" ");
            for (int c = 1; c <= 3; c++) {
                int pos = r * 3 + c;
                System.out.print(" " + cells[pos] + " ");
                if (c < 3) System.out.print("|");
            }
            System.out.println();
            if (r < 2) System.out.println(" ---+---+---");
        }
        System.out.println();
    }

    public char checkWin() {
        int[][] lines = {
            {1,2,3},{4,5,6},{7,8,9},
            {1,4,7},{2,5,8},{3,6,9},
            {1,5,9},{3,5,7}
        };
        for (int[] ln : lines) {
            char a = cells[ln[0]], b = cells[ln[1]], c = cells[ln[2]];
            if (a == b && b == c && (a == 'X' || a == 'O')) return a;
        }
        return 0;
    }

    public char[] getCellsCopy() {
        return cells.clone();
    }
}
