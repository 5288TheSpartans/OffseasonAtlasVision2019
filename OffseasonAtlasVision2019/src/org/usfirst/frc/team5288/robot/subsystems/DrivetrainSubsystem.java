package org.usfirst.frc.team5288.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DrivetrainSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Joystick j1 = new Joystick(0);
	Joystick j2 = new Joystick(1);
	
	private VictorSP leftMotor1 = new VictorSP(0);
	private VictorSP leftMotor2 = new VictorSP(1);
	private VictorSP rightMotor1 = new VictorSP(2);
	private VictorSP rightMotor2 = new VictorSP(3);
	
	private Spark leftIntakeMotor = new Spark(7);
	private Spark rightIntakeMotor = new Spark(8);
	private TalonSRX liftMotor = new TalonSRX(0);
	
	private JoystickButton j1B1 = new JoystickButton(j1, 1);
	private JoystickButton j2B1 = new JoystickButton(j2, 1);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void foreverUpdate() {
    	leftMotor1.set(-j1.getY());
    	leftMotor2.set(-j1.getY());
    	rightMotor1.set(j2.getY());
    	rightMotor2.set(j2.getY());
    	if(j1B1.get()) {
    		leftIntakeMotor.set(1.0);
    		rightIntakeMotor.set(-1.0);
    	}
    	else {
    		leftIntakeMotor.set(0);
    		rightIntakeMotor.set(0);
    	}
    	if(j2B1.get()) {
    		leftIntakeMotor.set(1.0);
    		rightIntakeMotor.set(-1.0);
    	} else {
    		leftIntakeMotor.set(0);
    		rightIntakeMotor.set(0);
    	}
    	
    }
    
    
}

