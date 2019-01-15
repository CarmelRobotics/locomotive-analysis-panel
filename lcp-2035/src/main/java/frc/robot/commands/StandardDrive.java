package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;
import frc.robot.OI;
import edu.wpi.first.wpilibj.command.Command;

public class StandardDrive extends Command{

    private final DriveTrain THE_DRIVE_TRAIN;
    public static OI oi;
    
    public StandardDrive() {
        super("StandardDrive");
        THE_DRIVE_TRAIN = Robot.getDriveTrain();
        requires(THE_DRIVE_TRAIN);
    }
    
 // Called just before this Command runs the first time
    protected void initialize() {
        //DriveTrain.getCommandLog().setCommand(this.getName());
    	oi = new OI();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //DriveTrain.getCommandLog().setInputs("" + gyroball.getAngle());
        //DriveTrain.setMetaCommandOutputs();

        THE_DRIVE_TRAIN.arcadeDrive();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        //DRIVE.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    //
	
	

}