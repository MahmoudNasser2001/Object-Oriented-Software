package c322.Homeworks.Homework4.PartD;

public class OffGrid implements Style {
    MotorHome MH;
    public OffGrid(MotorHome m)
    {
        this.MH = m;
    }

    @Override
    public String getStyle() {
        return MH.type + " Style: Off the Grid";
    }
}