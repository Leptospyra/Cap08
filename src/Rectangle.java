public class Rectangle {
    //fields
    private int x, y, width, height;
    //constructor
    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Rectangle(Point p, int width, int height){
        this.x = p.getX();
        this.y = p.getY();
        this.width = width;
        this.height = height;
    }

    //Returns this Rectangle’s height.
    public int getHeight(){
        return height;
    }
    //Returns this Rectangle’s width.
    public int getWidth(){
        return width;
    }

    //Returns this Rectangle’s x-coordinate.
    public int getX(){
        return x;
    }
    //Returns this Rectangle’s y-coordinate.
    public int getY(){
        return y;
    }
    //Returns a String representation of this Rectangle, such as
    // "Rectangle[x=1,y=2,width=3, height=4]"
    public String toString(){
        return ("Rectangle[x=" + x +",y=" + y + ",width=" + width + ", height=" + height + "]");
    }
    public boolean contains(int x, int y){
        return (x <= this.x + width && x >= this.x) && (y <= this.y + height && y >= this.y);
    }
    public boolean contains(Point p){
        return this.contains(p.getX(), p.getY());
    }
}
