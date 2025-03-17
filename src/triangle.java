
import java.util.Scanner;

public class triangle {
        private double b ;
        private double h ;
        private double angle;
        private double s1;
        private double s2;
        private double s3;
    Scanner input = new Scanner(System.in);
    
    public void seth (double hight){
        System.out.print("Hight = ");   
        h = input.nextDouble();
        if (h > 0)  
        hight = h;
        else 
        System.out.println("You cannot enter a negative number");
    }
    public void setb (double base){
        System.out.print("base = ");   
        b = input.nextDouble();
        if (b > 0)  
        base = b;
        else 
        System.out.println("You cannot enter a negative number");
        
    }
    public void setSide1 (double side1){
        System.out.print("The first side = ");   
        s1 = input.nextDouble();
        if (s1 > 0)  
        side1 = s1;
        else 
        System.out.println("You cannot enter a negative number");
    }
    public void setSide2 (double side2){
        System.out.print("The second side = ");   
        s2 = input.nextDouble();
        if (s2 > 0)  
        side2 = s2;
        else 
        System.out.println("You cannot enter a negative number");
    }
    public void setSide3 (double side3){
        System.out.print("The thired side = ");   
        s3 = input.nextDouble();
        if (s3 > 0)  
        side3 = s3;
        else 
        System.out.println("You cannot enter a negative number");
    }
    public double getHight (){
        System.out.println("The hight = "+ h); 
        return h;
    }
    public double getSide1 (){
        System.out.println("The first side = "+ s1); 
        return s1;
    } 
    public double getSide2 (){
        System.out.println("The sceond side = "+ s2); 
        return s2; 
    }
    public double getSide3(){
        System.out.println("The thierd side = "+ s3); 
        return s3;
    }     
    public double getwidth (){
        System.out.println("The weidth = "+ b); 
        return b;
    }
    public double getPerimeter(){
        System.out.println("The perameter = "+(s1+s2+s3));
        return(s1+s2+s3);
    }  
    
        
        public void getArea (){
        System.out.println("1- Use of side lengths");
        System.out.println("2- Use of hight and base");
        System.out.println("3- Use of two sides and angle between them");
        System.out.print("choose the method : ");
        int x = input.nextInt();
    switch (x) {
        case 1:
            setSide1(x);
            setSide2(x);
            setSide3(x);
            double SemiP =(s1+s2+s3) /2;
            double area = Math.sqrt(SemiP*(SemiP-s1)*(SemiP-s2)*(SemiP-s3));
            System.out.println("The area = "+ area);
                break;
        case 2:
        setb(x);
        seth(x);
            area =(0.5)*b*h;
            System.out.println("The area = "+ area);

                break;
        case 3 :
            System.out.print("The first side = ");   
            s1 = input.nextDouble();
            if (s1 > 0)  {
                System.out.print("The second side = ");   
                s2 = input.nextDouble();
            }
            else 
            System.out.println("You cannot enter the negative number");
            if (s2 > 0) {
                System.out.print("The angle between them = ");
                angle = input.nextDouble();
                    if (angle > 0)  {
                        angle=angle*22/1260;
                        area =s1*s2*Math.sin(angle);
                        System.out.println("The area = "+ area);
                    }
                    else 
                        System.out.println("You cannot enter the negative number");
            
        }
            else 
            System.out.println("You cannot enter the negative number");
            

                break;
            default:
                break;
        }     
    }
}
