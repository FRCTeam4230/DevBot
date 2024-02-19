package frc.robot.DIOSensor;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DIOSensorIOReal implements DIOSensorIO {
  private final DigitalInput sensor;

  public DIOSensorIOReal(int port) {
    sensor = new DigitalInput(port);
    SmartDashboard.putData(sensor);
  }

  @Override
  public void updateInputs(DIOSensorIOInputs inputs) {
    inputs.triggered = sensor.get();
    inputs.isAnalogTrigger = sensor.isAnalogTrigger();
    inputs.channel = sensor.getChannel();
  }
}
