package solid;

import solid.lsp.Rectangle;
import solid.lsp.Shape;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.printf("В квадрата сторона A = %d. ", square.getSide());
        ViewShape view = new ViewShape(square);
        view.showArea();
    }
}
