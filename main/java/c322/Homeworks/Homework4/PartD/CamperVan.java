package c322.Homeworks.Homework4.PartD;

public class CamperVan implements Frame {
    MotorHome MH;
    public CamperVan (MotorHome m)
    {
        this.MH = m;
    }

    @Override
    public String getFrame() {
        return MH.type + " Frame: Bus";
    }
}