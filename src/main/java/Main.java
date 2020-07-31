import figures.Circle;
import figures.Square;
import figures.Trapezoid;
import figures.Triangle;

public class Main {
    public static void main(String[] args) {
        generateFigures();
    }

    public static void generateFigures() {
        int amountOfFigures = (int) (Math.random() * 100);

        for (int i = 0; i < amountOfFigures; i++) {
            switch ((int) ((Math.random() * (4 - 1)) + 1)) {
                case 1:
                    Circle circle = new Circle();
                    System.out.println(circle.toString());
                    break;
                case 2:
                    Square square = new Square();
                    System.out.println(square.toString());
                    break;
                case 3:
                    Trapezoid trapezoid = new Trapezoid();
                    System.out.println(trapezoid.toString());
                    break;
                case 4:
                    Triangle triangle = new Triangle();
                    System.out.println(triangle.toString());
                    break;
            }
        }
    }
}
