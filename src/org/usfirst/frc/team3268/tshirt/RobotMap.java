package org.usfirst.frc.team3268.tshirt;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class RobotMap {
	public static final SpeedController leftMotor = new Talon(0), rightMotor = new Talon(1);

	public static final RobotDrive driver = new RobotDrive(leftMotor, rightMotor);
}
