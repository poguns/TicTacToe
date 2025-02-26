import java.util.Scanner;

class Player {
    private final String name;
    private final String symbol;

    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int[] getMove(Scanner scanner) {
        System.out.println(name + " (" + symbol + "), enter row and column (0-2): ");
        return new int[]{scanner.nextInt(), scanner.nextInt()};
    }
}