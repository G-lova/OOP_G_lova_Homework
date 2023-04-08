package Seminar6.srp1;

import Seminar6.srp1.figure.Brush;
import Seminar6.srp1.figure.Point;
import Seminar6.srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        Brush brush = new Brush(square);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        brush.draw(square);
    }
}
