
import java.util.Scanner;

public class circle {
    private double r ;
    Scanner input = new Scanner(System.in);
        public void setRadius (double radius){
        r = input.nextDouble();
        if (r > 0)
            radius = r;
        else 
          System.out.println("You cannot enter the negative number");
        }
        public double getRadius (){
            return r;
        }
        public double getPerimeter (){
            return (44*r/7);
        }
        public  double getArea(){
            return (22*r*r/7);
        }
}
