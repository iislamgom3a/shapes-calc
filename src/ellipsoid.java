import java.util.Scanner;

public class ellipsoid {
    private double x ;
    private double y ;
    private double z ;
    Scanner input = new Scanner(System.in);

        public void setX (double xx){
        System.out.print("Radii along X axis = ");   
        x = input.nextDouble();
        if (x > 0)  
          xx = x;
        else 
          System.out.println("You cannot enter a negative number");
        }

        public void setY (double yy){
        System.out.print("Radii along Y axis = ");   
        y = input.nextDouble();
        if (y > 0)  
          yy = y;
        else 
          System.out.println("You cannot enter a negative number");
        }

        public void setZ(double zz){
        System.out.print("Radii along Z axis = ");   
        z = input.nextDouble();
        if (z > 0)  
          zz = z;
        else 
          System.out.println("You can't enter a negative number");
        }

        public double getX (){
        System.out.println("The length = "+x); 
        return x;
        }

        public double getY (){
        System.out.println("The hight = "+ y); 
        return y;
        }

        public double getZ (){
        System.out.println("The width = "+ z); 
        return z;
        }

        public double getVolume (){
            System.out.println("The volume = "+ (4*22*x*y*z/21)); 
            return (4*22*x*y*z/21);
        }

        public double getSurfaceArea (){
            System.out.println("The surface area = "+ (4*22*((x*y+x*z+y*z )/ 21))); 
            return  (4*22/7*((x*y+x*z+y*z )/ 3));
        }
}
