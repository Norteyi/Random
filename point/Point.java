 // A Point object represents a pair of (x, y) coordinates.
// Seventh version: Immutable.
// Class invariant: x >= 0 && y >= 0.
import java.awt.*;

public class Point {
    private int x;
    private int y;
    private double slope;

    // Constructs a new point at the origin, (0, 0).
    public Point() {
        x=0;
        y=0;
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public Point(int x,int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }

        this.x = x;
        this.y = y;
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {  // not a Point object
            return false;
        }
    }

    // Returns the x-coordinate of this point.
    public int getX() {
        return x;
    }

    // Returns the y-coordinate of this point.
    public int getY() {
        return y;
    }

    // Returns a String representation of this point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double getSlope (Point other){
        if(other.getX()==x){
            throw new IllegalArgumentException();
        }
        slope = (double)(other.getY()-y)/(other.getX()-x);
        return slope;
    }
    
    public boolean isCollinear(Point p1){
        return true;
    }
    
    public boolean isCollinear(Point p1, Point p2){
        if(getSlope(p1) == getSlope(p2) && p2.getSlope(p1) == getSlope(p2)){
            System.out.println(getSlope(p1) + " " + getSlope(p2) + "it is collinear");
            return true;
        }
        else{
            System.out.println(getSlope(p1) + " " + getSlope(p2) + "it is not collinear");
            return false;
        }
    }
    
    public void drawPoint(Graphics pen){
        pen.fillOval(x,y,2,2);
    }
        
       
    
    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
}
