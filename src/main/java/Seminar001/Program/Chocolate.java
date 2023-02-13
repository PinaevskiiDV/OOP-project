package Seminar001.Program;

public class Chocolate extends Product {
    private Double volume = 0.2;

    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, Double price, Double volume) {
        this(name, price);
        this.volume = volume;

    }

    @Override
    public String toString(){
        return String.format("%s volume = %s  " , super.toString(), volume);
    }
}
