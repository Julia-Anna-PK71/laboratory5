package Lab5;

public class Letter {
    private char symbol;

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol + "";
    }
}