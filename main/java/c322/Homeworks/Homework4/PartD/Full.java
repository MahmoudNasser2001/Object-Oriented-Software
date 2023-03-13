package c322.Homeworks.Homework4.PartD;

public class Full implements Kitchen{

    MotorHome MH;
    public Full (MotorHome m)
    {
        this.MH = m;
    }
    @Override
    public String getKitchen() {
        return MH.type + " Kitchen: Full";
    }
}