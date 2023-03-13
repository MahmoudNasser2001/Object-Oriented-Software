package c322.Homeworks.Homework4.PartD;

public class TypeBFactory extends MotorHome implements MotorHomeAbstractFactory {

    public TypeBFactory()
    {
        type = "[Type B]";
    }

    @Override
    public Type createType() {
        return null;
    }

    @Override
    public Style createStyle() {
        return new Weekender(this);
    }

    @Override
    public Frame createFrame() {
        return new CamperVan(this);
    }

    @Override
    public Engine createEngine() {
        return new FordTransit350HD(this);
    }

    @Override
    public Kitchen createKitchen() {
        return new Compact(this);
    }
}