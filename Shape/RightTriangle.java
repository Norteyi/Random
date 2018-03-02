import java.awt.*;
/**
 * Abstract class Triangle - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class RightTriangle
{
    // instance variables - replace the example below with your own
    private double base;
    private double height;
    private double c;
    private int[] ax = new int[3];
    private int[] ay = new int[3];
    private int x;
    private int y;
    
    public RightTriangle(int px, int py, double pbase,double pheight, double pc){
        x = px;
        y = py;
        base = pbase;
        height = pheight;
        c = pc;
        ax[0] = x;
        ax[1] = x;
        ax[2] =(int)(base)+x;
        ay[0] = y;
        ay[1] = (int)(height)+y;
        ay[2] = y;
    }
        

    public double perimeter()
    {
        return height + base + c;
    }
    public double area()
    { 
        return (height * base)/2;
    }
    public void draw(Graphics pen)
    {
        pen.drawPolygon(ax,ay,3);
    }
}
