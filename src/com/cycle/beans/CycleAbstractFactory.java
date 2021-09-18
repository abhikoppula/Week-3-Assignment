package com.cycle.beans;

public abstract class CycleAbstractFactory {
	

	protected abstract Cycle createCycle(String type,String brand, String noOfgears,String bells);

    public Cycle rideCycle(String cycleType,String brand, String noOfgears,String bells) {
    	Cycle cycle = createCycle(cycleType, brand,  bells,noOfgears );
    	cycle.rideCycle();
    	cycle.getSpecs();
    	return cycle;
    }
}
