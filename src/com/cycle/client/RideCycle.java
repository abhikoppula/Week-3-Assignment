package com.cycle.client;

import com.cycle.beans.Cycle;
import com.cycle.beans.CycleAbstractFactory;
import com.cycle.beans.GearCycleFactory;
import com.cycle.beans.RoadCycleFactory;
import com.cycle.cmd.GearCycleBell;
import com.cycle.cmd.GearCycleOffCommand;
import com.cycle.cmd.GearCycleOnCommand;
import com.cycle.cmd.RemoteControl;
import com.cycle.cmd.RoadCycleBell;
import com.cycle.cmd.RoadCycleOffCommand;
import com.cycle.cmd.RoadCycleOnCommand;

public class RideCycle {
	
	
	public static void main(String[] args) {
		
		CycleAbstractFactory roadCycle = new RoadCycleFactory();
		CycleAbstractFactory gearCycle = new GearCycleFactory();
		
		Cycle rideWithGear = gearCycle.rideCycle("GearCycle", "Hercules", "Clapper Bells ", "5");
		System.out.println();
		Cycle rideWithOutGear = roadCycle.rideCycle("RoadCycle", "Hercules", "Electric Bells ", "0");
		
		//Command pattern 
		System.out.println();
		System.out.println("********Command Pattern to mute and UnMute the Bells***********");
		RemoteControl control = new RemoteControl();
		RoadCycleBell roadCycleBell = new RoadCycleBell();
	    GearCycleBell gearCycleBell = new GearCycleBell();
	    
	    control.setCommand(new RoadCycleOnCommand(roadCycleBell));
	    control.pressButton();
	    
	    control.setCommand(new RoadCycleOffCommand(roadCycleBell));
	    control.pressButton();
	    
	    control.setCommand(new GearCycleOnCommand(gearCycleBell));
	    control.pressButton();
	    
	    control.setCommand(new GearCycleOffCommand(gearCycleBell));
	    control.pressButton();

		
	}

}
