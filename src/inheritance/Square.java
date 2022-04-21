package inheritance;

public class Square extends Shape{
   double side;

   Square(double side){
       super();
       this.side = side;
   }


    @Override
    void getArea() {
        area = side*side;
        System.out.println("Area of square : "+String.valueOf(area));
    }

    @Override
    void getPeremeter() {
       peremeter = side*4;
        System.out.println("Perimeter of Square is "+ String.valueOf(peremeter));

    }
}
