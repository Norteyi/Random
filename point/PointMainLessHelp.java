// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.

public class PointMainLessHelp {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);
        Point p3 = new Point(11,2);

        // print each point and its distance from origin
        System.out.println("p1 is " + p1.toString());
        System.out.println("p1 distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is " + p2.toString());
        System.out.println("p2 distance from origin = " + p2.distanceFromOrigin());

        // translate each point to a new location
        p1 = p1.translate(3,4);
        p2 = p2.translate(7,3);

        // print the points again
        System.out.println("p1 translated is now " + p1.toString());
        System.out.println("p2 translated is now " + p2.toString());
        
        System.out.println("The slope between p1 and p2 " + p1.getSlope(p2));
        
        p1.isCollinear(p2,p3);
    }
}
