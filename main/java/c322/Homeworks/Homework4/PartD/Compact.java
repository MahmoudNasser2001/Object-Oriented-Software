package c322.Homeworks.Homework4.PartD;

public class Compact implements Kitchen{

    MotorHome MH;
    public Compact (MotorHome m)
    {
        this.MH = m;
    }
    @Override
    public String getKitchen() {
        return MH.type + " Kitchen: Compact";
    }
}