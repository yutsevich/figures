package figures;

public class Trapezoid extends Figure {

    private double basis;

    private double basis2;

    private double height;

    public Trapezoid() {
        this.basis = (int) ((Math.random() * (100)) + 1);
        this.height = (int) ((Math.random() * (100)) + 1);

        while (basis * height > super.getSquare()) {
            this.basis = (int) ((Math.random() * (100)) + 1);
            this.height = (int) ((Math.random() * (100)) + 1);

            if (basis * height < super.getSquare()) {
                this.basis2 = (super.getSquare() - basis * height) / (2 * height);
            }
        }
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "low basis=" + basis +
                ", high basis=" + basis2 +
                ", height=" + height +
                ", square=" + super.getSquare() +
                ", color=" + super.getColor().toString() +
                '}';
    }
}
