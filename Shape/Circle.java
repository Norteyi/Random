import java.awt.*;
/**
 * Abstract class Circle - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Circle implements Shape
{
    private int diameter = 0;
    private int x;
    private int y;
    public Circle(int px, int py, int pdiameter){
        diameter = pdiameter;
        x = px;
        y = py;
    }
    public void draw(Graphics pen){
        pen.drawOval(x,y,diameter, diameter);
    }
    public double perimeter(){
        return diameter * 3.14;
    }
    public double area(){
        return (diameter/2)*(diameter/2)*3.14;
    }
}
