package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Arms extends Subsystem {

	public Solenoid innerLeft; //big piston (inner)
	public Solenoid innerRight;
	public Solenoid outerLeft; //little piston (outer)
	public Solenoid outerRight;
	public int rightCycle;
	public int leftCycle;

	public Arms()	{
		innerLeft = RobotMap.innerLeft;
		innerRight = RobotMap.innerRight;
		outerLeft = RobotMap.outerLeft;
		outerRight = RobotMap.outerRight;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}

	public void cycleArms(Solenoid inner, Solenoid outer)	{
		if(!inner.get() && !outer.get())	{
			inner.set(true);
		}
		else if(inner.get() && !outer.get())	{
			outer.set(true);
		}
		else if(inner.get() && outer.get()){
			outer.set(false);
		}
		else	{
			inner.set(false);
		}
	}
	
}
