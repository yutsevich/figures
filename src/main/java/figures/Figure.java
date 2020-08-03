package figures;

public abstract class Figure {

    private final int maxAmountOfColors = 10;
    private double square = (Math.random() * 100);

    private Colors color;

    public Figure() {
        switch ((int) (Math.random() * maxAmountOfColors)) {
            case 1:
                this.color = Colors.RED;
                break;
            case 2:
                this.color = Colors.ORANGE;
                break;
            case 3:
                this.color = Colors.YELLOW;
                break;
            case 4:
                this.color = Colors.GREEN;
                break;
            case 5:
                this.color = Colors.BLUE;
                break;
            default:
                this.color = Colors.WHITE;
        }
    }

    public double getSquare() {
        return square;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
