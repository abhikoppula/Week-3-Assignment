package com.cycle.cmd;

public class RoadCycleOnCommand implements Command {

    RoadCycleBell roadcycleOn;
	
	
	public RoadCycleOnCommand(RoadCycleBell roadcycleOn) {
		super();
		this.roadcycleOn = roadcycleOn;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		roadcycleOn.UnMuteBell();
	}

}
