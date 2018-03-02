import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client
{
    public static void main(String args[]){
        DrawingPanel panel = new DrawingPanel(500,500);
        Graphics pen = panel.getGraphics();
        Scanner input = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shapes>();
        String shape;
        int ux = 0;
        int uy = 0;
        int circlediameter;
        
        System.out.println("What shape do you want to create: Circle Square or RightTriangle");
        shape = input.next();
        if(shape.equals("Circle")||shape.equals("circle")){
            System.out.println("what should the x coordinate be for the circle");
            ux = input.nextInt();
            System.out.println("what should the y coordinate be for the circle");
            uy = input.nextInt();
            System.out.println("How wide should the circle be");
            circlediameter = input.nextInt();
            shapes.add(new Circle(ux, uy, circlediameter));
        }
    }
}
