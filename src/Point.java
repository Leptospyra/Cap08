// A Point object represents a pair of (x, y) coordinates.
// Seventh version: Immutable.
// Class invariant: x >= 0 && y >= 0.

public class Point {
    private int x;
    private int y;

    // Constructs a new point at the origin, (0, 0).
    public Point() {
        this(0, 0);    // calls Point(int, int) constructor
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public Point(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }

        setLocation(x,y);
    }
    // sets this point's (x, y) location to the given values
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }


    // Returns the x-coordinate of this point.
    public int getX() {
        return x;
    }

    // Returns the y-coordinate of this point.
    public int getY() {
        return y;
    }

    //change the x-coordinate of this point.
    public void setX(int x){
        this.x = x;
    }
    //change the y-coordinate of this point.
    public void setY(int y){
        this.y = y;
    }
    // Returns a String representation of this point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
    public double distance(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public int manhattanDistance(Point other){
        int dx = x - other.x;
        int dy = y - other.y;
        return dx + dy;
    }
    //Returns true if the given Point lines up vertically with this Point, that is,
    // if their x-coordinates are the same.
    public boolean isVertical(Point other){
       if (this.x == other.x){
           return true;
       }
       return false;
    }
    public double slope(Point other){
        if (this.x == other.x){
            throw new IllegalArgumentException();
        }
        return (other.y-this.y) / (other.x-this.x);
    }
    public boolean isCollinear(Point p1, Point p2){
        if ((this.x == p1.x)&&(this.x == p2.x)) {
            return true;
        }
        if ((this.y == p1.y)&&(this.y == p2.y)){
            return true;
        }

        return false;
    }
}
