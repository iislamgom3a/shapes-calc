
import java.util.Scanner;

// Main program
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            // Display shape calculation options
        System.out.println("------------------------------------------ ");
        System.out.println("------->>>>>  SHAPES CALCULATOR <<<<<-----");
        System.out.println("------------------------------------------ ");
        System.out.println("1-Perimeter ");
        System.out.println("2-Area ");
        System.out.println("3-Surface Area ");
        System.out.println("4-Volume ");
        System.out.println("5-Exit ");

        System.out.print("Enter your choice: ");

        int num = input.nextInt();  // User's choice
        double x = 0;  // Variable to store user input

        switch (num) {
            case 1:
                // Perimeter calculation
                System.out.println("Perimeter");
                System.out.println("1- square ");
                System.out.println("2- Rectangle");
                System.out.println("3- triangle");
                System.out.println("4- circle");
                System.out.print("Choose the shape: ");
                
                
                int v = input.nextInt();  // User's shape choice
                
                switch (v) {
                    case 1:
                        // square
                        System.out.println("You chose square!");
                        System.out.println("Enter your side: ");
                        square s = new square();
                        s.setSide();
                        s.getPerimeter();
                        break;
                    case 2:
                        // Rectangle
                        System.out.println("You chose Rectangle!");
                        rectangle r = new rectangle();
                        r.setLength(x);
                        r.setWidth(x);
                        r.getPerimeter();    
                        break;
                    case 3:
                        // triangle
                        System.out.println("You chose triangle!");
                        triangle t = new triangle();
                        t.setSide1(x); 
                        t.setSide2(x);  
                        t.setSide3(x);    
                        t.getPerimeter();
                        break;  
                    case 4:
                        // circle
                        System.out.println("You chose circle!");
                        circle c = new circle();
                        c.setRadius(x);
                        c.getPerimeter();    
                        break;

                    default:
                        break;
                }    
                break;

            case 2:  
                // Area calculation
                System.out.println("1- square ");
                System.out.println("2- Rectangle");
                System.out.println("3- triangle");
                System.out.println("4- circle");
                System.out.print("Choose the shape: ");
                v = input.nextInt();  // User's shape choice
                
                switch (v) {
                    case 1:
                        // square
                        System.out.println("You chose square!");
                        square s = new square();
                        s.setSide();
                        s.getArea();    
                        break;
                    case 2:
                        // Rectangle
                        System.out.println("You chose Rectangle!");
                        rectangle r = new rectangle();
                        r.setLength(x);
                        r.setWidth(x);
                        r.getArea();    
                        break;
                    case 3:
                        // triangle
                        System.out.println("You chose triangle!");
                        triangle t = new triangle();
                        t.getArea();    
                        break;  
                    case 4:
                        // circle
                        System.out.println("You chose circle!");
                        circle c = new circle();
                        c.setRadius(x);
                        c.getArea();
                        break;      
                    default:
                        break;
                } 
                break;

            case 3:
                // Surface area calculation
                System.out.println("1- sphere");
                System.out.println("2- cube");
                System.out.println("3- cylinder");
                System.out.println("4- cuboid");
                System.out.println("5- cone");
                System.out.println("6- ellipsoid");
                System.out.print("Choose the shape: ");
                v = input.nextInt();  // User's shape choice  
                
                switch (v) {
                    case 1:
                        // sphere
                        System.out.println("You chose sphere!");
                        sphere sphere = new sphere();
                        sphere.setRadius(x);
                        sphere.getSurfaceArea();    
                        break;
                    case 2:
                        // cube
                        System.out.println("You chose cube!");
                        cube cube = new cube();
                        cube.setLength(x);
                        cube.getSurfaceArea();    
                        break;
                    case 3:
                        // cylinder
                        System.out.println("You chose cylinder!");
                        cylinder cylinder = new cylinder();
                        cylinder.setRadius(x);
                        cylinder.setHeight(x);
                        cylinder.getSurfaceArea();    
                        break;  
                    case 4:
                        // cuboid
                        System.out.println("You chose cuboid!");
                        cuboid cuboid = new cuboid();
                        cuboid.setHeight(x);    
                        cuboid.setLength(x);   
                        cuboid.setWidth(x);
                        cuboid.getSurfaceArea();    
                        break;
                    case 5:
                        // cone
                        System.out.println("You chose cone!");
                        cone cone = new cone();
                        cone.setRadius(x);
                        cone.setHeight(x);
                        cone.getSurfaceArea();    
                        break;
                    case 6:
                        // ellipsoid
                        System.out.println("You chose ellipsoid!");
                        ellipsoid ellipsoid = new ellipsoid();
                        ellipsoid.setX(x);    
                        ellipsoid.setY(x);
                        ellipsoid.setZ(x);
                        ellipsoid.getSurfaceArea();    
                        break;              
                    default:
                        break;
                }  
                break;

            case 4:  
                // Volume calculation
                System.out.println("1- sphere");
                System.out.println("2- cube");
                System.out.println("3- cylinder");
                System.out.println("4- cuboid");
                System.out.println("5- cone");
                System.out.println("6- ellipsoid");
                System.out.print("Choose the shape: ");
                v = input.nextInt();  // User's shape choice
                
                switch (v) {
                    case 1:
                        // sphere
                        System.out.println("You chose sphere!");
                        sphere sp = new sphere();
                        sp.setRadius(x);
                        sp.getVolume();    
                        break;
                    case 2:
                        // cube
                        System.out.println("You chose cube!");
                        cube cube = new cube();
                        cube.setLength(x);
                        cube.getVolume();    
                        break;
                    case 3:
                        // cylinder
                        System.out.println("You chose cylinder!");
                        cylinder cylinder = new cylinder();
                        cylinder.setRadius(x);
                        cylinder.setHeight(x);
                        cylinder.getVolume();    
                        break;  
                    case 4:
                        // cuboid
                        System.out.println("You chose cuboid!");
                        cuboid cuboid = new cuboid();
                        cuboid.setHeight(x);    
                        cuboid.setLength(x);   
                        cuboid.setWidth(x);
                        cuboid.getVolume();  
                        break;
                    case 5:
                        // cone
                        System.out.println("You chose cone!");
                        cone cone = new cone();
                        cone.setRadius(x);
                        cone.setHeight(x);
                        cone.getVolume();    
                        break;
                    case 6:
                        // ellipsoid
                        System.out.println("You chose ellipsoid!");
                        ellipsoid ellipsoid = new ellipsoid();
                        ellipsoid.setX(x);    
                        ellipsoid.setY(x);
                        ellipsoid.setZ(x);
                        ellipsoid.getVolume();    
                        break;              
                    default:
                        break;
                }
                break;
            case 5:
                return ;
            default:
                System.out.println("This is not an option");
                break;
        }
        }
    }
}
