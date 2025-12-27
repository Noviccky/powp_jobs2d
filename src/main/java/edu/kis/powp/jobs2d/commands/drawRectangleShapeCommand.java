package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.drivers.DriverCommand;
import java.util.ArrayList;
import java.util.List;

public class drawRectangleShapeCommand {
    public static ComplexCommand drawRectangleCommand(int x, int y, int width, int height) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(SetPositionCommand(x, y));
        commands.add(OperateToCommand(x + width, y));
        commands.add(OperateToCommand(x + width, y + height));
        commands.add(OperateToCommand(x, y + height));
        commands.add(OperateToCommand(x, y));
        return new ComplexCommand(commands);
    }

    private static DriverCommand SetPositionCommand(int x, int y) {
        return new SetPositionCommand(x, y);
    }

    private static DriverCommand OperateToCommand(int x, int y) {
        return new OperateToCommand(x, y);
    }
}