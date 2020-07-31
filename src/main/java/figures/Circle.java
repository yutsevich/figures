package figures;

public class Circle extends Figure {

    public double radius = Math.pow(super.getSquare(), 0.5);

    public Circle() {
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", square=" + super.getSquare() +
                ", color=" + super.getColor().toString() +
                '}';
    }
}
