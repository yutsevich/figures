package figures;

public class Square extends Figure {

    private double side;

    public Square() {
        this.side = super.getSquare() / 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", square=" + super.getSquare() +
                ", color=" + super.getColor().toString() +
                '}';
    }
}
