package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * drive train for the test bot.
 * 
 * @author Robbie Paul
 */
public class DriveTrain extends Subsystem {

    
    private DifferentialDrive drive;
	private CANSparkMax spark1;


    public DriveTrain() {
    	super("Drive Train");  	
    	spark1= new CANSparkMax(0, MotorType.kBrushless);
    	
    }

	@Override
	protected void initDefaultCommand() {

		
	}
	public void arcadeDrive() {
		spark1.set(1.0);
	}
    
}