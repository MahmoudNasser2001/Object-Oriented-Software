package c322.Homeworks.Homework4.PartD;

public class TypeCFactory extends MotorHome implements MotorHomeAbstractFactory {

    public TypeCFactory()
    {
        type = "[Type C]";
    }

    @Override
    public Type createType() {
        return null;
    }

    @Override
    public Style createStyle() {
        return new ExtendedTrip(this);
    }

    @Override
    public Frame createFrame() {
        return new Truck(this);
    }

    @Override
    public Engine createEngine() {
        return new FordE450(this);
    }

    @Override
    public Kitchen createKitchen() {
        return new Full(this);
    }
}