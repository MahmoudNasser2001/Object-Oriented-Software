package c322.Homeworks.Homework6.PartB;

import java.util.List;
import java.util.ArrayList;

public class CompoundGraphic implements Graphic {
    protected ArrayList<Graphic> children = new ArrayList<Graphic>();
    public void add(Graphic child) {
        children.add(child);
    }
    public void remove(Graphic child) {
        children.remove(child);
    }
    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }
    public void draw() {
        for (Graphic child : children) {
            child.draw();
        }
    }
}