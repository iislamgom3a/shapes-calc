import java.util.Scanner;

public class cylinder {
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

    public double getwidth (){
        System.out.println("The rudius = "+ r); 
        return r;
    }

    public double getVolume (){
        System.out.println("The volume = "+ (22*r*r*h/7)); 
        return (22*r*r*h/2);
    }

    public double getSurfaceArea (){
        System.out.println("The surface area = "+ ((44*r*r/7)+(44*r*h/7))); 
        return ((44*r*r/7)+(44*r*h/7));
    }
}
