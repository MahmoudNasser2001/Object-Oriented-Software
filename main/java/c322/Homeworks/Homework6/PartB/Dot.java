package c322.Homeworks.Homework6.PartB;

public class Dot implements Graphic {
    //allow child shapes to access
    protected int x, y;
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    public void draw() {
        System.out.printf("Drawing [DOT] at coordinate (%d,%d)%n", this.x,this.y);
    }
}