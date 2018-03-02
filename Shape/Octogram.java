import java.awt.*;
public class Octogram implements Shape
{
    int width;
    int x;
    int y;
    int[] ax = new int[4];
    int[] ay = new int[4];
    /**
     * Constructor for objects of class Octogram
     */
    public Octogram(int px, int py, int pwidth)
    {
        x = px;
        y = py; 
        width = pwidth;
        ax[0] = x - (width/4);
        ax[1] = x+(width/2);
        ax[2] = x+(width/2);
        ax[3] = x+width+(width/4);
        ay[0] = y+(width/2);
        ay[1] = y+width+(width/4);
        ay[2] = y - (width/4);
        ay[3] = y+(width/2);
    }
    
    public void draw(Graphics pen){
        pen.drawRect(x,y,width,width);
        pen.drawPolygon(ax,ay,4);
    }
    
    public double perimeter(){
        return width * 6;
    }
    
    public double area(){
        return (width*width)+(width/2);
    }
}
