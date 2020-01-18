package org.usfirst.frc.team219.robot;


import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Solenoid;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon frontLeft;
	public static CANTalon backLeft;
	public static CANTalon frontRight;
	public static CANTalon backRight;
	public static RobotDrive driveTrain;
	public static Encoder spineEncoder;
	public static DigitalInput limitTop;
	public static DigitalInput limitBot;
	public static CANTalon spineTalon;
	public static Solenoid innerLeft;
	public static Solenoid innerRight;
	public static Solenoid outerLeft;
	public static Solenoid outerRight;
	public static Compressor c;
	
	public static void init()
	{
		frontLeft = new CANTalon(2);	//drive train
		backLeft = new CANTalon(4);
		frontRight = new CANTalon(1);
		backRight = new CANTalon(3);
		frontLeft.reverseOutput(true);
		driveTrain = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
		driveTrain.setInvertedMotor(MotorType.kFrontRight, true);
		driveTrain.setInvertedMotor(MotorType.kRearRight, true);
		
		spineTalon = new CANTalon(5);	//spine
		spineEncoder = new Encoder(8, 9, false, EncodingType.k4X);
		limitTop = new DigitalInput(0);
		limitBot = new DigitalInput(1);
		
		innerLeft = new Solenoid(6, 6);	//arms, big piston
		//innerRight = new Solenoid(6, f);
		outerLeft = new Solenoid(6, 7); //little piston
		//outerRight = new Solenoid(6, f);
		outerRight = new Solenoid(6,0);
		innerRight = new Solenoid(6,1);
		
		
		c = new Compressor(6);	//pneumatics
	}

}