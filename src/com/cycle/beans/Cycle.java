package com.cycle.beans;

public abstract class Cycle {

    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void rideCycle();
	
	public abstract void getSpecs();
	
}
