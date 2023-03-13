package c322.Homeworks.Homework4.PartD;

public interface MotorHomeAbstractFactory {
    public abstract Type createType();
    public abstract Style createStyle();
    public abstract Frame createFrame();
    public abstract Engine createEngine();
    public abstract Kitchen createKitchen();
}