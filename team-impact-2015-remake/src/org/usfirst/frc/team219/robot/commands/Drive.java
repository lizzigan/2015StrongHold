package org.usfirst.frc.team219.robot.commands;

import org.usfirst.frc.team219.robot.Robot;
import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command{
	public Drive()
	{
		requires(Robot.driveTrain);
	}
	@Override
	protected void initialize() {
		
	}
	@Override
	protected void execute() {
		Robot.driveTrain.MecanumDrive(Robot.oi.stick);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {


	}

}
