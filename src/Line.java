public class Line {
    private Point p1;
    private Point p2;
    //Constructs a new Line that contains the given two Points.
    public Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    //construtor
    public Line(int x1, int y1, int x2, int y2){
        p1.setX(x1);
        p1.setY(y1);
        p2.setX(x2);
        p2.setY(y2);
    }

    //Returns this Line’s first endpoint.
    public Point getP1(){
        return p1;
    }
    //Returns this Line’s second endpoint.
    public Point getP2(){
        return p2;
    }
    //Returns a String representation of this Line, such as "[(22, 3), (4, 7)]".
    public String toString(){
        return ("["+p1.toString()+","+p2.toString()+"]");
    }
    public double getSlope(){
        if (p1.getX()==p2.getX()){
            throw new IllegalArgumentException();
        }
        return ((p2.getY()-p1.getY())/(p2.getX()-p1.getX()));
    }
    public boolean isCollinear(Point p){
        double slope1 = 1.0*(p1.getY() - p.getY()) / (p1.getX() - p.getX());
        double slope2 = 1.0*(p2.getY() - p.getY()) / (p2.getX() - p.getX());
        return slope1 == slope2;
    }
}
