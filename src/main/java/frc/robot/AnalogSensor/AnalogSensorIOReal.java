package frc.robot.AnalogSensor;

import edu.wpi.first.wpilibj.AnalogInput;

public class AnalogSensorIOReal implements AnalogSensorIO {
  private final AnalogInput sensor;

  public AnalogSensorIOReal(int port) {
    sensor = new AnalogInput(port);
  }

  @Override
  public void updateInputs(AnalogSensorIOInputs inputs) {
    inputs.value = sensor.getValue();
    inputs.voltage = sensor.getVoltage();
    inputs.channel = sensor.getChannel();
  }
}
