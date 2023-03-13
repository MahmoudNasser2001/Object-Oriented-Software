package c322.Homeworks.Homework4.PartD;

public class Bus implements Frame{
    MotorHome MH;
    public Bus (MotorHome m)
    {
        this.MH = m;
    }
    @Override
    public String getFrame() {
        return MH.type + " Frame: Bus";
    }
}