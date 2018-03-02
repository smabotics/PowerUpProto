package org.usfirst.frc.team5493.robot.commands;

import org.usfirst.frc.team5493.robot.Robot;
import org.usfirst.frc.team5493.robot.utils.ButtonMonitor;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimbDown extends Command {

	private ButtonMonitor buttonMonitor;

	public ClimbDown(Button cmdButton) {
		requires(Robot.climber);
		buttonMonitor = new ButtonMonitor(cmdButton);
	}

	protected void initialize() {
	}

	protected void execute() {
		if (buttonMonitor.checkButtonState() == ButtonMonitor.ButtonState.Active) {
			Robot.climber.pullDown();
		}
	}

	protected boolean isFinished() {
		return buttonMonitor.checkButtonState() == ButtonMonitor.ButtonState.Inactive;
	}

	protected void end() {
		Robot.climber.end();
	}

	protected void interrupted() {
		end();
	}
}
