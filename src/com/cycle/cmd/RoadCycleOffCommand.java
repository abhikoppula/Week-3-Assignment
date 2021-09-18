package com.cycle.cmd;

public class RoadCycleOffCommand implements Command{
    
	RoadCycleBell roadcycleOff;
	
	public RoadCycleOffCommand(RoadCycleBell roadcycleOff) {
		this.roadcycleOff = roadcycleOff;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		roadcycleOff.muteBell();
	}

}
