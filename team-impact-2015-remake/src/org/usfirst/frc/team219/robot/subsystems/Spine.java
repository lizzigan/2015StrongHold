package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;
import org.usfirst.frc.team219.robot.commands.*;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.RumbleType;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Spine extends Subsystem{
	Encoder spineEncoder;
	DigitalInput limitTop;
	DigitalInput limitBot;
	CANTalon spineTalon;

	public Spine()
	{
		spineTalon = RobotMap.spineTalon;
		spineEncoder = RobotMap.spineEncoder;
		limitTop = RobotMap.limitTop;
		limitBot = RobotMap.limitBot;

	}
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new MoveSpine());
	}

	public void controlSpine(Joystick stick)
	{
		if(limitTop.get() && stick.getY() < 0)
		{
			spineTalon.set(-stick.getY());
		}
		else if(limitBot.get() && stick.getY() > 0)
		{
			spineTalon.set(-stick.getY());
		}
		else
		{
			stick.setRumble(RumbleType.kLeftRumble, 1);
			stick.setRumble(RumbleType.kRightRumble, 1);
		}

	}

	public void stopSpine()
	{

	}

}
