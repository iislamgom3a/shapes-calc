import java.util.Scanner;

public class rectangle {
        private double l ;
        private double w ;
    Scanner input = new Scanner(System.in); 
    public void setLength (double lenght){
    System.out.print("Lenght = ");   
    l = input.nextDouble();
    if (l > 0)  
        lenght = l;
    else 
        System.out.println("You cannot enter the negative number");
    }
    public void setWidth (double width){
        System.out.print("Width = ");   
    w = input.nextDouble();
        if (w > 0)  
        width = w;
        else 
        System.out.println("You cannot enter the negative number");
        
    }
    public double getVolume (){
    System.out.println("The lenght = "+ l); 
        return l;
    }
    public double getwidth (){
        System.out.println("The width = "+ w); 
        return w;
    }
    public double getPerimeter (){
        System.out.println("The perimeter = "+ (2*l+2*w)); 
        return 2*l+2*w;
    }
    public double getArea (){
        System.out.println("The area = "+ l*w); 
        return l*w;
    }
}
