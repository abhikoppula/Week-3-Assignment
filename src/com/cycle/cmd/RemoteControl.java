package com.cycle.cmd;

public class RemoteControl {
	
	Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		// TODO Auto-generated method stub
		command.execute();
	}
	
	

}
