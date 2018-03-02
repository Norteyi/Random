import java.awt.*;
/**
 * Abstract class Rectangle - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Rectangle implements Shape
{
    // instance variables - replace the example below with your own
    private int length;
    private int width;
    private int x;
    private int y;

    public Rectangle(int px, int py, int plength,int pwidth){
        length = plength;
        width = pwidth;
        x = px; 
        y = py;
    }
    
    public void draw(Graphics pen){
        pen.drawRect(x,y,width,length);
    }
    
    public double perimeter()
    {
        return (length*2)+(width*2);
    }
    
    public double area()
    {
        return length*width;
    }
}
