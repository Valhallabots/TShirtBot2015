package org.usfirst.frc.team3268.tshirt.subsystems;

import org.usfirst.frc.team3268.tshirt.commands.StandardDriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    
    public void initDefaultCommand() {
    	setDefaultCommand(new StandardDriveCommand());
    }
}

