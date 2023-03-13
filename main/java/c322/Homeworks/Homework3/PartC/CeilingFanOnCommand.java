package c322.Homeworks.Homework3.PartC;
public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
