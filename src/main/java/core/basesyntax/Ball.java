package core.basesyntax;

public class Ball {
    private String color;
    private int number;

    public String getColor() {
        return color;
    }

    public int getnumber() {
        return number;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Ball is " + color + " and have number: " + number + ".";
    }
}