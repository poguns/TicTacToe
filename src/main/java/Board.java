class Board {
    private final String[][] grid = {{"⬜", "⬜", "⬜"}, {"⬜", "⬜", "⬜"}, {"⬜", "⬜", "⬜"}};

    public void display() {
        for (String[] row : grid) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col, String symbol) {
        if (grid[row][col].equals("⬜")) {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWinner(String symbol) {
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0].equals(symbol) && grid[i][1].equals(symbol) && grid[i][2].equals(symbol)) ||
                    (grid[0][i].equals(symbol) && grid[1][i].equals(symbol) && grid[2][i].equals(symbol))) {
                return true;
            }
        }
        return (grid[0][0].equals(symbol) && grid[1][1].equals(symbol) && grid[2][2].equals(symbol)) ||
                (grid[0][2].equals(symbol) && grid[1][1].equals(symbol) && grid[2][0].equals(symbol));
    }

    public boolean isFull() {
        for (String[] row : grid) {
            for (String cell : row) {
                if (cell.equals("⬜")) return false;
            }
        }
        return true;
    }
}
