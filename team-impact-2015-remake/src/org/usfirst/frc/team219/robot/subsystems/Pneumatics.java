package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem{
	
	Compressor c;
	boolean enabled;
	boolean pressureSwitch;
	float current;
	
	public Pneumatics()	{
		c = RobotMap.c;
		enabled = c.enabled();
		pressureSwitch = c.getPressureSwitchValue();
		current = c.getCompressorCurrent();
	}

	@Override
	protected void initDefaultCommand() {
		c.setClosedLoopControl(true);
	}
}
