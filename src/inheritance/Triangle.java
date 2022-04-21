package inheritance;

public class Triangle extends Shape   {
   // class Tringle {
        double side1, side2, side3;

        Triangle(double side1, double side2, double side3){
            super();
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        public void getArea(){
            double s = 0.5*(side1 + side2 + side3);
            area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            System.out.println("Area of Tringle : " + String.valueOf(area));
        }
        public void getPeremeter(){
            peremeter = side3 + side2 + side1;
            System.out.println("Peremeter of Tringle : "+ String.valueOf(peremeter));
        }

}
