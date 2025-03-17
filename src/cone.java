
import java.util.Scanner;

public class cone {
        private double h ;
        private double r ;
    Scanner input = new Scanner(System.in); 

    public void setRadius (double radius){
    System.out.print("Radius of the base = ");   
    r = input.nextDouble();
    if (r > 0)  
        radius = r;
            else 
            System.out.println("You cannot enter the negative number");
    }
    public void setHeight (double hight){
        System.out.print("Hight = ");   
        h = input.nextDouble();
        if (h > 0)  
        hight = h;
        else 
        System.out.println("You cannot enter the negative number");
    }

    public double getHight (){
        System.out.println("The hight = "+ h); 
        return h;
    }

    public double getRudius(){
        System.out.println("The rudius = "+ r); 
        return r;
    }

    public double getVolume(){
        System.out.println("The volume = "+ (22*r*r*h/21)); 
        return (22*r*r*h/21);
    }

    public double getSurfaceArea(){
        System.out.println("The Surface area = "+ (22*r/7*(r+Math.sqrt(r*r+h*h)))); 
        return (22*r/7*(r+Math.sqrt(r*r+h*h)));
    }
}
