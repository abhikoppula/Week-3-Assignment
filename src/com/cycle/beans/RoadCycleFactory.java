package com.cycle.beans;

public class RoadCycleFactory extends CycleAbstractFactory {

	@Override
	protected Cycle createCycle(String type,String name, String noOfgears,String bells) {
		// TODO Auto-generated method stub
		Cycle cycle= null;
		if(type.equals("RoadCycle")) {
			cycle = new RoadCycle(name, bells,noOfgears);
			cycle.setName(name);
		}
		return cycle;
	}

}
