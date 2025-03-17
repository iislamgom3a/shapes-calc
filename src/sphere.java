import java.util.Scanner;

public class sphere {
    private double r ;
    Scanner input = new Scanner(System.in);

        public void setRadius (double radius){
        System.out.print("Radius =  ");   
        r = input.nextDouble();
        if (r > 0)  
        radius = r;
        else 
        System.out.println("You cannot enter the negative number");
        }

        public double getRadius (){
        System.out.println("The radius = "+ r); 
        return r;
        }

        public double getVolume (){
            System.out.println("The volume = "+ (4*22*r*r*r/21)); 
            return (4*22*r*r*r/21);
        }

        public double getSurfaceArea (){
            System.out.println("The surface area = "+ (4*22*r*r/7));
            return (4*22*r*r/7);
        }
    
}
