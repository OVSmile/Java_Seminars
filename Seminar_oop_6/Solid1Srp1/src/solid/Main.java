package solid;

import solid.srp.PaintSquare;
import solid.srp.Point;
import solid.srp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        PaintSquare paintSquare = new PaintSquare(5 * 2);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        paintSquare.draw();
    }
}
