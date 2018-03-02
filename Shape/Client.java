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
        pen.setColor(Color.BLACK);
        Scanner input = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        String shape;
        int ux = 0;
        int uy = 0;
        int circlediameter;
        int width;
        int length;
        int shapenum;
        System.out.println("How many shapes do you want to create");
        shapenum = input.nextInt();
        for(int x= 0; x<shapenum; x++){
            System.out.println("What shape do you want to create: Circle Rectangle RightTriangle or an Octogram");
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
            if(shape.equals("Rectangle")||shape.equals("rectangle")){
                System.out.println("what should the x coordinate be for the rectangle");
                ux = input.nextInt();
                System.out.println("what should the y coordinate be for the rectangle");
                uy = input.nextInt();
                System.out.println("How wide should the rectangle be");
                width = input.nextInt();
                System.out.println("What should the length of the rectangle be");
                length = input.nextInt();
                shapes.add(new Rectangle(ux, uy, length, width));
            }
            if(shape.equals("RightTriangle")||shape.equals("righttriangle")){
                System.out.println("what should the x coordinate be for the righttriangle");
                ux = input.nextInt();
                System.out.println("what should the y coordinate be for the righttriangle");
                uy = input.nextInt();
                System.out.println("What should the base of the right triangle be");
                width = input.nextInt();
                System.out.println("What should the height of the right triangle be");
                length = input.nextInt();
                shapes.add(new RightTriangle(ux, uy, width, length));
            }
            if(shape.equals("Octogram")||shape.equals("octogram")){
                System.out.println("what should the x coordinate be for the octogram");
                ux = input.nextInt();
                System.out.println("what should the y coordinate be for the octogram");
                uy = input.nextInt();
                System.out.println("How wide should the octogram be");
                width = input.nextInt();
                shapes.add(new Octogram(ux, uy, width));
            }
        }
        for(int x = 0; x<shapenum; x++){
            shapes.get(x).draw(pen);
        }
    }
}
