package org.usfirst.frc.team3268.tshirt.commands;

import org.usfirst.frc.team3268.tshirt.OI;
import org.usfirst.frc.team3268.tshirt.Robot;
import org.usfirst.frc.team3268.tshirt.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class StandardDriveCommand extends Command {

    public StandardDriveCommand() {
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.driver.tankDrive(OI.rStick.getY(), OI.lStick.getY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.driver.tankDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
