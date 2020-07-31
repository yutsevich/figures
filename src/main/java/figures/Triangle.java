package figures;

public class Triangle extends Figure {

    private final double angle1 = 90;
    private double angle2;
    private final double angle3;

    private double side1;
    private double side2;
    private final double hypotenuse = Math.pow((Math.pow(side1, 2) + Math.pow(side2, 2)), 0.5);

    public Triangle() {
        this.angle2 = (int) ((Math.random() * (88)) + 1);
        this.angle3 = 90 - angle2;
        this.side1 = (int) ((Math.random() * (100)) + 1);
        this.side2 = side1 * Math.tan(angle3);
    }

    public double getAngle1() {
        return angle1;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }

    public double getAngle3() {
        return angle3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "angle1=" + angle1 +
                ", angle2=" + angle2 +
                ", angle3=" + angle3 +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", hypotenuse=" + hypotenuse +
                ", square=" + super.getSquare() +
                ", color=" + super.getColor().toString() +
                '}';
    }
}
