package com.cycle.cmd;

public class GearCycleOffCommand implements Command {

    GearCycleBell gearCycleOff;
    
    
    
	
	public GearCycleOffCommand(GearCycleBell gearCycleOff) {
		this.gearCycleOff = gearCycleOff;
	}




	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gearCycleOff.muteBell();
	}

}
