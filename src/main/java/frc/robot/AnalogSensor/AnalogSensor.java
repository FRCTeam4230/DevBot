package frc.robot.AnalogSensor;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.littletonrobotics.junction.Logger;

public class AnalogSensor extends SubsystemBase {

  private final AnalogSensorIO sensorIO;
  private final AnalogSensorIOInputsAutoLogged sensorIOInputs =
      new AnalogSensorIOInputsAutoLogged();
  private final String descriptor;

  public AnalogSensor(AnalogSensorIO sensorIO, String descriptor) {
    this.sensorIO = sensorIO;
    this.descriptor = descriptor;
  }

  @Override
  public void periodic() {
    sensorIO.updateInputs(sensorIOInputs);
    Logger.processInputs("SensorInputs/" + descriptor, sensorIOInputs);
  }
}
