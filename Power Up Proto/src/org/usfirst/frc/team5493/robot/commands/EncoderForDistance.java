package org.usfirst.frc.team5493.robot.commands;

import org.usfirst.frc.team5493.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class EncoderForDistance extends Command {
	
	private double target;
	private double speed;
	private boolean goForward;

    public EncoderForDistance(double distance, boolean forward) {
          requires(Robot.driveBase);
          if(forward)
        	  target = distance;
          else
        	  target = -distance;
          goForward = forward;
          
        
    }

    // Called just before this Command runs the first time
    protected void initialize() { 
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	Robot.driveBase.tankDrive(speed, speed, 0, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
