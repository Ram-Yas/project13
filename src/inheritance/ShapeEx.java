package inheritance;

public class ShapeEx {
        public static void main(String[] args) {
            Triangle t = new Triangle(12, 10, 5);
            Rectangle r = new Rectangle(25, 40);
            Square s = new Square(7);
            Rectangle r2 = new Rectangle(10,20);
            t.getArea();
            t.getPeremeter();

            r.getArea();
            r.getPeremeter();

            s.getArea();
            s.getPeremeter();

            r2.getArea();
            r2.getPeremeter();
        }

    }

