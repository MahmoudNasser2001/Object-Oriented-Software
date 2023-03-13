package c322.Homeworks.Homework4.PartC;

public class ConcreteMowerFactory extends MowerFactory {
    @Override
    public Mower getMowerType(String type) {
        if (type.equalsIgnoreCase("Riding")) {
            return new RidingMower();
        } else if (type.equalsIgnoreCase("Push")) {
            return new PushMower();
        } else {
            return null;
        }
    }
}