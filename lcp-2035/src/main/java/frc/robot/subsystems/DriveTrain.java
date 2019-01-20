package frc.robot.subsystems;

import frc.robot.RobotMap;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Joystick;

/**
 * drive train for the test bot.
 * 
 * @author Robbie Paul
 */
public class DriveTrain extends Subsystem {

    
    private DifferentialDrive drive;
	private CANSparkMax FLSpark;
	private CANSparkMax FRSpark;
	private CANSparkMax BLSpark;
	private CANSparkMax BRSpark;
	private SpeedControllerGroup RGroup;
	private SpeedControllerGroup LGroup;
	private Joystick jStick;
    public DriveTrain() {
    	super("Drive Train");  	
    	FLSpark = new CANSparkMax(RobotMap.FRONT_LEFT_CAN, MotorType.kBrushless);
		FRSpark= new CANSparkMax(RobotMap.FRONT_RIGHT_CAN, MotorType.kBrushless);
		BLSpark = new CANSparkMax(RobotMap.BACK_LEFT_CAN, MotorType.kBrushless);
		BRSpark = new CANSparkMax(RobotMap.BACK_RIGHT_CAN, MotorType.kBrushless);

		RGroup = new SpeedControllerGroup(FRSpark, BRSpark);
		LGroup = new SpeedControllerGroup(FLSpark, BLSpark);
		drive = new DifferentialDrive(LGroup, RGroup);

		jStick = new Joystick(RobotMap.JOYSTICK_ONE_USB);
		
	}
 


	@Override
	protected void initDefaultCommand() {

		
	}
	public void arcadeDrive() {
		drive.arcadeDrive(-jStick.getX(), -jStick.getY(), true);
	}
    
}