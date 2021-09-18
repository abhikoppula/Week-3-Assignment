package com.cycle.beans;

public class RoadCycle extends Cycle {
	private String brand;
	private String bells;
	private String noofGears;
 
	
	public RoadCycle(String brand, String bells, String noofGears) {
		this.brand = brand;
		this.bells = bells;
		this.noofGears = noofGears;
	}


	public String getName() {
		return brand;
	}


	public void setName(String name) {
		this.brand = name;
	}


	public String getBells() {
		return bells;
	}


	public void setBells(String bells) {
		this.bells = bells;
	}


	public String getNoofGears() {
		return noofGears;
	}


	public void setNoofGears(String noofGears) {
		this.noofGears = noofGears;
	}


	@Override
	public void rideCycle() {
		// TODO Auto-generated method stub
		System.out.println("Ride Cycle without gear ");
	}


	@Override
	public void getSpecs() {
		// TODO Auto-generated method stub
		System.out.println("Specs of the Riding Cycle ");
		System.out.println("Brand "+brand);
	    System.out.println("Bells "+bells);
	    System.out.println("Number of Gears "+noofGears);
	}

}
