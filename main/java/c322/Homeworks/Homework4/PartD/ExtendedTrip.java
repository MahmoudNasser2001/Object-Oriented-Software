package c322.Homeworks.Homework4.PartD;

public class ExtendedTrip implements Style{
    MotorHome MH;
    public ExtendedTrip(MotorHome m)
    {
        this.MH = m;
    }

    @Override
    public String getStyle() {
        return MH.type + " Style: Off the Grid";
    }
}