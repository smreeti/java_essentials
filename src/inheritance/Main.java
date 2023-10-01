package inheritance;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        square.print("Square");
        square.setLength(12);
        double perimeter = square.calculatePerimeter();
        System.out.println(perimeter);
    }
}
