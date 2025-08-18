public abstract class Animal {
    private String symbol;
    public static final int LEFT = 1;  
    public static final int RIGHT = 2;  
    public static final int NOWHERE = 0;

    public Animal () {
        symbol = "0";
    }

    public String getSymbol () {
        return symbol;
    }

    public void setSymbol (String s) {
        symbol = s;
    }

    public String toString () {
        return symbol;
    }

    public abstract int act();


}