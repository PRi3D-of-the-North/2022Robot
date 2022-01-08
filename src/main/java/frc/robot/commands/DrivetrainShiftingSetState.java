package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainShifting;

public class DrivetrainShiftingSetState extends CommandBase {
  private final DrivetrainShifting mDrivetrainShifting;
  private boolean mHighGear;
  
  public DrivetrainShiftingSetState(DrivetrainShifting drivetrainShifting, boolean highGear) {
    mDrivetrainShifting = drivetrainShifting;
    mHighGear = highGear;
    addRequirements(drivetrainShifting);
  }

  @Override
  public void initialize() {
    mDrivetrainShifting.setPistonsState(mHighGear);
  }

  @Override
  public void execute() {
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
