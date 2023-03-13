package c322.Homeworks.Homework4.PartD;

public class TypeAFactory extends MotorHome implements MotorHomeAbstractFactory {

    public TypeAFactory()
    {
        type = "[Type A]";
    }

    @Override
    public Type createType() {
        return null;
    }

    @Override
    public Style createStyle() {
        return new OffGrid(this);
    }

    @Override
    public Frame createFrame() {
        return new Bus(this);
    }

    @Override
    public Engine createEngine() {
        return new FordV10(this);
    }

    @Override
    public Kitchen createKitchen() {
        return new Full(this);
    }
}