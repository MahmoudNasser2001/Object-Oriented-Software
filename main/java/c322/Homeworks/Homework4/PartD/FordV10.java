package c322.Homeworks.Homework4.PartD;

public class FordV10 implements Engine{
    MotorHome MH;
    public FordV10 (MotorHome m)
    {
        this.MH = m;
    }
    @Override
    public String getEngine() {
        return MH.type + " Engine: Ford V10";
    }
}