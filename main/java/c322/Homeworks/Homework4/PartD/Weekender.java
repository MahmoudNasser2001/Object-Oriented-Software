package c322.Homeworks.Homework4.PartD;

public class Weekender implements Style {

    MotorHome MH;
    public Weekender(MotorHome mH)
    {
        this.MH = mH;
    }

    @Override
    public String getStyle() {
        return MH.type + " Style: Off the Grid";
    }
}