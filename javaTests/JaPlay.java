public class JaPlay {
   public static void main(String[] args){
       Circle circle1 = new Circle();
       System.out.println("Area of Circle of radius "+ circle1.radius + " is " + circle1.getArea());

       Circle circle2 = new Circle(25);
       System.out.println("Area of Circle of radius "+ circle2.radius + " is " + circle2.getArea());

   }
}

class Circle {
   double radius;

   Circle() {  
      radius = 1;
   }

   Circle(double newRadius) {
      radius = newRadius;
   }


   double getArea(){
      return radius * radius * Math.PI;
   }
}
