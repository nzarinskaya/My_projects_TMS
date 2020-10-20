package hw_21_10_2020.shape;

public class Main {
    public static void main(String[] args) throws UnknownTypeFigureException {

        switch ("Ellipse") {
            case "Square":
                Square square = new Square("Квадрат ", 3);
                break;
            case "Circle":
                Circle circle = new Circle("Круг", 4);
                break;
            case "Triangle":
                Triangle triangle = new Triangle("Треугольник", 5);
                break;
            default:
                throw new UnknownTypeFigureException("Неизвестный тип фигуры");
        }
    }
}
