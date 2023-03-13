package c322.Homeworks.Homework4.PartD;

public class Truck implements Frame{
    MotorHome MH;
    public Truck (MotorHome m)
    {
        this.MH = m;
    }
    @Override
    public String getFrame() {
        return MH.type + " Frame: Bus";
    }
}