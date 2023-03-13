package c322.labs.Lab5;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	int Previous;
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
	public void undo() {
		if (Previous == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (Previous == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (Previous == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (Previous == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
