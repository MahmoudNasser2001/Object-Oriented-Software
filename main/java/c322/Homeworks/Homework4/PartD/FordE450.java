package c322.Homeworks.Homework4.PartD;

public class FordE450 implements Engine{
    MotorHome MH;
    public FordE450 (MotorHome m)
    {
        this.MH = m;
    }
    @Override
    public String getEngine() {
        return MH.type + " Engine: Ford E-450";
    }
}