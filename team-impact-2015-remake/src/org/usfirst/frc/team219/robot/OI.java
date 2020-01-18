package org.usfirst.frc.team219.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team219.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * OI stands for operator interface
 */
public class OI 
{
	public Joystick stick;
	public Joystick spineController;
	public Button a;
	public Button b;
	public OI()
	{
		stick = new Joystick(0);
		spineController = new Joystick(1);
		a = new JoystickButton(stick, 1);
		a.whenPressed(new MongArms(Robot.arms.innerRight, Robot.arms.outerRight));
		b = new JoystickButton(stick, 2);
		b.whenPressed(new MongArms(Robot.arms.innerLeft, Robot.arms.outerLeft));

	}
}