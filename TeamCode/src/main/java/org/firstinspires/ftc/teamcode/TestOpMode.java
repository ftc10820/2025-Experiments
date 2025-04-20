
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;


//
@TeleOp
public class TestOpMode extends LinearOpMode {
    private DcMotor slide = null;
    private TouchSensor slideLimit = null;
    private Servo claw = null;

    public void initialize() {
        slide = hardwareMap.get(DcMotor.class, "slide");
        //slideLimit = hardwareMap.get(TouchSensor.class, "slideLimit");
        claw = hardwareMap.get(Servo.class, "claw");
    }

    public void runOpMode() throws InterruptedException {

        initialize();

        // You must do this so the program does not start prematurely
        waitForStart();

        // Loops until the game is done
        while (opModeIsActive()) {
            telemetry.addData("Slide", slide.getCurrentPosition());
            //telemetry.addData("Slide Limit Touched", slideLimit.isPressed());
            telemetry.update();

            slide.setPower(-gamepad2.left_stick_y);
            if (gamepad2.a){
                claw.setPosition(0);
            }
            if (gamepad2.b){
                claw.setPosition(1);
            }

        }
    }
}

