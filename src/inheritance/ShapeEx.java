package inheritance;

public class ShapeEx {
        public static void main(String[] args) {
            Triangle t = new Triangle(12, 10, 5);
            Rectangle r = new Rectangle(25, 40);
            t.getArea();
            t.getPeremeter();

            r.getArea();
            r.getPeremeter();
        }

    }

