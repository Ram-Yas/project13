package inheritance;


    class Rectangle extends Shape{
        double width, height;

        Rectangle(double width, double height){
            super();
            this.width = width;
            this.height = height;
        }
        public void getArea(){
            area = width*height;
            System.out.println("Area of Rectangle : " + String.valueOf(area));
        }
        public void getPeremeter(){
            peremeter = 2*(width + height);
            System.out.println("Peremeter of Rectangle : "+ String.valueOf(peremeter));
        }
    }

