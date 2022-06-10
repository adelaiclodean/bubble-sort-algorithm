package ro.bubbleSort;

public class Bubble {
    private final int SalesRepr; // SalesRepr=sales*cotation

    public Bubble(String name, int sales, int cotation, int SalesRepr) {
        this.SalesRepr=SalesRepr;
    }
    public int getSalesRepr(){
        return SalesRepr;
    }
}