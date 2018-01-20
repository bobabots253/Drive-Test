// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.driveTest.subsystems;

import org.usfirst.frc253.driveTest.RobotMap;
import org.usfirst.frc253.driveTest.commands.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftFront = RobotMap.driveTrainLeftFront;
    private final TalonSRX leftBack = RobotMap.driveTrainLeftBack;
    private final SpeedController rightFront = RobotMap.driveTrainRightFront;
    private final TalonSRX rightBack = RobotMap.driveTrainRightBack;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain(){
    	leftBack.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1, 10); 
		leftBack.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
		
		rightBack.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1, 10); 
		rightBack.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 10);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new TankDrive());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public TalonSRX getTalonRight(){
    	return rightBack;
    }
    
    public TalonSRX getTalonLeft(){
    	return leftBack;
    }
    
    public void drive(double left, double right){
    	leftFront.set(-left);
    	leftBack.set(ControlMode.PercentOutput, -left);
    	rightFront.set(right);
    	rightBack.set(ControlMode.PercentOutput, right);
    }
}

