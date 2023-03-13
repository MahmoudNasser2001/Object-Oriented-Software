package c322.Homeworks.Homework6.PartB;

public class Circle extends Dot {
    private int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    public void draw() {
        System.out.printf("Drawing [CIRCLE] of radius %d coordinate (%d,%d)%n", this.radius, this.x,this.y);
    }
}