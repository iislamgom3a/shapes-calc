
import java.util.Scanner;

public class square {
    private double side ;

    public void setSide(){
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        if(side <= 0) {
            System.out.println("Enter a valid side length!");
            setSide();
        }
        else this.side = side;
    }
    public double getSide(){
        return side;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 4*side;
    }
}
