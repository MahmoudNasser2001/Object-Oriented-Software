package c322.Homeworks.Homework5.PartB;

public class ControlBox {
    private final SliderMin sliderMin;
    private final SliderMax sliderMax;
    private PoweredOn poweredOn;
    private SliderValue sliderValue;

    public ControlBox(SliderMin sliderMin, SliderMax sliderMax) {
        this.sliderMin = sliderMin;
        this.sliderMax = sliderMax;
        this.poweredOn = new PoweredOn(false);
        this.sliderValue = new SliderValue(0);
    }

    public void turnOn() {
        this.poweredOn = new PoweredOn(true);
    }

    public void turnOff() {
        this.poweredOn = new PoweredOn(false);
    }

    public int getSliderMinValue() {
        return this.sliderMin.getValue();
    }

    public int getSliderMaxValue() {
        return this.sliderMax.getValue();
    }

    public void setSliderValue(int value) {
        this.sliderValue = new SliderValue(value);
    }

    public int getSliderValue() {
        return this.sliderValue.getValue();
    }
}