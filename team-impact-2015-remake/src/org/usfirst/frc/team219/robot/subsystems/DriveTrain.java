package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;
import org.usfirst.frc.team219.robot.commands.*;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends Subsystem{
	RobotDrive robotDrive = RobotMap.driveTrain;

	public DriveTrain()
	{
		
	}
	
	/**Makes the default command of the robot drive */
	@Override
	protected void initDefaultCommand() 
	{
		setDefaultCommand(new Drive());
	}

	/**Drives the robot with an xbox 360 controller 
	 * @param stick The controller you're using*/
	public void MecanumDrive(Joystick stick)
	{
		double magnitude = stick.getMagnitude();
		if(Math.abs(stick.getMagnitude()) <= .2){
			magnitude = 0;
		}
			
		robotDrive.mecanumDrive_Polar(magnitude,stick.getDirectionDegrees(),stick.getRawAxis(4));
	}

	/**stops the robot */
	public void stop()
	{
		robotDrive.mecanumDrive_Cartesian(0, 0, 0, 0);
	}
}