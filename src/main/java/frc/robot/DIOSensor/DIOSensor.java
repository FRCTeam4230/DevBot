package frc.robot.DIOSensor;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.littletonrobotics.junction.Logger;

public class DIOSensor extends SubsystemBase {

  private final DIOSensorIO sensorIO;
  private final DIOSensorIOInputsAutoLogged sensorIOInputs = new DIOSensorIOInputsAutoLogged();
  private final String descriptor;

  public DIOSensor(DIOSensorIO sensorIO, String descriptor) {
    this.sensorIO = sensorIO;
    this.descriptor = descriptor;
  }

  @Override
  public void periodic() {
    sensorIO.updateInputs(sensorIOInputs);
    Logger.processInputs("SensorInputs/" + descriptor, sensorIOInputs);
  }
}
