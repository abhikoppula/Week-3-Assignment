package com.cycle.beans;

public class GearCycleFactory extends CycleAbstractFactory {

	@Override
	protected Cycle createCycle(String type,String name, String noOfgears,String bells) {
		Cycle cycle= null;
		if(type.equals("GearCycle")) {
			cycle = new GearCycle(name,bells,noOfgears);
			cycle.setName(name);
		}
		return cycle;
	}

}
