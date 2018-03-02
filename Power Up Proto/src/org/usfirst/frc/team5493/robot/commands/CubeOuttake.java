package org.usfirst.frc.team5493.robot.commands;

import org.usfirst.frc.team5493.robot.Robot;
import org.usfirst.frc.team5493.robot.utils.ButtonMonitor;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CubeOuttake extends Command {

	private ButtonMonitor buttonMonitor;

	public CubeOuttake(Button cmdButton) {
		requires(Robot.cubeControls);
		buttonMonitor = new ButtonMonitor(cmdButton);
	}

	protected void initialize() {
		
	}

	protected void execute() {
		if (buttonMonitor.checkButtonState() == ButtonMonitor.ButtonState.Active) {
			Robot.cubeControls.outtake();
		}
	}

	protected boolean isFinished() {
		return buttonMonitor.checkButtonState() == ButtonMonitor.ButtonState.Inactive;
	}

	protected void end() {
		Robot.cubeControls.end();
	}

	protected void interrupted() {
		end();
	}
}
