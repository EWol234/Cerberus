// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2421.Cerberus;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Encoder roboSystemfrontLeftEnc;
    public static Encoder roboSystembackLeftEnc;
    public static Encoder roboSystemfrontRightEnc;
    public static CANJaguar roboSystemfrontLeft;
    public static CANJaguar roboSystembackLeft;
    public static CANJaguar roboSystemfrontRight;
    public static CANJaguar roboSystembackRight;
    public static CANJaguar roboSystemTote;
    public static CANJaguar roboSystemBin;
    public static Gyro roboSystemgyro;
    public static BuiltInAccelerometer roboSystemacc;
    
    public static double circumference = 6;
    public static double pulses_per_rev = 720;
    
    //public static Ultrasonic roboSystemUltrasonic1;
    public static Encoder roboSystembackRightEnc;
    //public static DigitalInput toteTop;
    //public static DigitalInput toteBottom;
    public static DigitalInput binTop;
    public static DigitalInput binBottom;
    
    public static AnalogInput ultraSonic;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        roboSystemfrontLeftEnc = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("roboSystem", "frontLeftEnc", roboSystemfrontLeftEnc);
        roboSystemfrontLeftEnc.setDistancePerPulse((Math.PI*circumference)/pulses_per_rev);
        roboSystemfrontLeftEnc.setPIDSourceParameter(PIDSourceParameter.kRate);
        
        roboSystembackLeftEnc = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("roboSystem", "backLeftEnc", roboSystembackLeftEnc);
        roboSystembackLeftEnc.setDistancePerPulse((Math.PI*circumference)/pulses_per_rev);
        roboSystembackLeftEnc.setPIDSourceParameter(PIDSourceParameter.kRate);
        
        roboSystemfrontRightEnc = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("roboSystem", "frontRightEnc", roboSystemfrontRightEnc);
        roboSystemfrontRightEnc.setDistancePerPulse((Math.PI*circumference)/pulses_per_rev);
        roboSystemfrontRightEnc.setPIDSourceParameter(PIDSourceParameter.kRate);        

        roboSystembackRightEnc = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("roboSystem", "backRightEnc", roboSystembackRightEnc);
        roboSystembackRightEnc.setDistancePerPulse((Math.PI*circumference)/pulses_per_rev);
        roboSystembackRightEnc.setPIDSourceParameter(PIDSourceParameter.kRate);
        
        roboSystemfrontLeft = new CANJaguar(23); 
        roboSystembackLeft = new CANJaguar(15);
        roboSystemfrontRight = new CANJaguar(5);
        roboSystembackRight = new CANJaguar(22);
        
        roboSystemgyro = new Gyro(0);
        LiveWindow.addSensor("roboSystem", "gyro", roboSystemgyro);
        roboSystemgyro.setSensitivity(0.007);
        
        roboSystemacc = new BuiltInAccelerometer();
        LiveWindow.addSensor("roboSystem", "acc", roboSystemacc);
        
        //roboSystemUltrasonic1 = new Ultrasonic(0, 1);
        //LiveWindow.addSensor("roboSystem", "Ultrasonic 1", roboSystemUltrasonic1);  
        ultraSonic = new AnalogInput(0);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        //toteTop = new DigitalInput(8);
        //toteBottom = new DigitalInput(9);
        binTop = new DigitalInput(8);
        binBottom = new DigitalInput(9);
        roboSystemTote = new CANJaguar(24);
        roboSystemBin = new CANJaguar(21);
        
    }
}
