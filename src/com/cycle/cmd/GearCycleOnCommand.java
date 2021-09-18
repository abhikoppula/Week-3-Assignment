package com.cycle.cmd;

public class GearCycleOnCommand implements Command {
	
	GearCycleBell gearCycleBellOn;

	
	public GearCycleOnCommand(GearCycleBell gearCycleBellOn) {
		this.gearCycleBellOn = gearCycleBellOn;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gearCycleBellOn.UnMuteBell();
	}
	
	
	

}
