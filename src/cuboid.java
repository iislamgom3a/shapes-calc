import java.util.Scanner;

public class cuboid {
    private double l ;
    private double w ;
    private double h ;
    Scanner input = new Scanner(System.in);
        public void setLength (double lenght){
        System.out.print("Lenght = ");   
        l = input.nextDouble();
        if (l > 0)  
          lenght = l;
        else 
          System.out.println("You can't enter a negative number");
        }

        public void setWidth (double width){
        System.out.print("Width = ");   
        w = input.nextDouble();
        if (w > 0)  
          width = l;
        else 
          System.out.println("You can't enter a negative number");
        }

        public void setHeight (double hight){
        System.out.print("Hight = ");   
        h = input.nextDouble();
        if (h > 0)  
          hight = h;
        else 
          System.out.println("You can't  enter a negative number");
        }
        public double getLength (){
        System.out.println("The lenght = "+ l); 
        return l;
        }

        public double getHight (){
        System.out.println("The hight = "+ h); 
        return h;
        }

        public double getwidth (){
        System.out.println("The width = "+ w); 
        return w;
        }

        public double getVolume (){
            System.out.println("The volume = "+ (l*h*w)); 
            return (l*h*w);
        }

        public double getSurfaceArea (){
            System.out.println("The surface area = "+ (2*(l*w+w*h+h*l))); 
            return (2*(l*w+w*h+h*l));
        }

  
}
