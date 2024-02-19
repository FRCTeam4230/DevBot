// Copyright 2021-2024 FRC 6328
// http://github.com/Mechanical-Advantage
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.AnalogSensor.AnalogSensor;
import frc.robot.AnalogSensor.AnalogSensorIOReal;
import frc.robot.DIOSensor.DIOSensor;
import frc.robot.DIOSensor.DIOSensorIOReal;

public class RobotContainer {
  private final AnalogSensor beamBreak = new AnalogSensor(new AnalogSensorIOReal(3), "beam break");
  private final DIOSensor touchSensor = new DIOSensor(new DIOSensorIOReal(2), "touch sensor");

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {}

  public Command getAutonomousCommand() {
    return null;
  }
}
