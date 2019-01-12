package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * drive train for the test bot.
 * 
 * @author Robbie Paul
 */
public class DriveTrain extends Subsystem {

    private static Joystick stick;
    private SpeedController motorFLeft;
    private SpeedController motorBLeft;
    //private SpeedController motorFRight;
    //private SpeedController motorBRight;
    //private SpeedControllerGroup motorLeft;
    //private SpeedControllerGroup motorRight;
    private DifferentialDrive drive;
        
    public DriveTrain() {
    	super("Drive Train");
    	stick = new Joystick(1);
    	motorFLeft = new VictorSP(0);
    	motorBLeft = new VictorSP(1);
    	//motorFRight = new Talon(3);
    	//motorBRight = new VictorSP(4);
    	
    	//motorLeft = new SpeedControllerGroup(motorFLeft, motorBLeft);
    	//motorRight = new SpeedControllerGroup(motorFRight, motorBRight);
    	
    	drive = new DifferentialDrive(motorFLeft, motorBLeft);
    	
    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void arcadeDrive() {
		drive.arcadeDrive(-stick.getY(), -stick.getX(), true);
	}
    
}