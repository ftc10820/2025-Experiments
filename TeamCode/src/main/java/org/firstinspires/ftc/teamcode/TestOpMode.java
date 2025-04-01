
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;


//
@TeleOp
public class TestOpMode extends LinearOpMode {
    public DcMotor slide = null;
    private TouchSensor slideLimit = null;

    public void initialize() {
        // TODO: Set up slide and slideLimit from hardwareMap
        // TODO: Configure slide settings
    }

    public void runOpMode() throws InterruptedException {

        initialize();

        // You must do this so the program does not start prematurely
        waitForStart();

        // Loops until the game is done
        while (opModeIsActive()) {
            telemetry.addData("Slide", slide.getCurrentPosition());
            telemetry.addData("Slide Limit Touched", slideLimit.isPressed());
            telemetry.update();

            if (gamepad2.dpad_up){
//                slide.setPosition(slide.getPosition() + .003);
            }
            else if (gamepad2.dpad_down) {
//                slide.setPosition(slide.getPosition() - .003);
            }
        }
    }
}

