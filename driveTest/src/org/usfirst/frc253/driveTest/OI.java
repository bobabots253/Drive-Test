// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.driveTest;

import org.usfirst.frc253.driveTest.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import org.usfirst.frc253.driveTest.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    /*public Joystick leftJoystick;
    public Joystick rightJoystick;*/
	public XboxController controller;
    public JoystickButton Bawb;
    public JoystickButton Bawb2;
    public JoystickButton Bawb3;
    public JoystickButton Intake;
    public JoystickButton Eject;
    //public JoystickButton Bawb4;
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        controller = new XboxController(0);
        
        
       
       Intake = new JoystickButton(controller, 6);
       Intake.whileHeld(new SuckIn());
       
       Eject = new JoystickButton(controller, 5);
       Eject.whileHeld(new EjectOut());
       
        
        Bawb = new JoystickButton(controller, 1);
        Bawb.whileHeld(new StraightDrive(0.1, 0, 0));
        
        Bawb2 = new JoystickButton(controller, 3);
        Bawb2.whenPressed(new PathArray());
        
        /*Bawb3 = new JoystickButton(controller, 4);
        Bawb3.whileHeld(new ResetStraightDrive());*/
        
        
        SmartDashboard.putData(new PathArray());

        // SmartDashboard Buttons
        SmartDashboard.putData(new ResetStraightDrive());
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("TankDrive", new TankDrive());

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    /*public Joystick getLeftJoystick() {
        return leftJoystick;*/
    public double getLeftJoystickY(){
    	return controller.getY(GenericHID.Hand.kLeft)*0.90;
    }
    public double getRightJoystickX(){
    	return controller.getX(GenericHID.Hand.kRight)*0.90;
    }
       
    /*public Joystick getRightJoystick() {
        return rightJoystick;
    }
    public XboxController controller(){
    	controller = new XboxController(0);
    }*/
}

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS


