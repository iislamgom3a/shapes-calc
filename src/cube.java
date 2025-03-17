
import java.util.Scanner;

public class cube {
    private double l ;
    Scanner input = new Scanner(System.in);
        public void setLength (double lenght){
        System.out.print("Lenght =  ");   
        l = input.nextDouble();
        if (l > 0)  
          lenght = l;
        else 
          System.out.println("You can't enter a negative number");
        }
        public double getLength(){
        System.out.println("the Length = "+ l); 
        return l;
        }
        public double getVolume (){
            return (l*l*l);
        }
        public double getSurfaceArea (){
            return (6*l*l);
        }
}
