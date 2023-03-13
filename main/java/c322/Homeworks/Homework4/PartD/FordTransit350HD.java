package c322.Homeworks.Homework4.PartD;

public class FordTransit350HD implements Engine{
    MotorHome MH;
    public FordTransit350HD (MotorHome m)
    {
        this.MH = m;
    }
    @Override
    public String getEngine() {
        return MH.type + " Engine: Ford Transit 350 HD";
    }
}